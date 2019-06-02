package manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Tools;

public class ManagerLogin extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManagerLogin() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String mname =Tools.CodeToChinese(request.getParameter("mname"));
		String mpass =request.getParameter("mpass");
		String msg="";
		String rurl="../manager/info.jsp";
		String newUrl="";

		String dbms_name="root";
		String dbms_password="123456";
		String dbms_conn="jdbc:mysql://127.0.0.1:3306/room";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			conn=DriverManager.getConnection(dbms_conn, dbms_name,  dbms_password);
			stmt=conn.createStatement();
			String sql="select mname,mpass from manager where mname='"+mname+"'and mpass='"+mpass+"'";
			rs=stmt.executeQuery(sql);
			HttpSession session=request.getSession();
			if(rs.next()){
				msg="欢迎您！"+mname;
				newUrl="../manager/managercenter.jsp";
				session.setAttribute("mname",mname);
				session.setAttribute("mpass",mpass);
			}
			else{
			    msg="用户名或密码错误！您刚才输入的用户名为："+mname;
			    newUrl="../admin/managerlogin.jsp";
			}

		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{if(rs!=null)rs.close();}catch(SQLException se){se.printStackTrace();};
			try{if(stmt!=null)stmt.close();}catch(SQLException se){se.printStackTrace();};
			try{if( conn!=null) conn.close();}catch(SQLException se){se.printStackTrace();};
		}
		request.setAttribute("info", msg);
		request.setAttribute("newUrl", newUrl);
		RequestDispatcher rd=request.getRequestDispatcher(rurl);
		rd.forward(request, response);



		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
