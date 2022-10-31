<%@ page language="java" 
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<header
	class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">


<a href = "customerProductList.do"><img src="sport-shoe.png" style="width: 80px; margin-left: 30px;" /></a>

<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="customerProductList.do">All</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Nike
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=nike&pcategory=sneakers">Sneakers</a></li>
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=nike&pcategory=running">Running</a></li>
            <!-- <li><hr class="dropdown-divider"></li> -->
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=nike&pcategory=basketball">Basketball</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Adidas
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=adidas&pcategory=sneakers">Sneakers</a></li>
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=adidas&pcategory=running">Running</a></li>
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=adidas&pcategory=basketball">Basketball</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Underarmour
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=underarmour&pcategory=sneakers">Sneakers</a></li>
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=underarmour&pcategory=running">Running</a></li>
            <li><a class="dropdown-item" href="customerProductListCategory.do?pbrand=underarmour&pcategory=basketball">Basketball</a></li>
          </ul>
        </li>
      </ul>
      <form class="d-flex" role="search">
      	<select name="query">
		<option value="productmodel" selected="selected">model</option>
		<option value="productbrand">brand</option>
		</select>&nbsp;&nbsp;&nbsp;
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="content">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
 
	<div class="col-md-4 text-end" style="margin-right: 30px;">
		<%if (session.getAttribute("CUSTOMERID") == null) { %>
			<form name="loginbtn" method="post">
				<input type="button" class="btn btn-outline-dark me-2" onclick="login()" value="Log in"> 
				<input type="button" class="btn btn-dark me-2" onclick="signup()" value="Sign Up">
			</form>
		<%} %>
		
		<%if (session.getAttribute("CUSTOMERID") != null) { %>
			<form name="loginokay" method="post" style="position: absolute; right: 0px; top: 30px;">
				<%=session.getAttribute("CUSTOMERID") %>님, 안녕하세요! 
				<input type="submit" class="btn btn-dark" onclick="mypage()" value="마이페이지">
				<input type="submit" class="btn btn-outline-dark me-2" onclick="javascript: form.action='customerCartPage.do'" value="장바구니">
			</form>
			<div class="col-md-4 text-end">
				<form name="loginokay" method="post" style="position: absolute; right: 0px; top: 70px;">
					<input type="submit" style="position: absolute; right: 85px;" class="btn btn-outline-dark me-2" onclick="javascript: form.action='customerBuyList.do'" value="구매 리스트">
					<input type="submit" style="position: absolute; right: 10px;" class="btn btn-dark" onclick="javascript: form.action='login.do'" value="로그아웃">
				</form>
			</div>
		<%} %>
	</div>
	
	
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	
</header>