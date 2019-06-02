package fee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Tools;
import Dao.FeeDao;
import Dao.UserDao;

public class Feefi extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Feefi() {
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
		String rurl="../fee/info.jsp";
		String newUrl="";
	    FeeDao fdao=new FeeDao();
	    boolean mark=false;
	    
		String sFid =request.getParameter("fid");
		String sfeefi =Tools.CodeToChinese(request.getParameter("feefi"));
		int fid=Integer.parseInt(sFid);
		boolean feefi=(sfeefi.trim()).equals("Î´ÉÏ½É")?false:true;
		if(fdao.prohibitfeeByfid(feefi, fid)){
			 mark=fdao.prohibitfeeByfid(feefi, fid);
			if(mark){
				msg="ÇÞÊÒ½É·Ñ×´Ì¬ÐÞ¸Ä³É¹¦£¡";
				newUrl="../admin/admincenter.jsp";

			}
			else{
				msg="ÇÞÊÒ½É·Ñ×´Ì¬ÐÞ¸ÄÊ§°Ü£¡";
				newUrl="../admin/admincenter.jsp";
			}
		}
		else{
			   msg="²Ù×÷Òì³££¡ÇëÖØÐÂÐÞ¸Ä£¡";
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
