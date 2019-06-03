package dormmanager;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.ManagerBean;
import Dao.ManagerDao;

public class ManagerModifyPass extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManagerModifyPass() {
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

		String msg="";
		String rurl="../manager/info.jsp";
		String newUrl="";
		
		HttpSession session=request.getSession();
	    String mname=(String)session.getAttribute("mname");
	    String mpass=(String)session.getAttribute("mpass");
		String mpass1 =request.getParameter("mpass1");
		String mnewpass =request.getParameter("mnewpass1");
		ManagerBean add= new ManagerBean();
	    add.setMname(mname);
	    ManagerDao adao=new ManagerDao();
		
		
	if( mpass.trim().equals(mpass1)){
		adao.managermodifyPass(mname, mnewpass);
	 boolean mark=adao.managermodifyPass(mname, mnewpass);
		if(mark){
		msg="�޸ĳɹ���";
		newUrl="../index.jsp";
	    session.setAttribute("mname",mname);
				}
		else{
		msg="�޸��쳣���������޸ģ�";
		newUrl="../manager/managercenter.jsp";
				}
		
	}
	else{

		msg="ԭ����������������룡";
		newUrl="../manager/managercenter.jsp";}
				


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
