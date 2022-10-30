<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

function cartInsert(){
	var form = document.detail;
					
		form.action = "productCart.do";
		form.submit();
	<%-- var customerid = <%=(String)session.getAttribute("CUSTOMERID") %>;
	
	if(customerid == null) {
		alert("로그인 후 진행 가능한 기능입니다.");
		
	} else {
		alert("로그인 후 진행 가능한 기능입니다.");
		form.action = "login.do";
		form.submit();
		
	} --%>
}

</script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

	<%@include file="header.jsp"%>

<main>
	
	<form name = "detail" method = "post">
	
	  <div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
	  
	    <div class="card" style="width: 18rem; height: 18rem">
		  <img src = "./shoesFolder1/1.png" class="card-img-top" alt="...">
	    </div>

	    <div class="card" style="width: 18rem; height: 18rem">
		  <img src="./shoesFolder2/1.png" class="card-img-top" alt="...">
	    </div>
		    
	  </div>
	    
	<table>
		    
		<tr style = " position: relative;  left: 900px; bottom: 300px">
			<td><h1><input type = "hidden" name = "productmodel" value = "${detail.productmodel }">${detail.productmodel }</h1></td>
		</tr>
		
		<tr style = " position: relative;  left: 900px; bottom: 200px">
			<td><h1><input type = "hidden" name = "productprice" value = "${detail.productprice }">${detail.productprice } 원</h1></td>
		</tr>
		    
	</table>
	    
	<div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
		<div class="card" style="width: 18rem; height: 18rem; bottom: 150px">
			<img src="./shoesFolder3/1.png" class="card-img-top" alt="...">	
		</div>
	    
		<div class="card" style="width: 18rem; height: 18rem; bottom: 150px">
			<img src="./shoesFolder4/1.png" class="card-img-top" alt="...">
		</div>
	</div>
	  
	   
    <table>
    	<tr style = " position: relative;  left: 700px; bottom: 400px">
    		<td>
    		
   			</td>
    	</tr>
    	
   		 <tr style = " position: relative;  left: 790px; bottom: 320px;">
			<td>
				 <select style = "width: 500px; height: 32px;" name = "productsize">
				    <c:forEach items = "${list}" var = "dto">
						<option value = "${dto.productsize }">${dto.productsize }</option>
				    </c:forEach>
				</select>
			</td>
		</tr>

   		 <tr style = " position: relative;  left: 790px; bottom: 320px;">
			<td>
				<select style = "width: 500px; height: 32px;" name = "productstock">
				    <c:forEach begin = "1" end = "10" var = "num">
						<option value = "${num }">${num}</option>
				    </c:forEach>
				</select>
			</td>
		</tr>

		<tr style = " position: relative;  left: 790px; bottom: 300px;">
			<td>
				<button type = "button" class="btn btn-dark me-2" style = "width: 500px;" onclick="cartInsert()">CART</button>
			</td>
		</tr>
		
    </table>
  </form>
  
</main>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>