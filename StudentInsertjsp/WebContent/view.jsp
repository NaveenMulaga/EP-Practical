<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.klu.bean.*"  %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<% StudentBean sb=(StudentBean)request.getAttribute("bean");%>

<% out.print("Student Details"); %>
<table align="center" border="1">

<tr><th bgcolor="yellow">Studentregno</th><th bgcolor="yellow">StudentName</th><th bgcolor="yellow">StudentEmail</th><th bgcolor="yellow">StudentDepartment</th></tr>
<tr><td bgcolor="lightgreen"><%=sb.getRegno() %></td><td bgcolor="lightblue"><%=sb.getName() %></td><td  bgcolor="lightCharcoal"><%=sb.getEmail() %></td><td bgcolor="lightMagentadye"><%=sb.getDepartment() %></td></tr>
</table>
</body>
</html>