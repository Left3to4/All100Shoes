<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, 그리고 Bootstrap 기여자들">
<meta name="generator" content="Hugo 0.104.2">

<title>HOME</title>

<link rel="canonical"
	href="https://getbootstrap.kr/docs/5.2/examples/product/">
	
<link href="/docs/5.2/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
	
<link rel="shortcut icon" href="sport-shoe.png" sizes="180x180">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
	

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

</head>
<body>
	<%@include file="managerHeader.jsp" %>
	
	<main>
		<form action="managermain.do" name="main" method="post">
			<div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
				<div
					class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
					<div class="my-3 py-3">
						<h2 class="display-5">오늘 가입한 고객 수</h2>
					</div>
					<div class="bg-light shadow-sm mx-auto"
						style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
						<p class="lead">${SIGNTODAY}</p>
					</div>
				</div>
			
				<div
					class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
					<div class="my-3 py-3">
						<h2 class="display-5">오늘 판매 건수</h2>
					</div>
					<div class="bg-light shadow-sm mx-auto"
						style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
						<p class="lead">${ORDERSTODAY}</p>
					</div>
				</div>
				<div class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
					<div class="my-3 py-3">
						<h2 class="display-5">오늘 매출</h2>
					</div>
					<div class="bg-light shadow-sm mx-auto"
						style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
						<p class="lead">${SALESTODAY}</p>
					</div>
				</div>
			</div>
		</form>
	</main>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js"
		integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk"
		crossorigin="anonymous"></script>
	
</body>
</html>