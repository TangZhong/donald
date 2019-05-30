package main.java.cels.service.impl;

import main.java.cels.dao.IBaseTermDao;
import main.java.cels.dao.impl.BaseTermDaoImpl;
import main.java.cels.entity.BaseTerm;
import main.java.cels.entity.TestRecord;
import main.java.cels.exceptions.NoTestRecordException;
import main.java.cels.service.ITestingService;

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
    public void saveTestRecord(TestRecord var1) {

    }

    @Override
    public List<TestRecord> reviewTestRecord() throws NoTestRecordException {
        return null;
    }
}
