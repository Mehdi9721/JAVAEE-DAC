<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="bookbean.BookDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int k=Integer.parseInt(request.getParameter("id"));
boolean flag=BookDao.delete(k);
%>
<%if(flag){ %>
<div style="color:red;font-size:20px">
BOOK DELETED SUCCESSFULLY!!!!!
</div>
<jsp:include page="../common/view.jsp"></jsp:include>
<%} %>
</body>
</html>