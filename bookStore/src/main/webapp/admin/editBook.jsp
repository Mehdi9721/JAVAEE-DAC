<%@page import="bookbean.Book"%>
<%@page import="bookbean.BookDao"%>
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

Book b=new Book();
b.setAuthName(request.getParameter("authname"));
b.setBookname(request.getParameter("bookname"));
b.setId(Integer.parseInt(request.getParameter("id")));
b.setPrice(request.getParameter("price"));
b.setQuantity(request.getParameter("quantity"));
boolean flag=BookDao.edit(b);
%>
<%if(flag){%>
<div style="color:green;font-size:20px">
EDITED SUCCESSFULLY!!!!
</div>
<jsp:include page="../common/view.jsp"></jsp:include>

<%} %>
</body>
</html>