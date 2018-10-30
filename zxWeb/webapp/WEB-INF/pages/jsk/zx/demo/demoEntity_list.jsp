<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>

<html>
  <head>
    <title>列表页</title>
    <meta name="decorator" content="list"/>
  </head>
  
  <body>
  <div class="container-fluid">
  	<form id="listForm" class="m20" action="${ctx}/secure/demoEntity/findPage" method="post">
    <table class="table-condensed">
      <tr>
        <td>用户名称：</td>
        <td><input name="demoName" id="demoName" class="form-control" value="${demoEntity.demoName }" /></td>
        <td>
          <button type="submit" class="btn btn-info btn-sm">查询</button>
          <button type="button" class="btn btn-primary btn-sm" id="btnAdd">新增</button>
        </td>
      </tr>
    </table>
  <table class="table table-striped table-bordered table-hover table-condensed m10">
    <thead>
      <tr>
        <th>用户名称</th>
        <th>地址</th>
        <th>操作</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="demo" items="${page.records}">
        <tr>
          <td>${demo.demoName }</td>
          <td>${demo.demoAddress }</td>
          <td><a href="${ctx}/secure/demoEntity/edit?pkId=${demo.pkId}">修改</a> <a target="AjaxBack" href="${ctx}/secure/demoEntity/deleteById?pkId=${demo.pkId}">删除</a> <a href="#">详细</a></td>
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
			location.href = ctxjs + "/secure/demoEntity/create";
		});
	});
  </script>
  </body>
</html>
