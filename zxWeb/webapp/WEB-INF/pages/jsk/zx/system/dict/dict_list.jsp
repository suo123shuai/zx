<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>

<html>
  <head>
    <title>字典列表页</title>
    <meta name="decorator" content="list"/>
  </head>
  
  <body>
  <div class="container-fluid">
  	<form id="listForm" class="m20" action="${ctx}/secure/dict/findPage" method="post">
    <table class="table-condensed">
      <tr>
        <td>字典名称：</td>
        <td><input name="dictName" id="dictName" class="form-control" value="${jskSysDict.dictName }" /></td>
        <td>
          <button type="submit" class="btn btn-info btn-sm">查询</button>
          <button type="button" class="btn btn-primary btn-sm" id="btnAdd">新增</button>
        </td>
      </tr>
    </table>
  <table class="table table-striped table-bordered table-hover table-condensed m10">
    <thead>
      <tr>
        <th>字典ID</th>
        <th>字典名称</th>
        <th>字典KEY</th>
        <th>字典显示值</th>
        <th>排序号</th>
        <th>状态</th>
        <th>操作</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="dict" items="${page.records}">
        <tr>
          <td>${dict.dictId }</td>
          <td>${dict.dictName }</td>
          <td>${dict.dictCode }</td>
          <td>${dict.dictValue }</td>
          <td>${dict.number }</td>
          <td><dict:display dictId="status" code="${dict.status }"></dict:display></td>
          <td><a href="${ctx}/secure/dict/edit?pkId=${dict.pkId}">修改</a> <a target="AjaxBack" href="${ctx}/secure/dict/deleteById?pkId=${dict.pkId}">删除</a></td>
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
			location.href = ctxjs + "/secure/dict/create";
		});
	});
  </script>
  </body>
</html>