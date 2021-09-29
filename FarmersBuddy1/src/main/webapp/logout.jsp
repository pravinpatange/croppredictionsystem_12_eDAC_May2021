
<%
	session.removeAttribute("farmer");

	session.invalidate();
	response.sendRedirect("index.jsp");
%>

