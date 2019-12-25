package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;


public class NSelectServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		this.doPost(request, response);
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			
			String ename = request.getParameter("ename");
			request.setAttribute("list", new EmployeeDao().nselect(ename));
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}