<%@ page language="java" 
	pageEncoding="UTF-8"%>
<header
	class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
	
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

<script type="text/javascript">
	function logout() {
		var form = document.loginokay;
		form.action = "http://localhost:8080/All100Shoes/Customer/main.jsp?id=null";
		sessionStorage.clear();
		form.submit();
		
	}
	
	function mypage(){
		var form=document.loginokay;
		form.action="mypage.do";
		form.submit();
	}
</script>


<img src="sport-shoe.png" style="width: 80px; margin-left: 30px;">
	<ul class="nav col-8 col-md-auto mb-2 justify-content-center mb-md-10">
		<li><a href="managermain.do" class="nav-link px-2 link-secondary">HOME</a></li>
		<li><a href="userlist.do" class="nav-link px-2 link-secondary">USERS</a></li>
		<li><a href="productlist.do" class="nav-link px-2 link-secondary">PRODUCTS</a></li>
		<li><a href="sales.do" class="nav-link px-2 link-secondary">SALES</a></li>
		<li><a href="history.do" class="nav-link px-2 link-secondary">HISTORY</a></li>
	</ul>
 
	<div class="col-md-4 text-end" style="margin-right: 30px;">
			<form name="loginokay" method="post">
				${MANAGERNAME}님, 안녕하세요! &nbsp;&nbsp;&nbsp;<input type="button" class="btn btn-dark"
					onclick="mypage()" value="마이페이지"> <input type="button"
					class="btn btn-outline-dark me-2" onclick="logout()" value="로그아웃">
			</form>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	
</header>