package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import entity.Employee;

public class EmployeeAddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String ename = request.getParameter("ename");
		int eage = Integer.parseInt(request.getParameter("eage"));
		String etel = request.getParameter("etel");
		String esex = request.getParameter("esex");
		String username=request.getParameter("username");
		
		Employee em = new Employee(ename,esex,eage,etel);
		
		int result = new EmployeeDao().add(em);
		
		if (result == 1) {
			request.setAttribute("username", username);
			request.getRequestDispatcher("SelectServlet").forward(request, response);
		} else {
			request.getRequestDispatcher("SelectServlet").forward(request, response);
		}
	
	}

}
