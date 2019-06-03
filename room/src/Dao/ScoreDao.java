package Dao;

import Bean.Record;
import Bean.RecordCondition;
import Bean.Score;
import util.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScoreDao {

    public boolean saveScore(Score score){

        Connection connection = DbUtil.getCon();

        try {
            PreparedStatement ps = connection.prepareStatement("insert into score(udorm,uhouse,score) values(?,?,?)");

            ps.setString(1,score.getUdorm());
            ps.setString(2,score.getUhouse());
            ps.setInt(3, Integer.parseInt(score.getScore()));

            return ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public List<Score> searchScores(Score condition){

        List<Score> result = new ArrayList<>();

        String sql = "select * from score where 1 = 1";

        StringBuffer sb = new StringBuffer(sql);

        if(condition.getUdorm() != null){
            sb.append(" and udorm = '" + condition.getUdorm() + "'");
        }

        if(condition.getUhouse() != null){
            sb.append(" and uhouse = '" + condition.getUhouse() + "'");
        }

        Connection connection = DbUtil.getCon();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sb.toString());
            System.out.println("search score sql:" + sb);
            while(rs.next()){
                Score score = new Score();
                score.setUdorm(rs.getString("udorm"));
                score.setUhouse(rs.getString("uhouse"));
                score.setScore(rs.getString("score"));
                result.add(score);
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


