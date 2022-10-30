<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
<link rel= "stylesheet" href="signup.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>

<%@include file="header.jsp"%>
<body >

<div class="divPosition">
<h3 align="center" >PW 찾기</h3>
<div id="wrap" >
<form action="findpw.do" method="post">
	<table border="0" align="center" >
	<tr>
		<td>ID: </td>
		<td><input type="text" name="customerid"><br></td>
	</tr>
 	<tr>
		<td>전화번호: </td>
		<td><input type="text" name="customerphone"><br></td>
	</tr>
	<tr>
		<td><input type="submit" value="확인">"${PW}"</td>
		</tr>
</table>
</form>
</div>
</div>
</body>
</html>