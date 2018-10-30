<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>消息</title>
	<meta name="decorator" content="form"/>
</head>
<body>
  <form id="validateForm" name="saveForm" action="${ctx}/secure/topNews/save" method="post" role="form" class="form-horizontal" enctype="multipart/form-data">
  	<input type="hidden" name="pkId" value="${jskIndexTopNews.pkId}" />
    <table class="tbform">
      <caption>
      	<c:choose>
      	  <c:when test="${empty jskIndexTopNews.pkId }">新增</c:when>
      	  <c:when test="${not empty jskIndexTopNews.pkId }">修改</c:when>
      	</c:choose>
      </caption>
	</table>
	<div class="form-group">
	    <label for="title" class="col-sm-2 control-label">标题：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="title" name="title" value="${jskIndexTopNews.title }" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="summary" class="col-sm-2 control-label">摘要：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="summary" name="summary" value="${jskIndexTopNews.summary }" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="content" class="col-sm-2 control-label">内容：</label>
	    <div class="col-sm-4">
	    <textarea rows="5" cols="20" class="form-control" id="content" name="content" datatype="*">${jskIndexTopNews.content }</textarea>
  		</div>
  	</div>
	<div class="form-group">
	    <label for="photo" class="col-sm-2 control-label">图片：</label>
	    <div class="col-sm-4">
	    <input type="file" class="form-control" id="photo" name="file" value="">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="status" class="col-sm-2 control-label">发布状态：</label>
	    <div class="col-sm-4">
	    <dict:select id="status" name="status" dictId="publishStatus" code="${jskIndexTopNews.status }" classstyle="form-control"/>
  		</div>
  	</div>
  	<div class="form-group">
  	<div class="col-sm-offset-2 col-sm-10">
	  	<button type="submit" class="btn btn-success btn-sm">保存</button>
		<a class="btn btn-default btn-sm" href="${ctx}/secure/topNews/findPage">返回</a>
	</div>
	</div>
  </form>
</body>
</html>