<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>例子</title>
	<meta name="decorator" content="form"/>
</head>
<body>
  <form id="validateForm" name="saveForm" action="${ctx}/secure/demo/save" method="post" class="form-inline">
  	<input type="hidden" name="pkid" value="${demo.pkid}" />
    <table class="tbform">
      <caption>
      	<c:choose>
      	  <c:when test="${empty demo.pkId }">新增</c:when>
      	  <c:when test="${not empty demo.pkId }">修改</c:when>
      	</c:choose>
      </caption>
	  <tr>
	    <td class="tdleft">名称</td>
		<td><input name="dictId" type="text" class="form-control" value="${demo.demoName }" datatype="*"/></td>
	  </tr>
	  <tr>
	    <td class="tdleft">地址</td>
		<td><input name="dictName" type="text" class="form-control" value="${demo.demoAddress }" datatype="*"/></td>
	  </tr>
	  <tr>
	    <td class="tdleft"></td>
		<td>
			<button type="submit" class="btn btn-success">保存</button>
			<a class="btn btn-default" href="${ctx}/secure/demo/list">返回</a>
		</td>
	  </tr>
	</table>
  </form>
</body>
</html>