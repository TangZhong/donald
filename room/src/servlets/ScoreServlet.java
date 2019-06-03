package servlets;

import Bean.Record;
import Bean.RecordCondition;
import Bean.Score;
import Dao.RecordDao;
import Dao.ScoreDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ScoreServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ScoreServlet() {
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

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		String actionType = request.getParameter("action");

		if("save".equals(actionType)) {

			String udorm = request.getParameter("udorm");
			String uhouse = request.getParameter("uhouse");
			String scoreStr = request.getParameter("score");

			Score score = new Score(udorm,uhouse,scoreStr);

			ScoreDao scoreDao = new ScoreDao();
			scoreDao.saveScore(score);

			List<Score> scores = scoreDao.searchScores();

			request.setAttribute("scoreList",scores);

			request.getRequestDispatcher("dormmanager/showchengji.jsp").forward(request, response);
		}

		if("search".equals(actionType)){
			ScoreDao scoreDao = new ScoreDao();

			List<Score> scores = scoreDao.searchScores();

			request.setAttribute("scoreList",scores);

			request.getRequestDispatcher("dormmanager/showchengji.jsp").forward(request, response);
		}
		
}

	
	
	public void init() throws ServletException {
		// Put your code here
	}

}
