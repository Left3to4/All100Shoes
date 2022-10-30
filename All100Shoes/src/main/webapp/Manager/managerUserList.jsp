<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<%@include file="managerHeader.jsp" %>
<div align="center" class = "container" style = "text-align: center;">
	<br>
	
	<h1></h1>
	
	<hr>
	<br>
	
	<nav class="navbar navbar-expand-lg bg-light" >
	
		<div class="container-fluid">
			<h1 class="navbar-brand" href="#">USER LIST</h1>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
				</button>
			</div>
				
		<div class="collapse navbar-collapse" id="navbarTogglerDemo02" style="align-items: center">
			<form action= "userlist.do" class="d-flex" role="search">
				<select name = "customer">
					<option value = "id">아이디</option>
					<option value = "name">이름</option>
					<option value = "phone" selected = "selected">전화번호</option>
					<option value = "address">주소</option>
					<option value = "initdate">가입일</option>
					<option value = "updatedate">수정일</option>
					<option value = "deletedate">삭제일</option>
				</select>&nbsp;&nbsp;&nbsp;
				
				<input type = "text" name = "content" size = "30" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
				<input type = "submit" value = "검색" class="btn btn-outline-success">
			</form>
			
			
		</div>
	</nav>
	
	<br>
	
	<table class="table table-sm" style = "width:80%, text-align: center;">
		<thead>
			<tr style="align-items: center">
				<th scope="col">번호</th>
				<th scope="col">아이디</th>
				<th scope="col">이름</th>
				<th scope="col">전화번호</th>
				<th scope="col">주소</th>
				<th scope="col">가입일</th>
				<th scope="col">수정일</th>
				<th scope="col">삭제일</th>
			</tr>
		</thead>
		
		<c:forEach items = "${USERLIST}" var = "dto">
				<tr>
					<td>${dto.customerseq}</td>
					<td>${dto.customername}</td>
					<td>${dto.customerphone}</td>
					<td>${dto.customeraddress}</td>
					<td>${dto.customerinitdate}</td>
					<td>${dto.customerupdatedate}</td>
					<td>${dto.customerdeletedate}</td>
				</tr>
		</c:forEach>
		
	</table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>