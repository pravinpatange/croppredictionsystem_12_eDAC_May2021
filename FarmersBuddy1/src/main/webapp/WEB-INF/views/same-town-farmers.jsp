<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./css/style.css">
    
     <script src="vendor/jquery/jquery.min.js"></script>
     <script src="js/main.js"></script>
     <link rel="icon" href="https://image.shutterstock.com/image-vector/indian-farmer-character-logo-caricature-260nw-1925692910.jpg">
     
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style=background-color:lightcyan>
<center>
	<h1>In farmer from same town</h1>
	
	<table class="table table-striped">
		<tr><td>Farmer Name</td><td>Farmer Last Name</td><td>Farmer ID</td></tr>
		<c:forEach var="f" items="${flist}">
		<tr>
			<td>${f.FName}</td><td>${f.LName}</td><td>${f.fid}</td>
			
		</tr>
	</c:forEach>
	</table>
	<br>
	<input type=button value="Back" onCLick="history.back()">
	
</center>
</body>
</html>