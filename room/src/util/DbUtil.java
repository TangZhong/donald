package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;
import util.PropertiesUtil;

public class DbUtil {

	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://10.199.245.40:3306/room";
//	public static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/room";
	public static final String JDBC_USERNAME = "root";
	public static final String JDBC_PASSWORD = "123456";
//	public static final String JDBC_PASSWORD = "root";

	public static Connection getCon() {

		Connection con = null;

		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		try {
			dbUtil.getCon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("no");
			e.printStackTrace();
		}
	}
}
