<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
<%
if(request.getParameter("name").equals("admin")&&request.getParameter("pass").equals("admin123"))
{%>
<div style="color:green">
WELCOME ADMIN
</div>
<br>
<br>
<div>
<jsp:include page="adminBookManage.jsp"></jsp:include>
</div>
<%}else {%>
<div style="color:red">
 INCORRECT USERNAME OR PASSWORD
 </div>
 <div>
 <br>
 <jsp:include page="adminLogin.jsp"></jsp:include>
</div>
<%} %>
</body>
</html>