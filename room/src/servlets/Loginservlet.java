package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import Bean.AdminBean;
import Bean.Tools;
import Bean.UserBean;
import Dao.UserDao;

public class Loginservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Loginservlet() {
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

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		String uname =Tools.CodeToChinese(request.getParameter("uname"));
		String upass =request.getParameter("upass");
		String uidentity =Tools.CodeToChinese(request.getParameter("uidentity"));
		boolean b_uidentity=uidentity.equals("寝室长")?false:true;
		 UserBean user=new UserBean();
	     user.setUname(uname);
	     user.setUpass(upass);
	     user.setUidentity(b_uidentity);
	    UserDao udao=new UserDao();
	//	String remember = request.getParameter("remember");
		String msg="";
		String rurl="info.jsp";
		String newUrl="";

		
		HttpSession session=request.getSession();

		if(udao.findByNameAndPass(uname,upass,b_uidentity)){
			boolean mark=udao.findByNameAndPass(uname,upass,b_uidentity);
			if(mark){
				if(b_uidentity=false)
				{
					msg="欢迎您！"+uname;
					newUrl="index1.jsp";
					session.setAttribute("uname",uname);
					session.setAttribute("upass",upass);
		
			} else{
							msg="欢迎您！"+uname;
							newUrl="index2.jsp";
							session.setAttribute("uname",uname);
							session.setAttribute("upass",upass);
				
					}      

			}
			else{
				msg="用户名或密码错误！您刚才输入的用户名为："+uname;
			    newUrl="login.jsp";
			
				
			}
		}
		else{
			msg="登录异常！请重新登录！";
			newUrl="login.jsp";
			
		}


		request.setAttribute("info", msg);
		request.setAttribute("newUrl", newUrl);
		RequestDispatcher rd=request.getRequestDispatcher(rurl);
		rd.forward(request, response);
		
		
		
		response.setContentType("text/html; charset=utf-8");
		
}

	
	
	public void init() throws ServletException {
		// Put your code here
	}

}
