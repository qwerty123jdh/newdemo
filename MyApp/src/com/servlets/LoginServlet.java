package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/check")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//read parameter
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		LoginDAO dao= new LoginDAO();
		boolean success=dao.checkLogin(name, pass);
		if(success ) 
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		}
			
		else {
		   request.setAttribute("message", "credentials not matching");
			RequestDispatcher dispatcher= request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
