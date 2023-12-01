<%@page import="bookbean.Book"%>
<%@page import="bookbean.BookDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
<% List<Book> ls=BookDao.allBook();
%>
<div>
YOUR ALL BOOKS!!!
</div>
<br>
<table border="1">
<th>ID </th>
<th>BOOK NAME </th>
<th>AUTHOR NAME </th>
<th>PRICE </th>
<th>AVAILABLE </th>
<th>EDIT BOOK </th>
<th>DELETE BOOK </th>
<%
for(Book b:ls){
%>
<tr>
<td>
<%=b.getId() %>
</td>
<td><%=b.getBookname() %></td>
<td><%=b.getAuthName()   %></td>
<td><%= b.getPrice() %></td>
<td><%= b.getQuantity() %></td>
<td><a href="../admin/edit.jsp?id=<%= b.getId() %>">EDIT</a></td>
<td><a href="../admin/delete.jsp?id=<%= b.getId() %>">DELETE</a></td>

</tr>
<%} %>
<tr>
</table>


</body>
</html>