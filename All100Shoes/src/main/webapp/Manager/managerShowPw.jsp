<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${MANAGERPW==null }">
비밀번호를 찾을 수 없습니다.
</c:if>
<c:if test="${MANAGERPW!=null }">
비밀번호는 ${MANAGERPW }입니다.
</c:if>
</body>
</html>