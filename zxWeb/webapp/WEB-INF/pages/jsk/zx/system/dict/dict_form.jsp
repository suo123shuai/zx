<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>例子</title>
	<meta name="decorator" content="form"/>
</head>
<body>
  <form id="validateForm" name="saveForm" action="${ctx}/secure/dict/save" method="post" role="form" class="form-horizontal">
  	<input type="hidden" name="pkId" value="${jskSysDict.pkId}" />
    <table class="tbform">
      <caption>
      	<c:choose>
      	  <c:when test="${empty jskSysDict.pkId }">新增</c:when>
      	  <c:when test="${not empty jskSysDict.pkId }">修改</c:when>
      	</c:choose>
      </caption>
	</table>
	<div class="form-group">
	    <label for="dictId" class="col-sm-2 control-label">字典ID：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="dictId" name="dictId" value="${jskSysDict.dictId }" datatype="*" placeholder="请输入字典ID">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="dictName" class="col-sm-2 control-label">名称：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="dictName" name="dictName" value="${jskSysDict.dictName }" datatype="*" placeholder="请输入名称">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="dictCode" class="col-sm-2 control-label">字典KEY：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="dictCode" name="dictCode" value="${jskSysDict.dictCode }" datatype="*" placeholder="请输入字典KEY">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="dictValue" class="col-sm-2 control-label">字典VALUE：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="dictValue" name="dictValue" value="${jskSysDict.dictValue }" datatype="*" placeholder="请输入字典值">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="number" class="col-sm-2 control-label">排序号：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="number" name="number" value="${jskSysDict.number }" datatype="*" placeholder="请输入排序号">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="status" class="col-sm-2 control-label">状态：</label>
	    <div class="col-sm-4">
	    <dict:select id="status" name="status" dictId="status" code="${jskSysDict.status }" classstyle="form-control"/>
  		</div>
  	</div>
  	<div class="form-group">
  	<div class="col-sm-offset-2 col-sm-10">
	  	<button type="submit" class="btn btn-success btn-sm">保存</button>
		<a class="btn btn-default btn-sm" href="${ctx}/secure/dict/findPage">返回</a>
	</div>
	</div>
  </form>
</body>
</html>