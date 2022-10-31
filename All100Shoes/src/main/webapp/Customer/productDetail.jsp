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
}

</script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

	<%@include file="header.jsp"%>

<main>
	
	<form name = "detail" method = "post">
	
	  <div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
	  
	    <div class="card" style="width: 40rem; height: 0rem">
		  <img src = "./shoesFolder1/${productmodel}.png" class="card-img-top" alt="...">
	    </div>

	  </div> 
	    
	<table>
		    
		<tr style = " position: relative;  left: 900px; bottom: 20px">
			<td><h1><input type = "hidden" name = "productmodel" value = "${detail.productmodel }">${detail.productmodel }</h1></td>
		</tr>
		
		<tr style = " position: relative;  left: 900px; top: 100px">
			<td><h1><input type = "hidden" name = "productprice" value = "${detail.productprice }">${detail.productprice } 원</h1></td>
		</tr>
		    
	</table>
	    
    <table>
    	
   		 <tr style = " position: relative;  left: 790px; top: 240px;">
			<td>
				<select style = "width: 500px; height: 32px;" name = "productsize">
				    <c:forEach items = "${list}" var = "dto">
						<option value = "${dto.productsize }">${dto.productsize }</option>
				    </c:forEach>
				</select>
			</td>
		</tr>

   		 <tr style = " position: relative;  left: 790px; top: 240px;">
			<td>
				<select style = "width: 500px; height: 32px;" name = "productstock">
				    <c:forEach begin = "1" end = "10" var = "num">
						<option value = "${num }">${num}</option>
				    </c:forEach>
				</select>
			</td>
		</tr>

		<tr style = " position: relative;  left: 790px; top: 250px;">
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