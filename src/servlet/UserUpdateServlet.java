package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dao.UserDao;
import entity.Employee;
import entity.User;

public class UserUpdateServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		

		String uname = request.getParameter("uname");
		String upass = request.getParameter("npass");

		
		User us = new User(uname,upass);
		
		int result = new UserDao().update(us);
		
		if (result == 1) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} 
	}

}