package Dao;

import Bean.DBBean;

public class AdminDao {
	
	  /*****更改管理员密码******/
	  public boolean adminmodifyPass(String aname,String apass){
			boolean mark=false;
			DBBean db=new DBBean();
		      int rs=0;
			try{
				db.getConn();
				db.creatStmt();
				String sql="update admin set apass='"+apass+"' where aname='"+aname+"'";	
				rs=db.executeU(sql);
				if(rs!=0){
					mark=true;
				}
			}finally{
				   db.close();
			}
			return mark;
		}
}
