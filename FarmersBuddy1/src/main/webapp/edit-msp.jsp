<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	In edit msp
	
	<form action="edit-msp" method="POST">
		Enter Admins ID:<input type="text" name="aid">
		Select Crop:<select name="crop" id="crop">
    		<option value="wheat">Wheat</option>
    		<option value="banana">Banana</option>
			<option value="bajra">Bajra</option>
			<option value="cotton">Cotton</option>
			<option value="Sugercain">Sugercain</option>
    	</select>
    	Enter new MSP:<input type="text" name="msp">
    	<button type="submit" name="edit-msp-btn">Submit</button>
	</form>
</body>
</html>