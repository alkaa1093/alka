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

<table>
	    <tr >
	<td><b>Marks</b></td>
	<td>92-100</td>
	<td>83-91</td>
	<td>75-82</td>
	<td>67-74</td>
	<td>59-66</td>
	<td>51-58</td>
	<td>43-50</td>
	<td>35-42</td>
	<td>34 and below</td>
	</tr>
	<tr>
<td><b>Grade Point</b></td>
<td>A+</td>
<td>A</td>
<td>A-</td>
<td>B+</td>
<td>B</td>
<td>B-</td>
<td>D-</td>
<td>E</td>
<td>F</td>
</tr>
</table>
<a href="ResponseTransfer.jsp">Back to main page</a>
</body>
</html>


