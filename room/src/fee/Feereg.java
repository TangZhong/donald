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
		out.println("��ѡ��");
		out.println("  <h2>");
		out.print(" ���˶���ȷ����<a href=../admin/admincenter.jsp>ȷ��</a>�����ص�����Աҳ��!");
		out.println("  <h2>");
		out.print(" �����޸�ˮ�����Ϣ���ɷ��ط���ҳ�����<a href=../fee/feereg.jsp>�޸�</a>!");
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
				 msg="������¥����ˮ��Ѽ�¼�������ظ�����";
			     newUrl="../admin/admincenter.jsp";
			}
			else{
				boolean mark=fdao.addFee(fee);
				if(mark){
				msg="�����ɹ�����ϲ������˶Է�����Ϣ��" +
				     "<p>��Ϣ���£�"+"</p>"+
				     "<h3>¥��:"+udorm+
			         "<h3>���Һ�:"+uhouse+
				     "<h3>ˮ��:"+fw+
				     "<h3>���:"+fe+
			         "<h3>�ܺ�:"+ft;;

				newUrl="../fee/Feereg";
				session.setAttribute("udorm",udorm);
				session.setAttribute("uhouse",uhouse);
				}
				else{
					msg="�����쳣��";
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
