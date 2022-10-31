<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
crossorigin="anonymous">
</head>
<body>

	<%@include file="header.jsp" %>

	<br>
	<h1 style = "margin-left: 100px;">구매 리스트</h1>
	<br>
	
	<div class="container text-center">
		<form action="customerCartPage.do" name = "cart" method = "post">
			<table class="table">
			
				<thead>
				    <tr>
				      <th scope="col">브랜드</th>
				      <th scope="col">모델명</th>
				      <th scope="col">사이즈</th>
				      <th scope="col">구매수량</th>
				      <th scope="col">구매가격</th>
				      <th scope="col">구매날짜</th>
				    </tr>
				</thead>
			
			    <c:forEach items = "${buyList}" var = "dto">
			    
	    			<tbody>
					    <tr>
							<td><input type = "hidden" value = "${dto.produdctbrand}">${dto.produdctbrand}</td>
							<td><input type = "hidden" value = "${dto.productmodel}">${dto.productmodel}</td>
							<td><input type = "hidden" value = "${dto.productsize}">${dto.productsize}</td>
							<td><input type = "hidden" value = "${dto.orderquantity}">${dto.orderquantity}</td>
							<td><input type = "hidden" value = "${dto.orderprice}">${dto.orderprice}</td>
							<td><input type = "hidden" value = "${dto.orderdate}">${dto.orderdate}</td>
					    </tr>
		 			</tbody>
		 			
					
			    </c:forEach>
			    
			</table>
		</form>
	</div>

<%
int nowpage = (Integer)(request.getAttribute("page"));
int maxpage = (Integer)(request.getAttribute("maxpage"));
int startpage = (Integer)(request.getAttribute("startpage"));
int endpage = (Integer)(request.getAttribute("endpage"));
%>

<div align="center">
<table>
<!-- 페이지 번호 시작 -->
   <tr align="center" height="20">
      <td colspan="5">
      <%if(nowpage <= 1){ %>
      [이전] &nbsp;
      <%}else{%>
		    <%--  <a href="customerBuyList.do?command=board_list&page=<%= nowpage-1 %>">[이전]</a>&nbsp; --%>
		     <a href="http://localhost:8080/All100Shoes/Customer/customerBuyList.do?command=board_list&page=<%= nowpage-1 %>">[이전]</a>&nbsp;
      <%}%>
      
      <%
         for(int a = startpage; a <= endpage; a++){
            if(a == nowpage){
      %>
         [<%= a %>]      
            <%}else{%>
             <a href="http://localhost:8080/All100Shoes/Customer/customerBuyList.do?command=board_list&page=<%= a %>">[<%= a %>]</a>&nbsp;
         <%}%>
      <%}%>

      <% if(nowpage >= maxpage){ %> 
      [다음]
      <%} else { %>
      		 <a href="http://localhost:8080/All100Shoes/Customer/customerBuyList.do?command=board_list&page=<%= nowpage+1 %>">[다음]</a>&nbsp;
      <%}%>
      </td>
   </tr>
</table>
   </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
crossorigin="anonymous"></script>
</body>
</html>