<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="skill.*" %>
    <%@ page import="java.sql.Connection" %>
    <%@ page import="java.sql.PreparedStatement" %>
    <%@ page import="java.sql.ResultSet" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    Connection con=DBUtil.DBconnection();
    PreparedStatement ps=con.prepareStatement("select Student.Id,Student.Name,Student.Emailid,address.Street,address.city,address.district,address.pincode,address.state from Student,address where Student.Id=address.Id");
    ResultSet rs=ps.executeQuery();
%>
<table align="center" border="1">
<tr><th>REGNO</th><th>STUDENT NAME</th><th>STUDENT EMAIL</th><th>STRRET</th><th>CITY</th><th>DISTRICT</th><th>PINCODE</th><th>STATE</th></tr>
<%  while(rs.next()){ %>
<tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td><td><%=rs.getString(6)%></td><td><%=rs.getInt(7)%></td><td><%=rs.getString(8)%></td></tr>
<% } %>
</table>
</body>
</html>