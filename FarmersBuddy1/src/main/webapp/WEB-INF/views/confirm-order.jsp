<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.demo.bin.Order"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    
    <%
    	Order o=(Order)request.getAttribute("order");
    if(o !=null)
	{
    	System.out.println("Buyer id:"+o.getBid());
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="order" value="${order}"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Total price: <%out.print(o.getPrice());%></h2>
	<br>
	<br>
	<a href="addorder/${order.oid}/${order.fid}/${order.crop}/${order.bid}/${order.status}/${order.amount}/${order.price}">Confirm order</a>
</body>
</html>
<% 
	}
	else
	{
		System.out.println("In redirect to index");
		response.sendRedirect("index.jsp");
	}
%>