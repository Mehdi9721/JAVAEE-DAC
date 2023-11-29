<%@page import="dao.EmpDao"%>
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
int id=Integer.parseInt(request.getParameter("id"));
System.out.print(id);
int i=EmpDao.delete(id);
%>
<%if(i>0){
	%>
	<div style="color:#568203">
SUCCESSFULLY DELETED EMPLOYEE!!!!!!!!!!!!!
</div>
<jsp:include page="view.jsp"></jsp:include>
<%} %>
</body>
</html>