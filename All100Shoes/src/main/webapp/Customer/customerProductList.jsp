<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.104.2">
<title>ProductList</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.2/examples/product/">


<script type="text/javascript">
	function login() {
		var form = document.loginbtn;
		form.action = "login.jsp";
		form.submit();
	}

	function logout() {
		var form = document.loginokay;
		form.action = "main.jsp?id=null";
		form.submit();
	}
</script>


<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<!-- Favicons -->
<link rel="apple-touch-icon"
	href="/docs/5.2/assets/img/favicons/apple-touch-icon.png"
	sizes="180x180">
<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon-32x32.png"
	sizes="32x32" type="image/png">
<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon-16x16.png"
	sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/5.2/assets/img/favicons/manifest.json">
<link rel="mask-icon"
	href="/docs/5.2/assets/img/favicons/safari-pinned-tab.svg"
	color="#712cf9">
<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#712cf9">


<style>

.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.b-example-divider {
	height: 3rem;
	background-color: rgba(0, 0, 0, .1);
	border: solid rgba(0, 0, 0, .15);
	border-width: 1px 0;
	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em
		rgba(0, 0, 0, .15);
}

.b-example-vr {
	flex-shrink: 0;
	width: 1.5rem;
	height: 100vh;
}

.bi {
	vertical-align: -.125em;
	fill: currentColor;
}

.nav-scroller {
	position: relative;
	z-index: 2;
	height: 2.75rem;
	overflow-y: hidden;
}

.nav-scroller .nav {
	display: flex;
	flex-wrap: nowrap;
	padding-bottom: 1rem;
	margin-top: -1px;
	overflow-x: auto;
	text-align: center;
	white-space: nowrap;
	-webkit-overflow-scrolling: touch;
}
</style>


<!-- Custom styles for this template -->
<link href="product.css" rel="stylesheet">
<link href="sidebars.css" rel="stylesheet">
</head>
<body>

	<%@include file="header.jsp"%>
	
<!--  <form action="customerProductList.do">
		검색 선택 : 
			<select name="query">
				<option value="productmodel" selected="selected">model</option>
				<option value="productbrand">brand</option>
			</select>&nbsp;&nbsp;&nbsp;
			<input type="text" name="content" size="30">
			<input type="submit" value="검색">
	</form>  -->

	<main>
	
<!-- 	<div class="flex-shrink-0 p-3 bg-white" style="width: 280px;">
    <a href="/" class="d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom">
      <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-5 fw-semibold">Collapsible</span>
    </a>
    <ul class="list-unstyled ps-0">
      <li class="mb-1">
      <a href="customerProductList.do">
        <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#home-collapse" aria-expanded="true">
          All
        </button>
      </a>
      </li>
      <li class="mb-1">
      <a>
        <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#dashboard-collapse" aria-expanded="false">
          Nike
        </button>
      </a>
        <div class="collapse" id="dashboard-collapse">
          <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
            <li><a href="customerProductListCategory.do?pbrand=nike&pcategory=sneakers" class="link-dark d-inline-flex text-decoration-none rounded">sneakers</a></li>
            <li><a href="customerProductListCategory.do?pbrand=nike&pcategory=running" class="link-dark d-inline-flex text-decoration-none rounded">running</a></li>
            <li><a href="customerProductListCategory.do?pbrand=nike&pcategory=basketball" class="link-dark d-inline-flex text-decoration-none rounded">basketball</a></li>
          </ul>
        </div>
      </li>
      <li class="mb-1">
        <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#orders-collapse" aria-expanded="false">
          Adidas
        </button>
        <div class="collapse" id="orders-collapse">
          <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
            <li><a href="customerProductListCategory.do?pbrand=adidas&pcategory=sneakers" class="link-dark d-inline-flex text-decoration-none rounded">sneakers</a></li>
            <li><a href="customerProductListCategory.do?pbrand=adidas&pcategory=running" class="link-dark d-inline-flex text-decoration-none rounded">running</a></li>
            <li><a href="customerProductListCategory.do?pbrand=adidas&pcategory=basketball" class="link-dark d-inline-flex text-decoration-none rounded">basketball</a></li>
          </ul>
        </div>
      </li>
    </ul>
  </div> -->
	
		
<!-- 		<div class="flex-shrink-0 p-3 bg-white" style="width: 280px;">
    <a href="/" class="d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom">
      <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-5 fw-semibold">Collapsible</span>
    </a>
    <ul class="list-unstyled ps-0">
      <li class="mb-1">
      <a href="customerProductList.do">
        <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#home-collapse" aria-expanded="true">
          All
        </button>
      </a>
      </li>
      <li class="mb-1">
      <a>
        <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#dashboard-collapse" aria-expanded="false">
          Nike
        </button>
      </a>
        <div class="collapse" id="dashboard-collapse">
          <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
            <li><a href="customerProductListCategory.do?pbrand=nike&pcategory=sneakers" class="link-dark d-inline-flex text-decoration-none rounded">sneakers</a></li>
            <li><a href="customerProductListCategory.do?pbrand=nike&pcategory=running" class="link-dark d-inline-flex text-decoration-none rounded">running</a></li>
            <li><a href="customerProductListCategory.do?pbrand=nike&pcategory=basketball" class="link-dark d-inline-flex text-decoration-none rounded">basketball</a></li>
          </ul>
        </div>
      </li>
      <li class="mb-1">
        <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#orders-collapse" aria-expanded="false">
          Adidas
        </button>
        <div class="collapse" id="orders-collapse">
          <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
            <li><a href="customerProductListCategory.do?pbrand=adidas&pcategory=sneakers" class="link-dark d-inline-flex text-decoration-none rounded">sneakers</a></li>
            <li><a href="customerProductListCategory.do?pbrand=adidas&pcategory=running" class="link-dark d-inline-flex text-decoration-none rounded">running</a></li>
            <li><a href="customerProductListCategory.do?pbrand=adidas&pcategory=basketball" class="link-dark d-inline-flex text-decoration-none rounded">basketball</a></li>
          </ul>
        </div>
      </li>
    </ul>
  </div> -->
		
		<div class="row">
			
			<c:forEach items="${productList}" var="dto">
				<div class="col">
					<div class="card" style="width: 14rem;">
					<a href="productDetail.do?productmodel=${dto.productmodel}">
						<img src="./productListImage/practice.png" class="card-img-top"
							alt="${dto.productmodel}">
					</a>
						<div class="card-body">
							<p class="card-text" align="center">${dto.productbrand} ${dto.productmodel}</p>
							<p class="card-text" align="center">${dto.productprice}</p>
						</div>
					</div>
				</div>
			</c:forEach>
			
			<c:forEach items="${productListCategory}" var="dto">
				<div class="col">
					<div class="card" style="width: 14rem;">
					<a href="productDetail.do?productmodel=${dto.productmodel}">
						<img src="./productListImage/practice.png" class="card-img-top"
							alt="${dto.productmodel}">
					</a>
						<div class="card-body">
							<p class="card-text" align="center">${dto.productbrand} ${dto.productmodel}</p>
							<p class="card-text" align="center">${dto.productprice}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>

	</main>

	<script src="/docs/5.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>


</body>
</html>
