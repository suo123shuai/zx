<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>用户管理</title>
	<meta name="decorator" content="form"/>
</head>
<body>
  <form id="validateForm" name="saveForm" action="${ctx}/secure/user/save" method="post" role="form" class="form-horizontal">
  	<input type="hidden" name="pkId" value="${jskSysUser.pkId}" />
    <table class="tbform">
      <caption>
      	<c:choose>
      	  <c:when test="${empty jskSysUser.pkId }">新增</c:when>
      	  <c:when test="${not empty jskSysUser.pkId }">修改</c:when>
      	</c:choose>
      </caption>
	</table>
	<div class="form-group">
	    <label for="loginName" class="col-sm-2 control-label">登录名称：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="loginName" name="loginName" value="${jskSysUser.loginName }" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="loginPwd" class="col-sm-2 control-label">密码：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="loginPwd" name="loginPwd" value="${jskSysUser.loginPwd}" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="userName" class="col-sm-2 control-label">用户名：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="userName" name="userName" value="${jskSysUser.userName}" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="nickName" class="col-sm-2 control-label">昵称：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="nickName" name="nickName" value="${jskSysUser.nickName}" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="mobile" class="col-sm-2 control-label">手机：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="mobile" name="mobile" value="${jskSysUser.mobile}" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="rate" class="col-sm-2 control-label">取现提成比例：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="rate" name="rate" value="${jskSysUser.rate}" datatype="*">
  		</div>
  	</div>
  	<div class="form-group" id="tupian">
  	</div>
  	<div class="form-group">
  	<div class="col-sm-offset-2 col-sm-10">
	  	<button type="submit" class="btn btn-success btn-sm">保存</button>
		<a class="btn btn-default btn-sm" href="${ctx}/secure/user/findPage">返回</a>
	</div>
	</div>
  </form>
</body>
</html>