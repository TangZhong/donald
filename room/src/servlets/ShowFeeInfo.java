package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.registry.infomodel.User;

import Bean.FeeBean;
import Bean.Tools;
import Bean.UserBean;
import Dao.FeeDao;
import Dao.UserDao;

public class ShowFeeInfo extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShowFeeInfo() {
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
		
		
		HttpSession session=request.getSession();
	
		 
		String udorm=request.getParameter("fudorm");
		String uhouse=request.getParameter("fuhouse");
		 
		 FeeDao fdao=new FeeDao();
		 FeeBean fee=new FeeBean();
		 fee=fdao.getALLFeeInfo(udorm,uhouse);
		 request.setAttribute("fee", fee);
		 request.setAttribute("lou", udorm);
		 request.setAttribute("qinshi",uhouse);
		 RequestDispatcher rd=request.getRequestDispatcher("../showfee.jsp");
		 rd.forward(request, response);
		
		

		response.setContentType("text/html; charset=utf-8");
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
