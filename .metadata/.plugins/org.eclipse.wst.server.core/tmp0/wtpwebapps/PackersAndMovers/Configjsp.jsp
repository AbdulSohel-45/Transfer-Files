<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%  

	String fullName=request.getParameter("fullName");
	int number=Integer.parseInt(request.getParameter("number"));
	String source=request.getParameter("source");
	String destination=request.getParameter("destination");
	String vehicle=request.getParameter("vehicle");
	int kms=Integer.parseInt(request.getParameter("distance"));
	int price=Integer.parseInt(request.getParameter("price"));
	int amount=(Integer)(request.getAttribute("am"));

	out.println("<HTML>"
			+ "FullName : " + fullName +"<BR>"
			+ "Mobile : " + number +"<BR>"
			+ "Source : " + source +"<BR>"
			+ "Destination : " + destination +"<BR>"
			+ "Vehicle : " + vehicle +"<BR>"
			+ "The total Amount is : " + amount +"<BR>"
			+ "</HTML>");
	out.println("Thank you for using Our Service");
	%>
</body>
</html>