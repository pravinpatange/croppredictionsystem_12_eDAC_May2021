<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="">
	.content {
  max-width: 500px;
  margin: auto;
}

</style>
</head>
<body style="background-image: url(file:///F:/newPractice/FarmersBuddy1/src/main/webapp/resources/img/front_farm.jpg);background-size: cover;backdrop-filter: blur(3px);">
	<br>
	
	<h2>Select Profession</h2>
	<br>
	<br>
    <div class="content">
    <form action="farmerslogin.jsp">
    	<button class="btn btn-primary">Farmer</button>
    
    </form>
    <br>
    <form action="adminslogin.jsp">
    	<button class="btn btn-primary">Admin</button>
    
    </form>
    <br>
    <form action="buyerslogin.jsp">
    	<button  class="btn btn-primary">Buyer</button>
    
    </form>
	</div>
</body>
</html>