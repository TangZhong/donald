package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import Bean.DBBean;
import Bean.FeeBean;
import Bean.UserBean;

public class UserDao {
	/*****按姓名检索用户******/
	public boolean findByName(String uname){
		boolean mark=false;
		DBBean db=new DBBean();
		ResultSet rs=null;
		try{
			db.getConn();
			db.creatStmt();
			String sql="select uname from user where uname='"+uname+"'";
			rs=db.executeQ(sql);
			if(rs.next()){
				mark=true;
			}

		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			   db.close();
		}
		return mark;
	}
	
	/******用户名和密码是否正确*****/
	public boolean findByNameAndPass(String uname,String upass,int uidentity ){
	
		boolean mark=false;
		DBBean db=new DBBean();
		ResultSet rs=null;
		try{
			
			db.getConn();
			db.creatStmt();
			String sql="select uname,upass from user where uname='"+uname+"'and upass='"+upass+"'and uidentity='"+uidentity+"'";
			System.out.println(sql);
			rs=db.executeQ(sql);
			if(rs.next()){
				mark=true;
			}

		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			   db.close();
		}
		return mark;
	}
	/******添加用户*****/

	public boolean addUser(UserBean user){
		int mark=0;
		DBBean db=new DBBean();
	     Connection conn=db.getConn();
	     String sql="insert into user (uname,upass,udorm,uhouse,unumber,uidentity,uclass,ubed,usex,utel) values (?,?,?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, user.getUname());
	        pstmt.setString(2, user.getUpass());
	        pstmt.setString(3, user.getUdorm());
	        pstmt.setString(4, user.getUhouse());
	        pstmt.setString(5, user.getUnumber());
	        pstmt.setBoolean(6, user.isUidentity());
	        pstmt.setString(7, user.getUclass());
	        pstmt.setString(8, user.getUbed());   
	        pstmt.setBoolean(9, user.isUsex());
	        pstmt.setString(10, user.getUtel());
            mark=pstmt.executeUpdate();
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			   db.close();
		}
		return mark>0?true:false;
	}
	
	
	
	/******查看个人信息*****/
	  public UserBean findUserInfo (String uname) {
		  UserBean user=new UserBean();
		  DBBean db=new DBBean();
		  db.getConn();
		  db.creatStmt();
		   String sql="select uid,bed,uname,upass,usex,uclass,utel,udorm,unumber from user where uname='"+uname+"'";
		   ResultSet rs=db.executeQ(sql);
		   try{
			   if(rs.next()){
				   user.setUid(rs.getString("uid"));
				   user.setUbed(rs.getString("ubed"));
				   user.setUname(rs.getString("uname"));
				   user.setUsex(rs.getBoolean("usex"));
				   user.setUnumber(rs.getString("unumber"));
				   user.setUclass(rs.getString("uclass"));
				   user.setUclass(rs.getString("udorm"));
				   user.setUclass(rs.getString("ubed"));
				   user.setUtel(rs.getString("utel"));
			   }else{
				   user=null;
			   }
			   
		   }catch(SQLException se){
			   se.printStackTrace();
		   }
		   db.close();
		   return user;
		   
	   }
	  
	  /*****个人更改个人信息******/
	  public boolean updateuser(UserBean user){
		  int mark=0;
		  DBBean db=new DBBean();
			Connection conn=db.getConn();
		     String sql="update user set ubed=?,usex=?,unumber=?,uclass=?,udorm=?,utel=?,uhouse=? where uname=?";	
		     try{
					PreparedStatement pstmt=conn.prepareStatement(sql);
					 
				        pstmt.setString(1, user.getUbed());				        
				        pstmt.setBoolean(2, user.isUsex());
				        pstmt.setString(3, user.getUnumber());
				        pstmt.setString(4, user.getUclass());
				        pstmt.setString(5, user.getUdorm());
				        pstmt.setString(6, user.getUtel());
				        pstmt.setString(7, user.getUhouse());
				        pstmt.setString(8, user.getUname());
		            mark=pstmt.executeUpdate();
				}catch(SQLException se){
					se.printStackTrace();
				}finally{
					   db.close();
				}
				return mark>0?true:false;
			}
	  
	  /*****寝室长更改寝室成员信息******/
	  public boolean updateqsz(UserBean user){
		  int mark=0;
		  DBBean db=new DBBean();
			Connection conn=db.getConn();
		     String sql="update user set ubed=?,usex=?,unumber=?,uclass=?,utel=? where uname=?";	
		     try{
					PreparedStatement pstmt=conn.prepareStatement(sql);
					 
				        pstmt.setString(1, user.getUbed());
				        
				        pstmt.setBoolean(2, user.isUsex());
				        pstmt.setString(3, user.getUnumber());
				        pstmt.setString(4, user.getUclass());
				        pstmt.setString(5, user.getUtel());
				        pstmt.setString(6, user.getUname());
		            mark=pstmt.executeUpdate();
				}catch(SQLException se){
					se.printStackTrace();
				}finally{
					   db.close();
				}
				return mark>0?true:false;
			}
	  
	  
	  /*****更改个人密码******/
	  public boolean modifyPass(String uname,String upass){
			boolean mark=false;
			DBBean db=new DBBean();
		      int rs=0;
			try{
				db.getConn();
				db.creatStmt();
				String sql="update user set upass='"+upass+"' where uname='"+uname+"'";	
				rs=db.executeU(sql);
				if(rs!=0){
					mark=true;
				}
			}finally{
				   db.close();
			}
			return mark;
		}
	
	  //*****判断用户名和密码是否正确*****/
	/*public String CheckLogin(String uname, String upass){
		String id = null;
		String sql="select uname,upass from user where uname='"+uname+"'and upass='"+upass+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBBean().getConn();
		try{
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				id = rs.getString("uid");
			}
		}
		catch(SQLException ex){}
		return id;
	}*/
	
	  
	  
	  
	
	  //******根据页码编号和每页显示的页码数和性别男查找记录******//
	  public ArrayList<UserBean> getUserInfoByPageNoAndUsex0(int pageNo,int pageRecords){
		  int begin=(pageNo-1)*pageRecords+1;
		  int end=pageNo*pageRecords;
		  String sql="SELECT uid,uname,udorm,uhouse,unumber,uidentity,uclass,ubed,usex,utel,uonline FROM user where usex='0'";
		  ArrayList<UserBean> userlist=new ArrayList<UserBean>();
		  DBBean db=new DBBean();
		  try{
			  db.getConn();
			  db.creatStmt();
			  ResultSet rs=db.executeQ(sql);
			  int index=0;
			  while(rs.next()){
				  index++;
				  if(index< begin) continue;
				  if(index>end) break;
				  UserBean user=new UserBean();
				  user.setUid(rs.getString("uid"));
				  user.setUname(rs.getString("uname"));
				  user.setUdorm(rs.getString("udorm"));
				  user.setUhouse(rs.getString("uhouse"));
				  user.setUnumber(rs.getString("unumber"));
				  user.setUidentity(rs.getBoolean("uidentity"));
				  user.setUclass(rs.getString("uclass"));
				  user.setUbed(rs.getString("ubed"));
				  user.setUsex(rs.getBoolean("usex"));
				  user.setUtel(rs.getString("utel"));
				  user.setUonline(rs.getBoolean("uonline"));
				  userlist.add(user);
			  }
		  }catch(SQLException se){
			  se.printStackTrace();
		  }finally{
			  db.close();
		  }
		  return userlist;
	  }
	  
	  //******根据页码编号和每页显示的页码数和性别女查找记录******//
	  public ArrayList<UserBean> getUserInfoByPageNoAndUsex1(int pageNo,int pageRecords){
		  int begin=(pageNo-1)*pageRecords+1;
		  int end=pageNo*pageRecords;
		  String sql="SELECT uid,uname,udorm,uhouse,unumber,uidentity,uclass,ubed,usex,utel,uonline FROM user where usex='1'";
		  ArrayList<UserBean> userlist=new ArrayList<UserBean>();
		  DBBean db=new DBBean();
		  try{
			  db.getConn();
			  db.creatStmt();
			  ResultSet rs=db.executeQ(sql);
			  int index=0;
			  while(rs.next()){
				  index++;
				  if(index< begin) continue;
				  if(index>end) break;
				  UserBean user=new UserBean();
				  user.setUid(rs.getString("uid"));
				  user.setUname(rs.getString("uname"));
				  user.setUdorm(rs.getString("udorm"));
				  user.setUhouse(rs.getString("uhouse"));
				  user.setUnumber(rs.getString("unumber"));
				  user.setUidentity(rs.getBoolean("uidentity"));
				  user.setUclass(rs.getString("uclass"));
				  user.setUbed(rs.getString("ubed"));
				  user.setUsex(rs.getBoolean("usex"));
				  user.setUtel(rs.getString("utel"));
				  user.setUonline(rs.getBoolean("uonline"));
				  userlist.add(user);
			  }
		  }catch(SQLException se){
			  se.printStackTrace();
		  }finally{
			  db.close();
		  }
		  return userlist;
	  }
	  
	  
	  /***获取总的页码数***/
	  public int getPageCount(int pageRecords){
		  String sql="select count(*)from user";
		  DBBean db=new DBBean();
		  int pageCount=0;
		  try{
			  db.getConn();
			  db.creatStmt();
			  ResultSet rs=db.executeQ(sql);
			  rs.next();
			  int n=rs.getInt(1);
			  pageRecords=(n-1)/pageRecords+1;
		  }catch(SQLException se){
			  se.printStackTrace();
		  }finally{
			  db.close();
		  }
		  return pageRecords;
	  }
	  /**根据用户id禁用用户***/

	  public boolean prohibitUserById(boolean prohibitValue,int uid){
	    	String sql="update user set uonline=? where uid=?";
	    	int imark=0;
	    	DBBean db=new DBBean();
	    	try{
	    		Connection conn=db.getConn();
	    		PreparedStatement pstmt=conn.prepareStatement(sql);
	    		pstmt.setBoolean(1, prohibitValue);
	    		pstmt.setInt(2,uid);
	    		imark=pstmt.executeUpdate();
	    	}catch(SQLException se){
	 	   se.printStackTrace();
		    }finally{
		    	db.close();
		    	 }
	    	return imark>0?true:false;
	    }
	  
		
	  /*****查找某寝室成员信息******/
	  public ArrayList<UserBean> getALLUserInfo(String udorm,String uhouse){
		  String sql="SELECT uid,uname,udorm,uhouse,unumber,uidentity,uclass,ubed,usex,utel FROM user where udorm='"+udorm+"'and uhouse='"+uhouse+"'";
		  ArrayList<UserBean> ulist=new ArrayList<UserBean>();
		  DBBean db=new DBBean();
		  try{
			  db.getConn();
			  db.creatStmt();
			  ResultSet rs=db.executeQ(sql);
			  while(rs.next()){
				  UserBean user=new UserBean();
				  user.setUid(rs.getString("uid"));
				  user.setUname(rs.getString("uname"));
				  user.setUdorm(rs.getString("udorm"));
				  user.setUhouse(rs.getString("uhouse"));
				  user.setUnumber(rs.getString("unumber"));
				  user.setUidentity(rs.getBoolean("uidentity"));
				  user.setUclass(rs.getString("uclass"));
				  user.setUbed(rs.getString("ubed"));
				  user.setUsex(rs.getBoolean("usex"));
				  user.setUtel(rs.getString("utel"));
				  ulist.add(user);
			  }
		  }catch(SQLException se){
			  se.printStackTrace();
		  }finally{
			  db.close();
		  }
		  return ulist;
	  }
	  
		/******根据用户名查看楼号及寝室号*****/
	  public UserBean findUdormAndUhouseByUname(String uname) {
		  UserBean user1=new UserBean();
		  DBBean db=new DBBean();
		  db.getConn();
		  db.creatStmt();
		   String sql="select udorm,uhouse from user where uname='"+uname+"'";
		   ResultSet rs=db.executeQ(sql);
		   try{
			   if(rs.next()){
				   user1.setUname(rs.getString("uname"));
			       user1.setUdorm(rs.getString("udorm"));
			       user1.setUhouse(rs.getString("uhouse"));
			   }else{
				   user1=null;
			   }
			   
		   }catch(SQLException se){
			   se.printStackTrace();
		   }
		   db.close();
		   return user1;
		   
	   }

	  

	}
	  
	  
	  

