package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Bean.DBBean;
import Bean.FeeBean;
import Bean.UserBean;


public class FeeDao {
	/******宿舍水电是否存在*****/
	public boolean findByUdormAndUhouse(String udorm,String uhouse){
		boolean mark=false;
		DBBean db=new DBBean();
		ResultSet rs=null;
		try{
			db.getConn();
			db.creatStmt();
			String sql="select udorm,uhouse from fee where udorm='"+udorm+"'and uhouse='"+uhouse+"'";
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
	/******增加水电费用信息*****/
	public boolean addFee(FeeBean fee){
		int mark=0;
		DBBean db=new DBBean();
	     Connection conn=db.getConn();
	     String sql="insert into fee (udorm,uhouse,fe,fw,ft) values (?,?,?,?,?)";
		try{
			PreparedStatement pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, fee.getUdorm());
	        pstmt.setString(2, fee.getUhouse());
	        pstmt.setString(3, fee.getFe());
	        pstmt.setString(4, fee.getFw());
	        pstmt.setString(5, fee.getFt());
            mark=pstmt.executeUpdate();
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			   db.close();
		}
		return mark>0?true:false;
	}

	
	  //******根据页码编号和每页显示的页码数查找记录******//
	  public ArrayList<FeeBean> getfeeInfoByPageNo(int pageNo,int pageRecords){
		  int begin=(pageNo-1)*pageRecords+1;
		  int end=pageNo*pageRecords;
		  String sql="SELECT fid,udorm,uhouse,fe,fw,ft,fi FROM fee";
		  ArrayList<FeeBean> feelist=new ArrayList<FeeBean>();
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
				 FeeBean fee=new FeeBean();
				  fee.setFid(rs.getString("fid"));
				  fee.setUdorm(rs.getString("udorm"));
				  fee.setUhouse(rs.getString("uhouse"));
				  fee.setFe(rs.getString("fe"));
				  fee.setFw(rs.getString("fw"));
				  fee.setFt(rs.getString("ft"));
				  fee.setFi(rs.getBoolean("fi"));
				  feelist.add(fee);
			  }
		  }catch(SQLException se){
			  se.printStackTrace();
		  }finally{
			  db.close();
		  }
		  return feelist;
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
	  
	  
	  /*****查找某寝室水电费用******/
	  public FeeBean getALLFeeInfo(String udorm,String uhouse){
		  FeeBean fee=new FeeBean();
		  String sql="SELECT fid,udorm,uhouse,fe,fw,ft,fi FROM fee where udorm='"+udorm+"'and uhouse='"+uhouse+"'";
		  DBBean db=new DBBean();
		  try{
			  db.getConn();
			  db.creatStmt();
			  ResultSet rs=db.executeQ(sql);
			  if(rs.next()){
				  fee.setFid(rs.getString("fid"));
				  fee.setUdorm(rs.getString("udorm"));
				  fee.setUhouse(rs.getString("uhouse"));
				  fee.setFe(rs.getString("fe"));
				  fee.setFw(rs.getString("fw"));
				  fee.setFt(rs.getString("ft"));
				  fee.setFi(rs.getBoolean("fi"));
			  }
			  else{
				   fee=null;
			  }
		  }catch(SQLException se){
			  se.printStackTrace();
		  }finally{
			  db.close();
		  }
		  return fee;
	  }
	  
	  /*****更改寝室水电费用******/
	  public boolean updatefee(FeeBean fee){
		  int mark=0;
		  DBBean db=new DBBean();
			Connection conn=db.getConn();
		     String sql="update fee set fe=?,fw=?,ft=?,fi=? where udorm=? and uhouse=? ";	
		     try{
			     PreparedStatement pstmt=conn.prepareStatement(sql);
				 pstmt.setString(1, fee.getFe());
				 pstmt.setString(2, fee.getFw());
				 pstmt.setString(3, fee.getFt());
			   	 pstmt.setBoolean(4, fee.isFi());
			     pstmt.setString(5, fee.getUdorm());
			        pstmt.setString(6, fee.getUhouse());
		            mark=pstmt.executeUpdate();
				}catch(SQLException se){
					se.printStackTrace();
				}finally{
					   db.close();
				}
				return mark>0?true:false;
			}

	  
	  
	  
	  /**更改寝室水电上缴情况***/

	  public boolean prohibitfeeByfid(boolean feefi,int fid){
	    	String sql="update fee set fi=? where fid=?";
	    	int imark=0;
	    	DBBean db=new DBBean();
	    	try{
	    		Connection conn=db.getConn();
	    		PreparedStatement pstmt=conn.prepareStatement(sql);
	    		pstmt.setBoolean(1, feefi);
	    		pstmt.setInt(2,fid);
	    		imark=pstmt.executeUpdate();
	    	}catch(SQLException se){
	 	   se.printStackTrace();
		    }finally{
		    	db.close();
		    	 }
	    	return imark>0?true:false;
	    }
	  
}
