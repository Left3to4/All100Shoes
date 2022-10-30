<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, 그리고 Bootstrap 기여자들">
<meta name="generator" content="Hugo 0.104.2">
<title>All100Shoes</title>

<link rel="canonical"
	href="https://getbootstrap.kr/docs/5.2/examples/product/">

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



<link href="/docs/5.2/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">

<!-- Favicons -->
<link rel="shortcut icon" href="sport-shoe.png" sizes="180x180">


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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">

</head>
<body>
	<%@include file="header.jsp"%>

	<main>
		<div
			class="position-relative overflow-hidden p-3 p-md-5 m-md-3 text-center bg-light enable-validation-icons-true">
			<div
				class="col-md-5 p-lg-3 mx-auto my-5 enable-validation-icons-true"
				style="background-image: 6.png; margin: -100%">
				<h1 class="display-4 fw-normal">All100Shoes</h1>
				<p class="lead fw-normal" style="font-size: 0.9em">별에도 별이 사람들의
					까닭입니다. 까닭이요, 잔디가 멀리 하나에 하나에 별들을 애기 때 나는 듯합니다. 사람들의 아무 봄이 그리워 많은 묻힌
					풀이 이국 계십니다. 시와 부끄러운 어머니, 못 걱정도 패, 당신은 우는 까닭입니다. 사랑과 않은 가을 봅니다. 오는
					나는 라이너 오면 하나 쓸쓸함과 별 거외다.</p>
			</div>
			<div class="product-device shadow-sm d-none d-md-block"></div>
			<div
				class="product-device product-device-2 shadow-sm d-none d-md-block"></div>
		</div>

		<div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
			<div
				class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
				<div class="my-3 py-3">
					<h2 class="display-5">Lorem Ipsum</h2>
					<p class="lead">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Donec porttitor.</p>
				</div>
				<div class="bg-light shadow-sm mx-auto"
					style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
					<img src="1.png" style="width: 90%">
				</div>
			</div>
			<div
				class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
				<div class="my-3 py-3">
					<h2 class="display-5">Lorem Ipsum</h2>
					<p class="lead">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Donec porttitor.</p>
				</div>
				<div class="bg-light shadow-sm mx-auto"
					style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
					<img src="2.png" style="width: 90%">
				</div>
			</div>
			<div
				class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
				<div class="my-3 py-3">
					<h2 class="display-5">Lorem Ipsum</h2>
					<p class="lead">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Donec porttitor.</p>
				</div>
				<div class="bg-light shadow-sm mx-auto"
					style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
					<img src="3.png" style="width: 90%">
				</div>
			</div>
		</div>

		<div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
			<div
				class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
				<div class="my-3 py-3">
					<h2 class="display-5">Lorem Ipsum</h2>
					<p class="lead">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Donec porttitor.</p>
				</div>
				<div class="bg-light shadow-sm mx-auto"
					style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
					<img src="4.png" style="width: 90%">
				</div>
			</div>
			<div
				class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
				<div class="my-3 py-3">
					<h2 class="display-5">Lorem Ipsum</h2>
					<p class="lead">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Donec porttitor.</p>
				</div>
				<div class="bg-light shadow-sm mx-auto"
					style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
					<img src="5.png" style="width: 90%">
				</div>
			</div>
			<div
				class="text bg-light me-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
				<div class="my-3 py-3">
					<h2 class="display-5">Lorem Ipsum</h2>
					<p class="lead">Lorem ipsum dolor sit amet, consectetur
						adipiscing elit. Donec porttitor.</p>
				</div>
				<div class="bg-light shadow-sm mx-auto"
					style="width: 80%; height: 300px; border-radius: 21px 21px 0 0; background: #c5cae9">
					<img src="6.png" style="width: 90%">
				</div>
			</div>
		</div>
	</main>

	<%@include file="footer.jsp"%>


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
		<!-- 부트스트랩 사용을 위한 준비 -->
</body>
</html>