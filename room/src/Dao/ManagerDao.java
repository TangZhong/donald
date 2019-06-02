package Dao;

import Bean.DBBean;

public class ManagerDao {
	 /*****更改管理员密码******/
	  public boolean managermodifyPass(String mname,String mpass){
			boolean mark=false;
			DBBean db=new DBBean();
		      int rs=0;
			try{
				db.getConn();
				db.creatStmt();
				String sql="update manager set mpass='"+mpass+"' where mname='"+mname+"'";	
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
