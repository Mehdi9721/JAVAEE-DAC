<%@page import="java.util.ArrayList" import="bean.EmpModel" import="dao.EmpDao"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
System.out.println("in body of edit");
int k=Integer.parseInt(request.getParameter("id"));
EmpModel e=EmpDao.singleDetail(k);
request.setAttribute("koo",k);

%>

<form action="editDb.jsp" method="post">
<br>
<table border="1" style="width:300px; margin-left:350px; background-color:white ">

<tr>
<td>NAME:</td>
<td><input type="text" name="name" value="<%=e.getName()%>"> </td>
</tr>
<tr>
<td>EMPID:</td>
<td><input type="text" name="id" value="<%=e.getId()%>"> </td>
</tr>

<tr>
<td>EMAIL:</td>
<td><input type="email" name="email" value="<%=e.getEmail()%>"></td>
</tr>

<tr>
<td>PASSWORD:</td>
<td><input type="password" name="pass" value="<%=e.getPass() %>>"></td>
</tr>

<tr>
<td>
GENDER:
</td>
<td>MALE
<%
if(e.getGender().equals("male")){
%>
<input type="radio" value="male" name="gender" checked="checked">
<%}else{%> 
<input type="radio" value="male" name="gender">
<%}%>
	
FEMALE
<%if(e.getGender().equals("female")){%>
<input type="radio" value="female" name="gender" checked="checked" >
<%}else{%>
<input type="radio" value="female" name="gender">
<%}%>
</td>
</tr>
<tr>
<td>
COUNTRY:
</td>
<td>
<select name="country">
<%if(e.getCountry().equals("india")){%>
<option value="india" selected>INDIA</option>
<%}else{%>
<option value="india">INDIA</option>
<%}%>

<%if(e.getCountry().equals("usa")){%>
<option value="usa" selected>USA</option>
<%}else{%>
<option value="usa">USA</option>
<%}%>

<%if(e.getCountry().equals("spain")){%>
<option value="spain" selected>SPAIN</option>
<%}else{%>
<option value="spain">SPAIN</option>
<%}%>


</select>
</td>
</tr>
<tr>
<td> <input type="submit" value="EDIT!!"> </td>
</tr>
</table>
</form>
</body>
</html>