package main.java.cels.dao;

import main.java.cels.entity.TestRecord;

import java.util.List;

/**
 * Created by donald.tang on 2019/5/30.
 */
public interface ITestRecordDao {

    void write(List<TestRecord> records,String fileName);

    List<TestRecord> read(String fileName);

}
