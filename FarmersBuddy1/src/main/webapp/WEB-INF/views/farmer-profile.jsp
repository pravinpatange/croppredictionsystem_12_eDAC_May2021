<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.bin.Farmer"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%
    	Farmer f=(Farmer)session.getAttribute("farmer");
    if(f !=null && f.getFid()>0)
	{
    	System.out.println("Farmer Name:"+f.getFName());
    	Integer fid=f.getFid();
    %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
</style>
<center>
<link href="F:\newPractice\FarmersBuddy1\src\main\webapp\resources\css\test.css"
    rel="stylesheet">
<c:set var="farmer" value="${farmer}"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body style="background-image: url(https://media.istockphoto.com/photos/farmer-ploughing-rice-field-at-sunrise-picture-id806276128?b=1&k=20&m=806276128&s=170667a&w=0&h=c6o1gKVtkY0GkQPhTPsJpBdY_P25UENyzvPnKp8eunA=);background-size: cover;">
<ul>
 <!--<li><a class="active" href="index.jsp">Home</a></li>-->
  <li><a href="https://protecttheharvest.com/what-you-need-to-know/wotus-articles-and-information/?gclid=CjwKCAjw4KyJBhAbEiwAaAQbE46a2S0V_UYEAHSTpyJz8wJDQbb7LAmBrDxUImpVT0PgDbogVewPuBoC4igQAvD_BwE">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a style="text-align: right" href="logout.jsp">Logout</a></li>
</ul> 

<br>
<br>

<h2><%f.getFName();%></h2>
<h2>In Farmer profile</h2>
<br>
<table >
<tr>
	<td><h4><b>Farmers ID :</b></h4></td>
	<td><h4> <%out.print(f.getFid()); %></h4></td>
</tr>
<tr>
<td><h4><b>Name:</b></h4></td>
<td><h4><%out.print(f.getFName()); %></h4></td>
<td>
 <h4><%out.print(f.getLName()); %></h4></td>
</tr>
<tr>
<td><h4><b>Contact:</b></h4></td>
<td><h4><%out.print(f.getContact()); %></h4></td>
</tr>
<tr>
<td><h4><b>Crop sown:</b></h4></td>
<td><h4><%out.print(f.getCrop()); %></h4></td>
</tr>
<tr>
<td><h4><b>Owned Land:</b></h4></td>
<td><h4><%out.print(f.getLand()); %> Acres </h4></td>  </tr>
</tr>
</table>
<br>
<h3><a href="update-land.jsp"><input type="button" value="Update Land" class="btn btn-primary"></a>
<a href="show-other-farmer/${farmer.townname}/${farmer.fid}"><button class="btn btn-primary">See other Farmer from town</button>
<a href="show-crop-predictions/${farmer.crop}/${farmer.fid}/${farmer.land}"><button class="btn btn-primary">See predictions</button>
<a href="show-orders-farmer/${farmer.fid}"><button class="btn btn-primary">See orders</button></h3>
</body>
</center>
</html>
<% 
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>