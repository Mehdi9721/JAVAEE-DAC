<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="bookbean.BookDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
<%  
int id=Integer.parseInt(request.getParameter("id"));
String qu=request.getParameter("q");
int flag=BookDao.updateQuantity(id,qu);
%>
<%if(flag>0){ %>
<div style="color:green;">
CONGRATULATIONS YOU GOT YOUR BOOK!!!!!!!!!!
</div>
<jsp:include page="shelf.jsp"></jsp:include>
<%}else{ %>
CONGRATULATIONS YOU GOT OUR LAST AVAILABLE BOOK!!!!!!!!!!
<jsp:include page="shelf.jsp"></jsp:include>
<%} %>
</body>
</html>