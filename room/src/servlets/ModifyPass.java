package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.UserBean;
import Dao.UserDao;

public class ModifyPass extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ModifyPass() {
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

		response.setContentType("text/html;charset=utf-8");
		String msg="";
		String rurl="info.jsp";
		String newUrl="";
		
		HttpSession session=request.getSession();
	    String uname=(String)session.getAttribute("uname");
	    String upass=(String)session.getAttribute("upass");
		String upass1 =request.getParameter("upass1");
		String unewpass =request.getParameter("unewpass1");
		UserBean user=new UserBean();
	    user.setUname(uname);
		UserDao udao=new UserDao();
		
		
	if( upass.trim().equals(upass1)){
		udao.modifyPass(uname, unewpass);
	 boolean mark=udao.modifyPass(uname, unewpass);
		if(mark){
		msg="修改成功！";
		newUrl="index.jsp";
	    session.setAttribute("uname",uname);
				}
		else{
		msg="修改异常！请重新修改！";
		newUrl="usercenter.jsp";
				}
		
	}
	else{

		msg="原密码错误！请重新输入！";
		newUrl="usercenter.jsp";}
				


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
