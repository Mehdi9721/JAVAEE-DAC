
<%@page import="bookbean.BookDao"%>

<%@page import="bookbean.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="text-align:center">
<% List<Book> ls=BookDao.allBook();
%>
<div>
OUR BOOKS!!!
</div>
<br>
<table border="1">
<th>BOOK NAME </th>
<th>AUTHOR NAME </th>
<th>PRICE </th>
<th>AVAILABLE </th>
<th>BUY BOOK </th>
<%
for(Book b:ls){
%>
<tr>
<td><%=b.getBookname() %></td>
<td><%=b.getAuthName()   %></td>
<td><%= b.getPrice() %></td>
<td><%= b.getQuantity() %></td>
<td><a href="updateQuantity.jsp?id=<%=b.getId() %>&&q=<%= b.getQuantity() %>">BUY</a></td>
</tr>
<%} %>
<tr>
</table>


</body>
</html>