<%@page import="java.util.List"%>
<%@page import="dto.Mdetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>
<th>email</th>
<th>aadharnumber</th>
<th>delete</th>
<th>delete</th>
</tr>
<%List<Mdetails> list= (List<Mdetails>) request.getAttribute("data"); %>
<%for(Mdetails dto:list) {%>
<tr>
<td><%=dto.getEmail()%></td>
<td><%=dto.getAadharnumber()%></td>
<td><a href="delete?email=<%=dto.getEmail()%>">delete</a></td>
<td><a href="update.html?email=<%=dto.getEmail()%>">update</a></td>
</tr>
<%} %>
</table>
</body>
</html>