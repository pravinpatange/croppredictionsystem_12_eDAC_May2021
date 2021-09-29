<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.bin.Prediction"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
   <%
    	Prediction pred=(Prediction)request.getAttribute("predlist");
    if(pred.getHarvest()>0)
	{
    	System.out.println("Price:"+pred.getPrice());
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./css/style.css">
    
     <script src="vendor/jquery/jquery.min.js"></script>
     <script src="js/main.js"></script>
     
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>
    <center>
<table class="table table-striped">
     <tr>
    <th>1)</th>    
	<th>Predicted harvest time: <%out.print(pred.getTime());%> months</th>
    </tr>
    <tr>
    <th>2)</th>
	<th>Predicted harvest : <%out.print(pred.getHarvest());%> per acre </th>
    </tr>
    <tr>
    <th>3)</th>
    <th>Predicted price: Rs.<%out.print(pred.getPrice());%> per quintal</th>
    </tr>
    <tr>
    <th>4)</th>
    <th>Predicted total harvest: <%out.print(pred.getExpharvest());%> quintals</th>
    </tr>
    <tr>
    <th>5)</th>
    <th>Predicted total wheat Harvest: <%out.print(pred.getTotal()*pred.getHarvest());%>total Harvest</th>
    
    </tr>
    

</table>
	<input type=button value="Back" onCLick="history.back()">
</center>
    
</body>
</html>
<% 
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>
