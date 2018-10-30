<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>
<%
//request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
%>
<html>
  <head>
    <title>主页</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript">
	parent.window.location.href='${ctx}'+"/system/exit";
	</script>
  </head>
  
  <body>
    index
  </body>
</html>
