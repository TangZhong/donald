package main.java.cels.service;

import main.java.cels.entity.BaseTerm;
import main.java.cels.entity.TestRecord;
import main.java.cels.exceptions.NoTestRecordException;

import java.util.List;

/**
 * Created by donald.tang on 2019/5/30.
 */
public interface ITestingService {
    String TESTING_DIR = "datas/testing";
    String TESTING_RECORD_FILE = "test_records.rec";

    List<BaseTerm> generateTestingData(int var1);

    void saveTestRecord(TestRecord var1);

    List<TestRecord> reviewTestRecord() throws NoTestRecordException;

}
