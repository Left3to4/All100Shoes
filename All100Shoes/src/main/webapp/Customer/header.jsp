<%@ page language="java" 
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<header
	class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">


<a href = "customerProductList.do"><img src="sport-shoe.png" style="width: 80px; margin-left: 30px;" /></a>

	<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-10" style="margin-left: 300px;">
		<li><a href="#" class="nav-link px-2 link-secondary">Home</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">브랜드</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">카테고리</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">상품검색</a></li>
	</ul>
 
	<div class="col-md-4 text-end">
		<%if (session.getAttribute("CUSTOMERID") == null) { %>
			<form name="loginbtn" method="post">
				<input type="button" class="btn btn-outline-dark me-2" onclick="login()" value="Log in"> 
				<input type="button" class="btn btn-dark me-2" onclick="signup()" value="Sign Up">
			</form>
		<%} %>
		
		<%if (session.getAttribute("CUSTOMERID") != null) { %>
			<form name="loginokay" method="post">
				<%=session.getAttribute("CUSTOMERID") %>님, 안녕하세요! 
				<input type="submit" class="btn btn-dark" onclick="mypage()" value="마이페이지">
				<input type="submit" class="btn btn-outline-dark me-2" onclick="javascript: form.action='login.do'" value="로그아웃">
				<input type="submit" class="btn btn-dark" onclick="javascript: form.action='customerCartPage.do'" value="장바구니">
			</form>
		<%} %>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	
</header>