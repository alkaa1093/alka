package com.login.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessServlet
 */
@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessServlet() {
        super();
        
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
		out.print("<h2> "+request.getParameter("userName").toUpperCase()+ " please sumbit your subject's marks </h2>");  
		out.print("<form action='CalculationServlet' method='post'>");
		out.print("Name:<input type='text' name='userName' value='"+request.getParameter("userName")+"'><br/><br/>"); 
		out.print("Subject1:<input type='number' name='subject1'><br/><br/>");
		out.print("Subject2:<input type='number' name='subject2'><br/><br/>");
		out.print("Subject3:<input type='number' name='subject3'><br/><br/>");
		out.print("Subject4:<input type='number' name='subject4'><br/><br/>");
		out.print("Subject5:<input type='number' name='subject5'><br/><br/>");
		out.print("<input type='submit' value='AVERAGE'>");  
		out.print("</form>");    
		doGet(request, response);
	}

}
