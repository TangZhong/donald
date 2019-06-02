package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Tools;
import Bean.UserBean;
import Dao.UserDao;

public class UpdateInfo extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpdateInfo() {
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
		HttpSession session=request.getSession();
		String uname =Tools.CodeToChinese(request.getParameter("uname"));
		String unumber=(String)session.getAttribute("unumber");
	    String uclass=(String)session.getAttribute("uclass");
	    String udorm=(String)session.getAttribute("udorm");
	    String uhouse=(String)session.getAttribute("uhouse");
	    String ubed=(String)session.getAttribute("ubed");
		String usex =Tools.CodeToChinese(request.getParameter("usex"));
		boolean b_usex=usex.equals("男")?false:true;
	    String utel=request.getParameter("utel");
	     
	     
	     UserBean user=new UserBean();

	     user.setUname(uname); 
	     user.setUnumber(unumber);
	     user.setUclass(uclass);
	     user.setUdorm(udorm);
	     user.setUhouse(uhouse);
	     user.setUbed(ubed);
	     user.setUsex(b_usex);
	     user.setUtel(utel);
	     UserDao udao=new UserDao();
	    
	        String msg="";
			String rurl="info.jsp";
			String newUrl="";
			if(udao.updateuser(user)){
				boolean mark=udao.updateuser(user);
				if(mark){
				msg="修改成功！";
				newUrl="index.jsp";
				session.setAttribute("uname",uname);
				}
				else{
					msg="修改失败！请重新修改！";
					newUrl="user/ShowUserInfo";
				}
				
			}
			else{
				msg="修改异常！请重新修改";
			    newUrl="user/ShowUserInfo";
				
		
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
