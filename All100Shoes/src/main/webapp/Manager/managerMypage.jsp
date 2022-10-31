<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td{
height: 30px;
}
body{
font-family:"윤고딕";
margin:10px;
}
</style>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<script type="text/javascript">
function deleteaction(){
	var form=document.mypage;
	form.action="delete.do";
	form.submit();
}
function pwcheck(){
	var form=document.mypage;
	var pw=form.managerpw.value;
	var pwcheck=form.managerpwcheck.value;
	if (pw!=pwcheck){
		form.managerpwchecktxt.value="비밀번호가 일치하지 않습니다.";
	} else{
		form.managerpwchecktxt.value="비밀번호가 일치합니다";
	}
}

var regExId=/^[a-z|0-9]+$/; //영문 소문자와 숫자만 한 글자 이상
var regExPw=/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
var regExPhone=/^[0-9]+$/; //숫자만 한 글자 이상

function updateaction(){
	var form=document.mypage;
	var pw=form.managerpw.value;
	var pwcheck=form.managerpwchecktxt.value;
	var phone=form.managerphone.value;
	
	if(!regExPw.test(pw)){
		alert("비밀번호는 영문 대소문자, 숫자, 특수문자를 모두 포함해야 합니다.");
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
	if(idcheck=="yes"){
		alert("계정 정보가 변경되었습니다.");
		form.action="update.do";
		form.submit();
	}
}
</script>
</head>
<body style="margin:10px">
<div align="center">
<div style="width:30%">
<h2 style="margin:20px">계정 정보 수정</h2>
<form action="#" name="mypage" method="post">
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-4 col-form-label">ID: </label>
    <div class="col-sm-8">
      <input type="text" readonly class="form-control-plaintext" name="managerid" value="${MMypageDto.managerid }">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-4 col-form-label">비밀번호: </label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="managerpw" value="${MMypageDto.managerpw }">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-4 col-form-label">비밀번호 확인: </label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="managerpw" value="${MMypageDto.managerpw }">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-4 col-form-label">이름: </label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="managerpw" value="${MMypageDto.managername }">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-4 col-form-label">전화번호: </label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="managerpw" value="${MMypageDto.managerphone }">
    </div>
</div>
<input type="button" class="btn btn-dark" name="update" value="수정하기" onclick="updateaction()">
<input type="button" name="delete" value="삭제하기" class="btn btn-dark" onclick="deleteaction()">
</form>
</div>
</div>
</body>
</html>
