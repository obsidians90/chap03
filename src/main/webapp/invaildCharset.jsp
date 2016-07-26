<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Variable.jsp</title>
</head>
<body>
	<% String bookTitle = "JSP 프로그래밍";
	String author = "최범균";
	%>
<%= bookTitle %>의 저자는 <b><%= author %></b> 입니다.
	<h1>한글이 깨집니다</h1>
</body>
</html>
