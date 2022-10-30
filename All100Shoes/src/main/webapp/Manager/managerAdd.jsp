<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
	

<script type="text/javascript">
function check(){
	var form=document.manageradd;
	var id=form.managerid.value;
	
	var regExId=/^[a-z|0-9]+$/; //영문 소문자와 숫자만 한 글자 이상
	var regExPw=/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/; //영문 대문자와 소문자, 특수문자, 숫자 모두 포함하여 8글자 이상
	var regExPhone=/^[0-9].{9,11}$/; //숫자만 9글자 이상 11글자 이하
	
	if(!regExId.test(id)){
		alert("ID는 영문과 숫자만 입력 가능합니다.");
		return;
	}else{
	form.action="idcheck.do";
	form.submit();
		
	}
}

function addaction(){
	var form=document.manageradd;
	var id=form.managerid.value;
	var pw=form.managerpw.value;
	var pwcheck=form.managerpwchecktxt.value;
	var phone=form.managerphone.value;
	var idcheck=form.idcheck.value;
	
	var regExId=/^[a-z|0-9]+$/; //영문 소문자와 숫자만 한 글자 이상
	var regExPw=/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/; //영문 대문자와 소문자, 특수문자, 숫자 모두 포함하여 8글자 이상
	var regExPhone=/^[0-9].{9,11}$/; //숫자만 9글자 이상 11글자 이하
	
	if(!regExId.test(id)){
		alert("ID는 영문과 숫자만 입력 가능합니다.");
		return;
	}
	if(!regExPw.test(pw)){
		alert("비밀번호는 영문 대소문자, 숫자, 특수문자를 모두 포함하여 8글자 이상 작성해야 합니다.");
		return;
	}
	if(!regExPhone.test(phone)){
		alert("전화번호는 숫자만 입력 가능합니다.");
		return;
	}
	if(pw!=pwcheck){
		alert("비밀번호가 일치하지 않습니다.");
		return;
	}
	if(idcheck==false){
		alert("계정이 생성되었습니다.");
		form.submit();
	} else{
		alert("ID 중복체크를 해 주세요.");
		return;
	}
}
</script>
</head>
<body style="margin:10px">
<div align="center">
<div align="center" style="width:40%">
<h2 style="margin:30px">회원가입</h2>
<form name="manageradd" action="manageradd.do" method="post">
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-3 col-form-label">ID </label>
    <div class="col-sm-7">
      <c:if test="${CHECK==true }">
      <input type="text" class="form-control is-invalid" name="managerid" placeholder="영문 소문자와 숫자만 가능" value="${CHECKID }">
      <script>alert("이미 존재하는 ID입니다.")</script>
      </c:if>
      <c:if test="${CHECK==false }">
      <input type="text" class="form-control is-valid" name="managerid" placeholder="영문 소문자와 숫자만 가능" value="${CHECKID }">
      <input type="hidden" class="form-control is-valid" name="idcheck" value="${CHECK }">
      <script>alert("사용 가능한 ID입니다.")</script>
      </c:if>
      <c:if test="${CHECK==null }">
      <input type="text" class="form-control" name="managerid" placeholder="영문 소문자와 숫자만 가능" value="${CHECKID }">
      </c:if>
    </div>
    <div class="col-sm-1">
    <input type="button" class="btn btn-dark" name="idcheck" onclick="check()" value="중복체크">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-3 col-form-label">비밀번호 </label>
    <div class="col-sm-9">
      <input type="password" class="form-control" placeholder="영문 대소문자, 숫자, 특수문자 모두 포함하여 8글자 이상" name="managerpw" value="${MANAGERPW }">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-3 col-form-label">비밀번호 확인 </label>
    <div class="col-sm-9">
      <input type="password" class="form-control" placeholder="영문 대소문자, 숫자, 특수문자 모두 포함하여 8글자 이상" name="managerpwchecktxt" value="${MANAGERPWCHECK }">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-3 col-form-label">이름 </label>
    <div class="col-sm-9">
      <input type="text" class="form-control" name="managername" value="${MANAGERNAME2 }">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-3 col-form-label">전화번호 </label>
    <div class="col-sm-9">
      <input type="text" class="form-control" placeholder="'-'를 빼고 숫자만 작성" name="managerphone" value="${MANAGERPHONE }">
    </div>
</div>
<input type="button" value="계정 생성" class="btn btn-dark" onclick="addaction()">

</form>
</div>
</div>
</body>
</html>