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

public class Regservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Regservlet() {
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
		
		String uname =Tools.CodeToChinese(request.getParameter("uname"));
		String unumber =request.getParameter("unumber");
		String uclass =request.getParameter("uclass");
		String upass =request.getParameter("upass");
		String usex=Tools.CodeToChinese(request.getParameter("usex"));
		String uidentity=Tools.CodeToChinese(request.getParameter("uidentity"));
		boolean b_usex=usex.equals("男")?false:true;
		boolean b_uidentity=usex.equals("寝室长")?false:true;
		String udorm=request.getParameter("udorm");
		String uhouse=request.getParameter("uhouse");
		String ubed=request.getParameter("ubed");

	    String utel=request.getParameter("utel");
	   
	    UserBean user=new UserBean();
	    
	    user.setUname(uname);
	    user.setUnumber(unumber);
	    user.setUclass(uclass);
	    user.setUpass(upass);

	    user.setUsex(b_usex);
	    
		user.setUidentity(b_uidentity);
	    user.setUdorm(udorm);
	    user.setUhouse(uhouse);
	    user.setUbed(ubed);
	    user.setUtel(utel);

	    UserDao udao=new UserDao();
	    
	    String msg1="";
		String msg2="";
		String rurl="reginfo.jsp";
		String newUrl="";
		//创建session对象
    	//验证是否正常登录

	
		//跳转
		
		if(udao.findByName(uname)){
			 msg1="该用户名已被注册！请重新注册！";
			 msg2="您刚才输入的用户名为："+uname;
			    newUrl="reg.jsp ";
		}
		else{
			boolean mark=udao.addUser(user);
			if(mark){
			msg1="注册成功！恭喜您！该用户名未被注册，请核对注册信息！";
			msg2="<p>信息如下："+"</p>"+
				 "<h3>您的用户名为:"+uname+
			     "<h3>您的学号为:"+unumber+
				 "<h3>您的班级为:"+uclass+
			     "<h3>您的宿舍楼为:"+udorm+
			     "<h3>您的寝室号为:"+uhouse+
		         "<h3>您的床位号为:"+ubed+
			     "<h3>您的性别为:"+usex+
		         "<h3>您的寝室身份为:"+b_uidentity+
			     "<h3>您的联系电话为:"+utel;
		       
			newUrl="index.jsp";
			}
			else{
				msg1="注册异常！";
				msg2="请重新注册！";
				newUrl="reg.jsp";
			}
			
		}


	request.setAttribute("info1", msg1);
	request.setAttribute("info2", msg2);
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
