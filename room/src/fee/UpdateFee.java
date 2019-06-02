package fee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.FeeBean;
import Bean.Tools;
import Bean.UserBean;
import Dao.FeeDao;
import Dao.UserDao;

public class UpdateFee extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpdateFee() {
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
		 String udorm=request.getParameter("udorm");
	     String uhouse=request.getParameter("uhouse");
	     String fe=request.getParameter("fe"); 
	     String fw=request.getParameter("fw");
	     String ft=request.getParameter("ft");
		 String fi=Tools.CodeToChinese(request.getParameter("fi"));
		 boolean b_fi=fi.equals("已上缴")?false:true;
	
		 
	     FeeBean fee=new FeeBean();
	 
		  fee.setUdorm(udorm);
		  fee.setUhouse(uhouse);
		  fee.setFe(fe);
		  fee.setFw(fw);
		  fee.setFt(ft);
		  fee.setFi(b_fi);
	     
	    FeeDao fdao=new FeeDao();
	    
	        String msg="";
			String rurl="../fee/info.jsp";
			String newUrl="";
			if(fdao.updatefee(fee)){
				boolean mark=fdao.updatefee(fee);
				if(mark){
				msg="寝室水电费用修改成功！";
				newUrl="../admin/admincenter.jsp";
				}
				else{
					msg="寝室水电费用修改失败！请重新修改！";
					newUrl="../admin/admincenter.jsp";
				}
				
			}
			else{
				msg="修改异常！请重新修改";
			    newUrl="../admin/admincenter.jsp";
				
		
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
