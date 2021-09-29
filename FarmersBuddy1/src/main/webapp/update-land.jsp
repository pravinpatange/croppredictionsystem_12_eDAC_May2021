<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style=background-color:lightcyan>
<center>
		<h3>
			Update Land
		</h3>
		<form action="update-land" method="POST">
			Your Farmers ID :<input type="text" name="fid">
			Land: <input type="text" name="land">
			<button type="submit" name="updateland" value="UpdateLand">Update</button>
		</form>
</center>
</body>
</html>