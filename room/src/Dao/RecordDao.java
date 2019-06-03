package Dao;

import Bean.Record;
import Bean.RecordCondition;
import util.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecordDao {

    public boolean deleteRecord(int id){
        Connection connection = DbUtil.getCon();

        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("delete from record where id = " + id);

            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(ps != null)
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return false;
    }

    public boolean saveRecord(Record record){

        Connection connection = DbUtil.getCon();

        try {
            PreparedStatement ps = connection.prepareStatement("insert into record(usernumber,date,detail) values(?,?,?)");

            ps.setString(1,record.getUsernumber());
            ps.setString(2,record.getDate());
            ps.setString(3,record.getDetail());

            return ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public List<Record> searchRecords(RecordCondition condition){

        List<Record> result = new ArrayList<>();

        String sql = "select * from record r,user u where r.usernumber = u.unumber";

        StringBuffer sb = new StringBuffer(sql);

        if(condition.getStartDate() != null){
            sb.append(" and r.date >= " + condition.getStartDate());
        }

        if(condition.getEndDate() != null){
            sb.append(" and r.date <= " + condition.getEndDate());
        }

        if(condition.getUname() != null){
            sb.append(" and u.uname = " + condition.getUname());
        }

        if(condition.getUsernumber() != null){
            sb.append(" and r.usernumber = " + condition.getUsernumber());
        }

        if(condition.getUdorm() != null){
            sb.append(" and u.udorm = " + condition.getUdorm());
        }

        Connection connection = DbUtil.getCon();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sb.toString());

            while(rs.next()){
                Record record = new Record();
                record.setUsername(rs.getString("uname"));
                record.setUserdorm(rs.getString("udorm"));
                record.setDate(rs.getString("date"));
                record.setDetail(rs.getString("detail"));
                record.setUserhouse(rs.getString("uhouse"));
                record.setRecordId(rs.getInt("id"));
                result.add(record);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null)
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if(statement != null)
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }

        return result;
    }

}


