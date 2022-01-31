package com.login.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String userName=request.getParameter("userName");  
		String password=request.getParameter("password"); 
		
		if(userName.equalsIgnoreCase(password))
		{   
			RequestDispatcher rd=request.getRequestDispatcher("SuccessServlet");  
			rd.forward(request, response);  }
		else 
		{ out.print("Please check your credentials...");  
		  RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");  
		  rd.include(request, response); 
		}
		 doGet(request, response);
	}

}
