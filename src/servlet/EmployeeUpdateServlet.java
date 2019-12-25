package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dao.UserDao;
import entity.Employee;



public class EmployeeUpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int eno = Integer.parseInt(request.getParameter("eno"));
		String ename = request.getParameter("ename");
		String esex = request.getParameter("esex");
		int eage = Integer.parseInt(request.getParameter("eage"));
		String etel = request.getParameter("etel");
		
		String username=request.getParameter("username");
		Employee em = new Employee(eno, ename,esex, eage, etel);
		
		int result = new EmployeeDao().update(em);
		
		if (result == 1) {
			request.setAttribute("username", username);
			request.getRequestDispatcher("SelectServlet").forward(request, response);
		} else {
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
	}

}
