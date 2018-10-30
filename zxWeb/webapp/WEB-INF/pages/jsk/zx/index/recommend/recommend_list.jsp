<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>

<html>
  <head>
    <title>商品推荐列表页</title>
    <meta name="decorator" content="list"/>
  </head>
  
  <body>
  <div class="container-fluid">
  	<form id="listForm" class="m20" action="${ctx}/secure/recommend/findPage" method="post">
    <table class="table-condensed">
      <tr>
        <td>商品名称：</td>
        <td><input name="title" id="title" class="form-control" value="${jskSysIndexProduct.title}" /></td>
        <td>是否推荐：</td>
        <td>
        <dict:select name="isRecommend" classstyle="form-control" dictId="trueFalse" code="${jskSysIndexProduct.isRecommend}"/>
        </td>
        <td>
          <button type="submit" class="btn btn-info btn-sm">查询</button>
        </td>
      </tr>
    </table>
  <table class="table table-striped table-bordered table-hover table-condensed m10">
    <thead>
      <tr>
        <th>名称</th>
        <th>摘要</th>
        <th>内容</th>
        <th>价格</th>
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
          <td>
          	<c:if test="${record.isRecommend eq true}">
          	<a href="javascript:unrecommend('${record.pkId }');">取消</a>
          	</c:if>
          	<c:if test="${record.isRecommend eq false}">
          	<a href="javascript:recommend('${record.pkId }');">推荐</a>
          	</c:if>
          </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  </div>
  	<%@ include file="/WEB-INF/pages/common/commonPage.jsp"%>
  	</form>
  	<script type="text/javascript">
  		function recommend(pkId) {
  			var url = ctxjs + "/secure/recommend/recommend?pkId="+pkId;
  			ajaxBack(url,"listForm","确定推荐该商品吗？");
  		}
  		function unrecommend(pkId) {
  			var url = ctxjs + "/secure/recommend/unrecommend?pkId="+pkId;
  			ajaxBack(url,"listForm","确定取消推荐该商品吗？");
  		}
  	</script>
  </body>
</html>
