<%@page import="bean.EmpModel" import="dao.EmpDao"%>
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
EmpModel e=new EmpModel();
e.setCountry(request.getParameter("country"));
e.setId(Integer.parseInt(request.getParameter("id")));
e.setEmail(request.getParameter("email"));
e.setGender(request.getParameter("gender"));
e.setName(request.getParameter("name"));
e.setPass(request.getParameter("pass"));
e.setIdForEdit(e.getId());
System.out.println(e.getIdForEdit()+" edit id");
int i=EmpDao.update(e);
%>
<%if(i>0){ %>
<div style="color:green; font-size:20px" >
EDITED SUCCESSFULLY!!!
</div>
<br>
<div>
<jsp:include page="view.jsp"></jsp:include>
</div>
<%}else{%>
NOT ABLE TO EDIT
<%} %>
</body>
</html>