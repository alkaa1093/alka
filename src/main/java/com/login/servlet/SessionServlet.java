package com.login.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

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
			HttpSession session=request.getSession();  
			session.setAttribute("userName",userName);  
            out.print("<a href='SessionServletResponse'>Click here to transfer information using HTTP Session</a>");  	
		}
		else 
		{ out.print("Sorry username or password error");  
		RequestDispatcher rd=request.getRequestDispatcher("LoginServlet");  
		rd.include(request, response); 
		}
		
		doGet(request, response);
	}

}
