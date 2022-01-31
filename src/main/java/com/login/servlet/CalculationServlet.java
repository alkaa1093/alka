package com.login.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculationServlet
 */
@WebServlet("/CalculationServlet")
public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationServlet() {
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
		int subject1=Integer.parseInt(request.getParameter("subject1"));
		int subject2=Integer.parseInt(request.getParameter("subject2"));
		int subject3=Integer.parseInt(request.getParameter("subject3"));
		int subject4=Integer.parseInt(request.getParameter("subject4"));
		int subject5=Integer.parseInt(request.getParameter("subject5"));
		float averageMarks=(subject1+subject2+subject3+subject4+subject5)/5;
		Integer marksArray[] = new Integer[] {subject1,subject2,subject3,subject4,subject5}; 
		int maxMark=Collections.max(Arrays.asList(marksArray));
		int minMark=Collections.min(Arrays.asList(marksArray));
		String grade=getGrade(averageMarks);
		//request.setAttribute("averageMarks",averageMarks);
		//request.setAttribute("maxMark",maxMark);
		//request.setAttribute("minMark",minMark);
		//request.setAttribute("grade",grade);
//		RequestDispatcher rd=request.getRequestDispatcher("/AcademicReport.jsp");
//		rd.forward(request, response);
		response.sendRedirect("AcademicReport.jsp?averageMarks="+averageMarks+"&maxMark="+maxMark+"&minMark="+minMark+
				"&grade="+grade+"&userName="+request.getParameter("userName"));
		doGet(request, response);
		
	}

	  
	     String getGrade(float marks)
	     {
	    	 String grade = null;
	         
	         switch((int)marks/10) {
	           // for >= 90
	           case 10:
	           case 9:
	              grade = "A";
	              break;
	           // for >= 80 and <90
	           case 8:
	              grade = "B";
	              break;
	           // for >= 70 and <80
	           case 7:
	              grade = "C";
	              break;
	           // for >= 60 and <70
	           case 6:
	              grade = "D";
	              break;
	           // for >= 50 and <60
	           case 5:
	              grade = "E";
	              break;
	           // for < 50
	           default:
	              grade = "F";
	              break;
	         }
			return grade;
	     }
	
	
}
