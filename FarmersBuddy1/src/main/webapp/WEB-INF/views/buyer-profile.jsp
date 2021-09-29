<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.demo.bin.Buyer"%>
    
    <%
    	Buyer b=(Buyer)request.getAttribute("buyer");
    if(b !=null && b.getBid()>0)
	{
    	System.out.println("Buyers Name:"+b.getBname());
    %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
	
		<h2><%b.getBname();%></h2>
		<h2>In Buyer profile</h2>
		<table>
			<tr><td>Name</td><td>Bid</td></tr>
			<tr><td><%out.print(b.getBname());%></td><td><%out.print(b.getBid());%></td></tr>
		</table>
		<a href="show-farmer-list">Order</a>
		
</body>

</html>


<% 
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>