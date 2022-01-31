<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><%out.print(request.getParameter("userName").toUpperCase()+" 's");%> ACADEMIC REPORT</h2>
<p>MAXIMUM MARKS: <%= request.getParameter("maxMark")%></p>
<p>MINIMUM MARKS: <%= request.getParameter("minMark") %></p>
<p>AVERAGE MARKS: <%= request.getParameter("averageMarks")%></p>
<p>GRADES: <%= request.getParameter("grade")%></p>
<a href="ResponseTransfer.jsp">Back to main page</a>
</body>
</html>


