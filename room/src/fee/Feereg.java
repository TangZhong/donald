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

public class Feereg extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Feereg() {
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
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println("  <h1>");
		out.println("请选择：");
		out.println("  <h2>");
		out.print(" 若核对正确，请<a href=../admin/admincenter.jsp>确认</a>，将回到管理员页面!");
		out.println("  <h2>");
		out.print(" 若想修改水电费信息，可返回发布页面进行<a href=../fee/feereg.jsp>修改</a>!");
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
		
		 String udorm =request.getParameter("udorm");
		 String uhouse =request.getParameter("uhouse");
		 String fw =request.getParameter("fw");
		 String fe =request.getParameter("fe");
		 String ft =request.getParameter("ft");
		
		
	    FeeBean fee=new FeeBean();
	     fee.setUdorm(udorm);
	    fee.setUhouse(uhouse);
	     fee.setFw(fw);
	     fee.setFe(fe);
	     fee.setFt(ft);
	     
	    FeeDao fdao=new FeeDao();
	    
	        String msg="";
			String rurl="../fee/info.jsp";
			String newUrl="";
			HttpSession session=request.getSession();
			if(fdao.findByUdormAndUhouse(udorm, uhouse)){
				 msg="该宿舍楼已有水电费记录！请勿重复发布";
			     newUrl="../admin/admincenter.jsp";
			}
			else{
				boolean mark=fdao.addFee(fee);
				if(mark){
				msg="发布成功！恭喜您！请核对发布信息！" +
				     "<p>信息如下："+"</p>"+
				     "<h3>楼号:"+udorm+
			         "<h3>寝室号:"+uhouse+
				     "<h3>水费:"+fw+
				     "<h3>电费:"+fe+
			         "<h3>总和:"+ft;;

				newUrl="../fee/Feereg";
				session.setAttribute("udorm",udorm);
				session.setAttribute("uhouse",uhouse);
				}
				else{
					msg="发布异常！";
					newUrl="../fee/feereg.jsp";
				}
				
			}


		request.setAttribute("info", msg);
		request.setAttribute("newUrl", newUrl);
		RequestDispatcher rd=request.getRequestDispatcher(rurl);
		rd.forward(request, response);
		
		response.setContentType("text/html; charset=utf-8");

		
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
