<%@page import="bean.EmpModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.EmpDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<EmpModel> al=new ArrayList<>();
EmpDao.details(al);
%>
<%if(al.size()!=0 ){%>
<table border="1">
<th>
EMPID:
</th>
<th>
NAME:
</th>
<th>
PASSWORD:
</th>
<th>
EMAIL:
</th>
<th>
GENDER:
</th>
<th>
COUNTRY:
</th>
<th>
EDIT:
</th>
<th>
DELETE:
</th>

<% for(int i=0;i<al.size();i++){

%>
<tr>
<td><%=al.get(i).getId()%></td>
<td><%=al.get(i).getName()%></td>	
<td><%=al.get(i).getPass()%></td>	
<td><%=al.get(i).getEmail()%></td>	
<td><%=al.get(i).getGender()%></td>	
<td><%=al.get(i).getCountry()%></td>	
<td>
<a href="edit.jsp?id=<%=al.get(i).getId()%>">Edit</a>
</td>
<td><a href="delete.jsp?id=<%=al.get(i).getId()%>">Delete</a></td>
</tr>	
<%}%>
<%}else{ %>
<div style="color:red; font-size:20px">
NO EMPLOYEE DETAILS FOUND, KINDLY ADD NEW EMPLOYEES FIRST
</div>
<a href="add.jsp"> CLICK HERE TO ADD!!!</a>
<%} %>
</table>
</body>
</html>