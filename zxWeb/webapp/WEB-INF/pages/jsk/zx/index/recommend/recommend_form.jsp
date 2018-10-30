<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>商品推荐</title>
	<meta name="decorator" content="form"/>
</head>
<body>
  <form id="validateForm" name="saveForm" action="${ctx}/secure/recommend/save" method="post" role="form" class="form-horizontal" enctype="multipart/form-data">
  	<input type="hidden" name="pkId" value="${jskIndexRecommend.pkId}" />
    <table class="tbform">
      <caption>
      	<c:choose>
      	  <c:when test="${empty jskIndexRecommend.pkId }">新增</c:when>
      	  <c:when test="${not empty jskIndexRecommend.pkId }">修改</c:when>
      	</c:choose>
      </caption>
	</table>
	<div class="form-group">
	    <label for="dictId" class="col-sm-2 control-label">标题：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="title" name="title" value="${jskIndexRecommend.title }" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="dictName" class="col-sm-2 control-label">摘要：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="summary" name="summary" value="${jskIndexRecommend.summary }" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="dictCode" class="col-sm-2 control-label">内容：</label>
	    <div class="col-sm-4">
	    <textarea rows="5" cols="20" class="form-control" id="content" name="content">${jskIndexRecommend.content }</textarea>
  		</div>
  	</div>
	<div class="form-group">
	    <label for="number" class="col-sm-2 control-label">排序号：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="number" name="number" value="${jskIndexRecommend.number }" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="file" class="col-sm-2 control-label">图片：</label>
	    <div class="col-sm-4">
	    <input type="file" class="form-control" id="file" name="file" value="">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="isShow" class="col-sm-2 control-label">是否显示：</label>
	    <div class="col-sm-4">
	    <dict:select id="isShow" name="isShow" dictId="trueFalse" code="${jskIndexRecommend.isShow}" classstyle="form-control"/>
  		</div>
  	</div>
  	<div class="form-group">
  	<div class="col-sm-offset-2 col-sm-10">
	  	<button type="submit" class="btn btn-success btn-sm">保存</button>
		<a class="btn btn-default btn-sm" href="${ctx}/secure/recommend/findPage">返回</a>
	</div>
	</div>
  </form>
</body>
</html>