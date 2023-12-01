<%@page import="bookbean.Book"%>
<%@page import="bookbean.BookDao" %>
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
boolean veri=BookDao.verfy(b.getId());
%>
<%if(veri){ %>
<% boolean flag=BookDao.book(b); %>
<%if(flag){ %>
<div style="color:green;font-size:20px">
BOOK ADDED TO SHELF!!
</div>
<a href="../common/view.jsp">Click to view Books</a>
<br>
<br>
<jsp:include page="newbook.jsp"></jsp:include>

<%}else{ %>
<div>
NOT ABLE TO ADD BOOK
<jsp:include page="newbook.jsp"></jsp:include>
</div>
<%} %>
<%}else {%>
THIS BOOK IS ALREADY PRESENT IN SHELF!!
<br>
IF YOU WANT TO INCREASE QUANTITY CLICK HERE
<a href="#">INCREASE QUANTITY</a>
<%} %>
</body>
</html>