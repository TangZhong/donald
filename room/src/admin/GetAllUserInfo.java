package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Bean.UserBean;
import Dao.UserDao;

public class GetAllUserInfo extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetAllUserInfo() {
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
		
		String udorm=request.getParameter("udorm");
		String uhouse=request.getParameter("uhouse");
		ArrayList<UserBean> ulist=new ArrayList<UserBean>();

		 UserDao udao=new UserDao();
		 ulist=udao.getALLUserInfo(udorm, uhouse);
		 request.setAttribute("ulist", ulist);
		 request.setAttribute("lou1", udorm);
		 request.setAttribute("qinshi1",uhouse);
		 RequestDispatcher rd=request.getRequestDispatcher("showqinuser.jsp");
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
