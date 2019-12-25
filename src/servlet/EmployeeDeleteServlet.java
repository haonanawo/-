package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;


public class EmployeeDeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int eno = Integer.parseInt(request.getParameter("eno"));
		int result = new EmployeeDao().delete(eno);
		
		String username=request.getParameter("username");
		request.setAttribute("username", username);
		request.getRequestDispatcher("SelectServlet").forward(request, response);
	}

}
