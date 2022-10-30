<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<title>비밀번호 찾기</title>
</head>
<body>
<div align="center">
<div style="width:25%">
<h2 style="margin:20px">비밀번호 찾기</h2>
<form action="managerfindpw.do" method="post">
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-3 col-form-label">이름 </label>
    <div class="col-sm-9">
      <input type="text" class="form-control" name="managername">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-3 col-form-label">전화번호 </label>
    <div class="col-sm-9">
      <input type="text" class="form-control" name="managerphone">
    </div>
</div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-3 col-form-label">ID </label>
    <div class="col-sm-9">
      <input type="text" class="form-control" name="managerid">
    </div>
</div>
<input type="submit" class="btn btn-dark" value="확인">
</form>
</div>
</div>
</body>
</html>
