<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel= "stylesheet" href="signup.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<script type="text/javascript">


	function CheckId(){
		var joinForm = document.joinForm;
		joinForm.action="idcheck2.do";
		joinForm.submit();
	}
	
	function snedCheckVAlue(){
		var joinForm = document.joinForm;
		
		var idCheckValue =joinForm.idDuplication.value;
		console.log(idCheckValue);
		if(idCheckValue == false){
			joinForm.action = "Sighup.do";
			joinForm.method = "post";
			joinForm.submit();
			return;
		}
		else{
			alert("아이디 중복체크를 해주세요.")
			return;
		}
	}

</script>


</head>

<%@include file="header.jsp"%>
<body >

<div class="divPosition">


	<h2 align="center">회원가입 게시판</h2> 
<div id="wrap" >

	

<form name ="joinForm" method ="post">
		<table border="0" >
		
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" size ="30" value="${CHECKID }" >
				<input type="button" name="idcheck" class="btn btn-dark" value="중복 확인" onclick="CheckId()" ></td>
				<c:if test="${CHECK==true }">이미 존재하는 ID입니다.</c:if>
				<c:if test="${CHECK==false }">사용 가능한 ID입니다.</c:if>
				

				<td><input type="hidden" name="idDuplication" value="${CHECK}"/></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><input type="password" name="pw" size="30" placeholder="영문숫자조합 4글자 이상" required="required" > </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="password" name="pw2" size="30" required="required" > </td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" size="30" required="required" > </td>

			</tr>
			<tr>
				<td>address</td>
				<td><input type="text" name="address" size="30" required="required" > </td>

			</tr>
			<tr>
				<td>phone</td>
				<td><input type="text" name="phone" size="30" required="required" placeholder="예시 : 010-5552-1774 (13자리)" maxlength="13"> </td>

			</tr>
			<tr>
			<td><input class="btn btn-dark" type="button" onclick="snedCheckVAlue()" value="회원가입"></td>
			<td><button type="submit" class="btn btn-dark" onclick="login.jsp">돌아가기</button></td>
				</tr>
		
		</table>
	</form>




  </div>
</div>


<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<!-- 유효성체크 : 데이터 빈공백체크(id와 성별) -->

</body>
</html>