package com.grouph.weekNo3.assignment1;
/**
 * @author alka And Komalpreet
 */

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesServlet
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesServlet() {
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
			Cookie ck=new Cookie("userName",userName);//creating cookie object  
			response.addCookie(ck);
			//linking and transfering the info to CookiesServeletResponse Page 
			out.print("<a href='CookiesServletResponse'>Click here to transfer information using cookies</a>"); }
		else 
		{ out.print("Sorry username or password error");  
		//using request dispathcher to transfer to the login promt
		  RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");  
		  rd.include(request, response); 
		}
		doGet(request, response);
	}

}
