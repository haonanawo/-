package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BaseDao;
import dao.UserDao;
import entity.User;


public class LoginaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		request.setAttribute("username", username);
		int result = new BaseDao().check(username,password);
		if (result== 1) {
			request.setAttribute("username", username);
			request.getRequestDispatcher("SelectServlet").forward(request, response);
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
	}

}
