<%@page import="dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="emp" class="bean.EmpModel"></jsp:useBean>
	<jsp:setProperty property="*" name="emp"></jsp:setProperty>
<%
emp.setId(Integer.parseInt(request.getParameter("id")));
emp.setName(request.getParameter("name"));
emp.setPass(request.getParameter("pass"));
emp.setEmail(request.getParameter("email"));
emp.setGender(request.getParameter("gender"));
emp.setCountry(request.getParameter("country"));
System.out.println(request.getParameter("pass"));
System.out.println(request.getParameter("country"));
boolean flag=EmpDao.valid(emp);
if(!flag){
	int i=EmpDao.addemp(emp);
	if(i>0){
		response.sendRedirect("success.jsp");
	}else{		
	response.sendRedirect("error.jsp");
	}	
}else{
	response.sendRedirect("errorIdIsPresent.jsp");
}

%>
</body>
</html>