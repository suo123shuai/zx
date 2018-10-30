<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>

<html>
  <head>
    <title>商品管理列表页</title>
    <meta name="decorator" content="list"/>
  </head>
  
  <body>
  <div class="container-fluid">
  	<form id="listForm" class="m20" action="${ctx}/secure/product/findPage" method="post">
    <table class="table-condensed">
      <tr>
        <td>商品名称：</td>
        <td><input name="title" id="title" class="form-control" value="${jskSysIndexProduct.title}" /></td>
        <td>
          <button type="submit" class="btn btn-info btn-sm">查询</button>
          <button type="button" class="btn btn-primary btn-sm" id="btnAdd">新增</button>
        </td>
      </tr>
    </table>
  <table class="table table-striped table-bordered table-hover table-condensed m10">
    <thead>
      <tr>
        <th>商品名称</th>
        <th>摘要</th>
        <th>内容</th>
        <th>价格</th>
        <th>点赞数</th>
        <th>评论数</th>
        <th>总数</th>
        <th>已卖数</th>
        <th>适用季节</th>
        <th>状态</th>
        <th>操作</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="record" items="${page.records}">
        <tr>
          <td>${record.title }</td>
          <td>${record.summary }</td>
          <td>${record.content }</td>
          <td>${record.price }</td>
          <td>${record.praiseNum }</td>
          <td>${record.commentNum }</td>
          <td>${record.totalNum }</td>
          <td>${record.saleNum }</td>
          <td>${record.season }</td>
          <td><dict:display dictId="publishStatus" code="${record.status }" /></td>
          <td><a href="${ctx}/secure/product/edit?pkId=${record.pkId}">修改</a> <a target="AjaxBack" href="${ctx}/secure/product/deleteById?pkId=${record.pkId}">删除</a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  </div>
  	<%@ include file="/WEB-INF/pages/common/commonPage.jsp"%>
  	</form>
  <script type="text/javascript">
	$(function() {
		$("#btnAdd").click(function() {
			location.href = ctxjs + "/secure/product/create";
		});
	});
  </script>
  </body>
</html>
