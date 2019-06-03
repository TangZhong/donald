package servlets;

import Bean.Record;
import Bean.RecordCondition;
import Bean.Tools;
import Dao.RecordDao;
import Dao.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class RecordServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RecordServlet() {
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

		RecordDao dao = new RecordDao();
		RecordCondition condition = new RecordCondition();
		condition.setUname(request.getParameter("name"));
		List<Record> records = dao.searchRecords(condition);
		if(records.size() > 1)
			System.out.println(records.size() + "," + records.get(0));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		String actionType = request.getParameter("action");

		if("save".equals(actionType)) {

			String usernumber = request.getParameter("usernumber");
			String date = request.getParameter("date");
			String detail = request.getParameter("detail");

			Record record = new Record(usernumber, date, detail);

			RecordDao dao = new RecordDao();
			dao.saveRecord(record);

			List<Record> records = dao.searchRecords(new RecordCondition());

			request.setAttribute("recordList",records);

			request.getRequestDispatcher("dormmanager/record.jsp").forward(request, response);
		}

		if("search".equals(actionType)){
			RecordDao dao = new RecordDao();

			List<Record> records = dao.searchRecords(new RecordCondition());

			request.setAttribute("recordList",records);

			request.getRequestDispatcher("dormmanager/record.jsp").forward(request, response);
		}

		if("delete".equals(actionType)){

			int id = Integer.valueOf(request.getParameter("recordId"));

			RecordDao dao = new RecordDao();

			//先删除
			dao.deleteRecord(id);

			//再刷新结果页
			List<Record> records = dao.searchRecords(new RecordCondition());

			request.setAttribute("recordList",records);

			request.getRequestDispatcher("dormmanager/record.jsp").forward(request, response);
		}
		
}

	
	
	public void init() throws ServletException {
		// Put your code here
	}

}
