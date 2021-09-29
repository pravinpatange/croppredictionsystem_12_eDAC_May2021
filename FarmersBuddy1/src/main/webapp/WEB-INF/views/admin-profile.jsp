<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.bin.Admin"%>
    <%
    	Admin a=(Admin)request.getAttribute("admin");
    if(a !=null && a.getAid()>0)
	{
    	System.out.println("Admin Name:"+a.getFName());
    %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2><%a.getFName();%></h2>
<h2>In Admin profile</h2>
<table>
	<tr><td>Name</td><td>Fid</td></tr>
	<tr><td><%out.print(a.getFName());%></td><td><%out.print(a.getAid());%></td></tr>
	
	
	
</table>

<a href="show-farmer-list-for-admin">See all farmers</a>
<a href="show-products">All products</a>

<br>
<br>
<a href="all-buyers">All Buyers</a>

</body>
</html>
<% 
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>