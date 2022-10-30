<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매출 관리</title>
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
			<h1 class="navbar-brand" href="#">SALES LIST</h1>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
				</button>
			</div>
				
		<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-10">
			<li><a href="sales.do?" class="nav-link px-2 link-secondary">일별</a></li>
			<li><a href="sales.do" class="nav-link px-2 link-secondary">주별</a></li>
			<li><a href="sales.do" class="nav-link px-2 link-secondary">월별</a></li>
			<li><a href="sales.do" class="nav-link px-2 link-secondary">년별</a></li> &nbsp;&nbsp;&nbsp;
		</ul>	
				
		<div class="collapse navbar-collapse" id="navbarTogglerDemo02" style="align-items: center">
			<form action= "sales.do" class="d-flex" role="search">
				
				<input type = "text" name = "content" size = "30" class="form-control me-2" type="search" placeholder="Start" aria-label="Search"> -&nbsp;
				<input type = "text" name = "content" size = "30" class="form-control me-2" type="search" placeholder="End" aria-label="Search">
				<input type = "submit" value = "검색" class="btn btn-outline-success">
			</form>
			
			
		</div>
	</nav>
	
	<br>
	
	<table class="table table-sm" style = "width:80%, text-align: center;">
		<thead>
			<tr style="align-items: center">
				<th scope="col">날짜</th>
				<th scope="col">매출</th>
			</tr>
		</thead>
		
		<c:forEach items = "${SALESLIST}" var = "dto">
				<tr>
					<td>${dto.orderdate}</td>
					<td>${dto.sales}</td>
				</tr>
		</c:forEach>
		
	</table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>