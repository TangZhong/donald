package cels.service.impl;

import cels.Constant;
import cels.dao.IBaseTermDao;
import cels.dao.impl.BaseTermDaoImpl;
import cels.entity.BaseTerm;
import cels.entity.TestRecord;
import cels.exceptions.NoTestRecordException;
import cels.service.ITestingService;
import cels.util.IOUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class TestingServiceImpl implements ITestingService {

    private IBaseTermDao termDao;

    public TestingServiceImpl() {
        termDao = new BaseTermDaoImpl();
    }

    @Override
    public List<BaseTerm> generateTestingData(int size) {

        List<BaseTerm> allData = new ArrayList<>();

        //load all data
        allData.addAll(termDao.readWordFile());
        allData.addAll(termDao.readVocabularyFile());

        //choose data random in size
        Collections.shuffle(allData);

        return allData.subList(0,size);
    }

    @Override
    public void saveTestRecord(TestRecord record) {

        List<TestRecord> newRecords = null;
        File recordFile = new File(Constant.TEST_RECORD_FILE);
        if(recordFile.exists()) {
            try {
                newRecords = (List<TestRecord>) IOUtil.readObject(recordFile);
                newRecords.add(record);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            newRecords = new ArrayList();
            newRecords.add(record);
        }

        try {
            IOUtil.write(Constant.TEST_RECORD_FILE, newRecords);
        } catch (Exception e) {
            System.out.println("测试记录写入失败.");
            e.printStackTrace();
        }

    }

    @Override
    public List<TestRecord> reviewTestRecord() throws NoTestRecordException {

            File recordFile = new File(Constant.TEST_RECORD_FILE);
            if(!recordFile.exists()) {
                throw new NoTestRecordException("你还没有过测试的历史记录.");
            } else {
                try {
                    return (List<TestRecord>) IOUtil.readObject(recordFile);
                } catch (Exception var4) {
                    System.out.println("读取数据失败...");
                    var4.printStackTrace();
                    return null;
                }
            }
    }
}
