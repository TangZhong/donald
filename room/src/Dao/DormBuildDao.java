package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;







//public class DormBuildDao {
//	//Â¥²ãÁÐ±í
//	public List<DormBuild> dormBuildList(Connection con, PageBean pageBean, DormBuild s_dormBuild)throws Exception {
//		List<DormBuild> dormBuildList = new ArrayList<DormBuild>();
//		StringBuffer sb = new StringBuffer("select * from t_dormBuild t1");
//		if(StringUtil.isNotEmpty(s_dormBuild.getDormBuildName())) {
//			sb.append(" where t1.dormBuildName like '%"+s_dormBuild.getDormBuildName()+"%'");
//		}
//		if(pageBean != null) {
//			sb.append(" limit "+pageBean.getStart()+","+pageBean.getPageSize());
//		}
//		PreparedStatement pstmt = con.prepareStatement(sb.toString());
//		ResultSet rs = pstmt.executeQuery();
//		while(rs.next()) {
//			DormBuild dormBuild=new DormBuild();
//			dormBuild.setDormBuildId(rs.getInt("dormBuildId"));
//			dormBuild.setDormBuildName(rs.getString("dormBuildName"));
//			dormBuild.setDetail(rs.getString("dormBuildDetail"));
//			dormBuildList.add(dormBuild);
//		}
//		return dormBuildList;
//	}


	

	
