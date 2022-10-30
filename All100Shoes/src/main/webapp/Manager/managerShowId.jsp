<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID 찾기</title>
</head>
<body>
<div align="center">
<c:if test="${MANAGERID==null }">
<h2 style="margin:20px">ID를 찾을 수 없습니다.</h2>
</c:if>
<c:if test="${MANAGERID!=null }">
<h2 style="margin:20px">ID는 ${MANAGERID }입니다.</h2>
</c:if>
<a href="managerlogin.jsp">로그인 화면으로</a>
</div>
</body>
</html>
