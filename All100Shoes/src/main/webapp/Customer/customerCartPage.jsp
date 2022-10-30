<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript">
 var stmnLEFT = 10; // 오른쪽 여백 
 var stmnGAP1 = 0; // 위쪽 여백 
 var stmnGAP2 = 700; // 스크롤시 브라우저 위쪽과 떨어지는 거리 
 var stmnBASE = 800; // 스크롤 시작위치 
 var stmnActivateSpeed = 10; //스크롤을 인식하는 딜레이 (숫자가 클수록 느리게 인식)
 var stmnScrollSpeed = -400; //스크롤 속도 (클수록 느림)
 var stmnTimer; 
 
 function RefreshStaticMenu() { 
  var stmnStartPoint, stmnEndPoint; 
  stmnStartPoint = parseInt(document.getElementById('STATICMENU').style.top, 10); 
  stmnEndPoint = Math.max(document.documentElement.scrollTop, document.body.scrollTop) + stmnGAP2; 
  if (stmnEndPoint < stmnGAP1) stmnEndPoint = stmnGAP1; 
  if (stmnStartPoint != stmnEndPoint) { 
   stmnScrollAmount = Math.ceil( Math.abs( stmnEndPoint - stmnStartPoint ) / 15 ); 
   document.getElementById('STATICMENU').style.top = parseInt(document.getElementById('STATICMENU').style.top, 10) + ( ( stmnEndPoint<stmnStartPoint ) ? -stmnScrollAmount : stmnScrollAmount ) + 'px'; 
   stmnRefreshTimer = stmnScrollSpeed; 
   }
  stmnTimer = setTimeout("RefreshStaticMenu();", stmnActivateSpeed); 
  } 
 function InitializeStaticMenu() {
  document.getElementById('STATICMENU').style.right = stmnLEFT + 'px';  //처음에 오른쪽에 위치. left로 바꿔도.
  document.getElementById('STATICMENU').style.top = document.body.scrollTop + stmnBASE + 'px'; 
  RefreshStaticMenu();
  }
 
 function selectedBuy(){
	var form=document.cart;
	form.action="selectedProductBuy.do";
	form.submit();
 }
 
 function selectedDelete(){
	var form=document.cart;
	form.action="selectedProductDelete.do";
	form.submit();
 }
 
</script>

<style type="text/css">
#STATICMENU { margin: 0pt; padding: 0pt;  position: absolute; right: 0px; top: 0px;}
</style>


<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
crossorigin="anonymous">

</head>
<body id="본래 설정" onload="InitializeStaticMenu();">

	<%@include file="header.jsp"%>
	<br>
	<h1 style = "margin-left: 100px;">장바구니</h1>
	<br>
	
	<div class="container text-center">
		<form action="customerCartPage.do" name = "cart" method = "post">
			<button style="position: absolute; right: 150px; top: 170px;" type = "button" class="btn btn-dark" onclick="selectedDelete()">선택 상품 삭제</button>
			<table class="table">
				<thead>
				    <tr>
				      <th scope="col">선택</th>
				      <th scope="col">상품명</th>
				      <th scope="col">가격</th>
				      <th scope="col">사이즈</th>
				      <th scope="col">수량</th>
				      <th scope="col">삭제</th>
				    </tr>
				</thead>
			
			    <c:forEach items = "${list}" var = "dto">
			    
	    			<tbody>
					    <tr>
					    	<td><input type = "checkbox" name = "orderid" value = "${dto.orderid }"></td>
							<td><input type = "hidden" value = "${dto.productmodel}">${dto.productmodel}</td>
							<td><input type = "hidden" value = "${dto.productprice}">${dto.productprice}원</td>
							<td><input type = "hidden" value = "${dto.productsize}">${dto.productsize}</td>
					    	<td><input type = "hidden" value = "${dto.orderquantity}">${dto.orderquantity}</td>
							<td>
								<a href = "cartListDelete.do?orderid=${dto.orderid }">
									<button type = "button" class="btn btn-dark" style = "height: 20px; font-size: 15px; align: center;">삭제</button>
								</a>
							</td>
					    </tr>
		 			</tbody>
		 			
					
			    </c:forEach>
				<div id="STATICMENU">
					상품개수 : ${listCount}개 <br>
					합계금액 : ${totalPrice}원 <br>
					<button type = "button" class="btn btn-dark" onclick="selectedBuy()">선택한 상품 구매</button>
				</div>
			</table>
		</form>
		<br>
	</div>
	
	
	
	 	
		 
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" 
crossorigin="anonymous">
</script>

</body>
</html>