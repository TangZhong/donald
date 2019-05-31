package cels.service;
import cels.entity.BaseTerm;
import cels.entity.TestRecord;
import cels.exceptions.NoTestRecordException;

import java.util.List;

/**
 * Created by donald.tang on 2019/5/30.
 */
public interface ITestingService {

    List<BaseTerm> generateTestingData(int var1);

    void saveTestRecord(TestRecord var1);

    List<TestRecord> reviewTestRecord() throws NoTestRecordException;

}
