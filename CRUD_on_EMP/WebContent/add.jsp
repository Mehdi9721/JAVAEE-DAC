<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center;margin-top:60px;display:flex;justify-content:center;flex-direction:column; background-color:#D0F0C0">
<div>
CLICK TO VIEW ALL EMPLOYEES!!!
<a href="view.jsp" >VIEW EMPLOYEES</a>
</div>
<br>
<form action="addemp.jsp" method="post">
<br>
<table border="1" style="width:300px; margin-left:350px; background-color:white ">

<tr>
<td>NAME:</td>
<td><input type="text" name="name" required="required"></td>
</tr>

<tr>
<td>EMPID:</td>
<td><input type="text" name="id" required="required"></td>
</tr>

<tr>
<td>EMAIL:</td>
<td><input type="email" name="email"></td>
</tr>

<tr>
<td>PASSWORD:</td>
<td><input type="password" name="pass" required="required"></td>
</tr>
<tr>
<td>
GENDER:
</td>
<td>MALE
<input type="radio" value="male" name="gender">
FEMALE
<input type="radio" value="female" name="gender">
</td>
</tr>

<tr>
<td>
COUNTRY:
</td>
<td>
<select name="country">
<option value="india">INDIA</option>
<option value="usa">USA</option>
<option value="spain">SPAIN</option>
</select>

</td>
</tr>


<tr>
<td> <input type="submit" value="ADD EMP!!"> </td>
</tr>
ADD NEW EMPLOYEE HERE
</table>
</form>
</body>
</html>