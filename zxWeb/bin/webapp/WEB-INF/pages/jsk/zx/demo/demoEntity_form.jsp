<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>例子</title>
	<meta name="decorator" content="form"/>
</head>
<body>
  <form id="validateForm" name="saveForm" action="${ctx}/secure/demoEntity/save" method="post" role="form" class="form-horizontal">
  	<input type="hidden" name="pkId" value="${demoEntity.pkId}" />
    <table class="tbform">
      <caption>
      	<c:choose>
      	  <c:when test="${empty demoEntity.pkId }">新增</c:when>
      	  <c:when test="${not empty demoEntity.pkId }">修改</c:when>
      	</c:choose>
      </caption>
	</table>
	<div class="form-group">
	    <label for="demoName" class="col-sm-1 control-label">名称：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="demoName" name="demoName" value="${demoEntity.demoName }" datatype="*" placeholder="请输入名称">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="demoAddress" class="col-sm-1 control-label">地址：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="demoAddress" name="demoAddress" value="${demoEntity.demoAddress }" datatype="*" placeholder="请输入地址">
  		</div>
  	</div>
  	<div class="form-group">
  	<div class="col-sm-offset-1 col-sm-10">
	  	<button type="submit" class="btn btn-success btn-sm">保存</button>
		<a class="btn btn-default btn-sm" href="${ctx}/secure/demoEntity/findPage">返回</a>
	</div>
	</div>
  </form>
</body>
</html>