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
<body>
<%
Book k=BookDao.one(Integer.parseInt(request.getParameter("id")));
%>
<form action="editBook.jsp">
BOOK NAME:
<br>
<input type="text" name="bookname" value=<%= k.getBookname() %> >
<br>
<br>
BOOK ID:
<br>
<input type="text" name="id" value=<%= k.getId() %>>
<br>
<br>
AUTHOR NAME:
<br>
<input type="text" name="authname" value=<%= k.getAuthName() %>>
<br>
<br>
QUANTITY OF BOOK:
<br>
<input type="text" name="quantity" value=<%= k.getQuantity() %>>
<br>
<br>
PRICE:
<br>
<input type="text" name="price" value=<%= k.getPrice() %>>
<br>
<br>
<input type="submit" value="EDIT!!">
</form>
</body>
</html>