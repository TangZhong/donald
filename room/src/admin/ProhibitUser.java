package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Tools;
import Dao.UserDao;

public class ProhibitUser extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ProhibitUser() {
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
response.setContentType("text/html; charset=utf-8");
String msg="";
String rurl="../admin/info.jsp";
String newUrl="";
UserDao udao=new UserDao();

String sUid =request.getParameter("uid");
String sProhibitValue =Tools.CodeToChinese(request.getParameter("prohibitValue"));
int uid=Integer.parseInt(sUid);
boolean prohibitValue=( sProhibitValue.trim()).equals("禁用")?false:true;
if(udao.prohibitUserById(prohibitValue, uid)){
	boolean mark=udao.prohibitUserById(prohibitValue, uid);
	if(mark){
		msg="寝室成员状态修改成功！";
		newUrl="../admin/admincenter.jsp";

	}
	else{
		msg="寝室成员状态修改失败！";
		newUrl="../admin/admincenter.jsp";
	}
}
else{
	   msg="修改异常！请重新修改！";
	   newUrl="../admin/admincenter.jsp";
		

	}




request.setAttribute("info", msg);
request.setAttribute("newUrl", newUrl);
RequestDispatcher rd=request.getRequestDispatcher(rurl);
rd.forward(request, response);

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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
