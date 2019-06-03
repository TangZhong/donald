package Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBBean {

		public static String dbms_name="root";
		public static String dbms_password="123456";
		public static String dbms_conn="jdbc:mysql://10.199.245.40:3306/room";
		private Connection conn=null;
		private Statement stmt=null;
		private ResultSet rs=null;
		
		static {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				}catch(ClassNotFoundException ce){
					ce.printStackTrace();
				}
		}
		
		public Connection getConn(){
			try{
				conn=DriverManager.getConnection(dbms_conn, dbms_name,  dbms_password);
			}catch(SQLException se){
				se.printStackTrace();
			}
			return conn;
		}
		
		public Statement creatStmt(){
			try{
				stmt=conn.createStatement();
			}catch(SQLException se){
				se.printStackTrace();
			}
			return stmt;
		}
		
		public ResultSet executeQ(String sql){
			try{
				rs=stmt.executeQuery(sql);
			}catch(SQLException se){
				se.printStackTrace();
			}
			return rs;
		}
		
		public int executeU(String sql){
			int iMark=0;
			try{
				iMark=stmt.executeUpdate(sql);
			}catch(SQLException se){
				se.printStackTrace();
			}
			return iMark;
		}
		
		public void close(){
		try{if(rs!=null)rs.close();}catch(SQLException se){se.printStackTrace();};
		try{if(stmt!=null)stmt.close();}catch(SQLException se){se.printStackTrace();};
		try{if( conn!=null) conn.close();}catch(SQLException se){se.printStackTrace();};
	}
}
