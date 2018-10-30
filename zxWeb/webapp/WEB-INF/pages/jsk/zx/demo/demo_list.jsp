<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>

<html>
  <head>
    <title>列表页</title>
    <meta name="decorator" content="list"/>
  </head>
  
  <body>
  	<form class="form-search definewidth m20" action="${ctx}/secure/demo/list" method="post">
    <table>
      <tr>
        <td>用户名称：</td>
        <td><input type="text" name="demoName" id="demoName" value="${demoName }" class="input-medium search-query" /></td>
        <td>创建日期：</td>
        <td><input name="startDate" autocomplete="off" style="width: 100px;" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" /></td>
        <td>
          <button type="submit" class="btn btn-info">查询</button>
          <button type="button" class="btn btn-primary" id="btnAdd">新增</button>
        </td>
      </tr>
    </table>
  </form>
  <table class="table table-striped table-bordered table-hover definewidth m10">
    <thead>
      <tr>
        <th>用户名称</th>
        <th>地址</th>
        <th>操作</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="demo" items="${demoList}">
        <tr>
          <td>${demo.demoName }</td>
          <td>${demo.demoAddress }</td>
          <td><a href="${ctx}/secure/demo/edit?pkId=${user.pkid}">修改</a> <a href="#">删除</a> <a href="#">详细</a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  	<%@ include file="/WEB-INF/pages/common/commonPage.jsp"%>
  <script type="text/javascript">
	$(function() {
		$("#btnAdd").click(function() {
			location.href = ctxjs + "/secure/demo/create";
		});
	});
  </script>
  </body>
</html>
