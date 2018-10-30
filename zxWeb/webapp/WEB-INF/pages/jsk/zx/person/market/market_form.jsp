<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>商品管理</title>
	<meta name="decorator" content="form"/>
</head>
<body>
<div style="margin-bottom: 70px;">
  <form id="validateForm" name="saveForm" action="${ctx}/secure/market/save" method="post" role="form" class="form-horizontal" enctype="multipart/form-data">
  	<input type="hidden" name="pkId" value="${jskPersonMarket.pkId}" />
    <table class="tbform">
      <caption>
      	<c:choose>
      	  <c:when test="${empty jskPersonMarket.pkId }">新增</c:when>
      	  <c:when test="${not empty jskPersonMarket.pkId }">修改</c:when>
      	</c:choose>
      </caption>
	</table>
	<div class="form-group">
	    <label for="title" class="col-sm-2 control-label">名称：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="title" name="title" value="${jskPersonMarket.title }" datatype="*">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="summary" class="col-sm-2 control-label">简介：</label>
	    <div class="col-sm-4">
	    <textarea rows="5" cols="20" class="form-control" id="summary" name="summary" datatype="*">${jskPersonMarket.summary }</textarea>
  		</div>
  	</div>
	<div class="form-group">
	    <label for="content" class="col-sm-2 control-label">内容：</label>
	    <div class="col-sm-4">
	    <textarea rows="5" cols="20" class="form-control" id="content" name="content" datatype="*">${jskPersonMarket.content }</textarea>
  		</div>
  	</div>
	<div class="form-group">
	    <label for="file" class="col-sm-2 control-label">图片：</label>
	    <div class="col-sm-4">
	    <input type="file" class="form-control" id="file" name="file" value="">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="type" class="col-sm-2 control-label">产品类型：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="type" name="type" value="${jskPersonMarket.type }">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="price" class="col-sm-2 control-label">产品价格：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="price" name="price" value="${jskPersonMarket.price }">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="totalNum" class="col-sm-2 control-label">总数：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="totalNum" name="totalNum" value="${jskPersonMarket.totalNum }">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="saleNum" class="col-sm-2 control-label">已卖数：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="saleNum" name="saleNum" value="${jskPersonMarket.saleNum }">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="season" class="col-sm-2 control-label">适用季节：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="season" name="season" value="${jskPersonMarket.season }">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="volume" class="col-sm-2 control-label">净含量：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="volume" name="volume" value="${jskPersonMarket.volume }">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="inTime" class="col-sm-2 control-label">保质期：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="inTime" name="inTime" value="${jskPersonMarket.inTime }">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="createDate" class="col-sm-2 control-label">生产日期：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="createDate" name="createDate" value="${jskPersonMarket.createDate }" autocomplete="off" style="width: 100px;" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})">
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="brandName" class="col-sm-2 control-label">品牌名：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="brandName" name="brandName" value="${jskPersonMarket.brandName }">
  		</div>
  	</div>
	<div class="form-group">
	    <label for="status" class="col-sm-2 control-label">发布状态：</label>
	    <div class="col-sm-4">
	    <dict:select id="status" name="status" dictId="publishStatus" code="${jskPersonMarket.status }" classstyle="form-control"/>
  		</div>
  	</div>
  	<div class="form-group">
  	<div class="col-sm-offset-2 col-sm-10">
	  	<button type="submit" class="btn btn-success btn-sm">保存</button>
		<a class="btn btn-default btn-sm" href="${ctx}/secure/market/findPage">返回</a>
	</div>
	</div>
  </form>
  </div>
</body>
</html>