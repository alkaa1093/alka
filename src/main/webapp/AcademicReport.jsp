<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  padding: 5px;
}
table {
  border-spacing: 15px;
}
</style>

<meta charset="ISO-8859-1">
<title>Acedemic Report</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<img src="lambton.jpg">
<h2><%out.print(request.getParameter("userName").toUpperCase()+" 's");%> ACADEMIC REPORT</h2>
<p>MAXIMUM MARKS: <%= request.getParameter("maxMark")%></p>
<p>MINIMUM MARKS: <%= request.getParameter("minMark") %></p>
<p>AVERAGE MARKS: <%= request.getParameter("averageMarks")%></p>
<p>GRADE: <%= request.getParameter("grade")%></p>

<table width="100%">
	    <tr >
	<td><b>Marks</b></td>
	<td>94-100</td>
	<td>87-93</td>
	<td>80-86</td>
	<td>77-79</td>
	<td>73-76</td>
	<td>70-72</td>
	<td>67-69</td>
	<td>63-66</td>
	<td>60-62</td>
	<td>50-59</td>
	<td>0-49</td>
	</tr>
	<tr>
<td><b>Grade Point </b></td>
<td>A+</td>
<td>A</td>
<td>A-</td>
<td>B+</td>
<td>B</td>
<td>B-</td>
<td>C+</td>
<td>C</td>
<td>C-</td>
<td>D</td>
<td>F</td>
</tr>

</table> <br/> <br/>
<ul class="list-group">
  <li class="list-group-item active">Group Members</li>
  <li class="list-group-item">Komalpreet Singh C0793362</li>
  <li class="list-group-item">Alka Sharma C0805711</li>
  <li class="list-group-item">Piyush Kumar C0803168</li>
  <li class="list-group-item">Vishudeep Tiwari C0799365</li>
  <li class="list-group-item">Kajal C0796819</li>
</ul>
=======
</table>


<a href="ResponseTransfer.jsp">Back to main page</a>
</body>
</html>


