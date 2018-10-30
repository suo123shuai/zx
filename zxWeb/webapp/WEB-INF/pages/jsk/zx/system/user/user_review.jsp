<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp" %>
<!DOCTYPE html>

<html>
<head>
	<title>用户审核</title>
	<meta name="decorator" content="form"/>
</head>
<body>
  <form id="validateForm" name="saveForm" action="${ctx}/secure/user/reviweupd" method="post" role="form" class="form-horizontal">
  	<input type="hidden" name="pkId" value="${jskSysUser.pkId}" />
  	<table class="tbform">
      <caption>
      	审核
      </caption>
	</table>
	<div class="form-group">
	    <label for="userName" class="col-sm-2 control-label">用户名：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="userName" name="userName" value="${jskSysUser.userName}" datatype="*" disabled>
  		</div>
  	</div>
	<div class="form-group">
	    <label for="mobile" class="col-sm-2 control-label">手机：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="mobile" name="mobile" value="${jskSysUser.mobile}" datatype="*" disabled>
  		</div>
  	</div>
  	<div class="form-group">
	    <label for="idNumber" class="col-sm-2 control-label">身份证号：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="idNumber" name="idNumber" value="${jskSysUser.idNumber}" datatype="*" disabled>
  		</div>
  	</div>
  	<div class="form-groups" >
	    <label for="identifyFacada" class="col-sm-2 control-label">身份证正面：</label>
	    <div class="col-sm-4" style="margin-bottom:20px;">
	    <img id="identifyFacada" class = "tupian" src="${jskSysUser.identifyFacada}" style="width: 100px; height: 100px">
  		</div>
  	</div>
  	<div style="clear:both"></div>
  	<div class="form-groups">
	    <label for="identifyBacka" class="col-sm-2 control-label">身份证反面：</label>
	    <div class="col-sm-4" style="margin-bottom:20px;">
	    <img id="identifyBacka" class = "tupian" src="${jskSysUser.identifyBacka}" style="width: 100px; height: 100px">
  		</div>
  	</div><div style="clear:both"></div>
  	<div class="form-groups" >
	    <label for="cardPhotoa" class="col-sm-2 control-label">手持证件照或店铺照：</label>
	    <div class="col-sm-4" style="margin-bottom:20px;">
	    <img id="cardPhotoa" class = "tupian" src="${jskSysUser.cardPhotoa}" style="width: 100px; height: 100px">
  		</div>
  	</div><div style="clear:both"></div>
  	<c:if test="${ not empty jskSysUser.permitPhotoa}">
	  	<div class="form-groups" >
		    <label for="permitPhotoa" class="col-sm-2 control-label">营业执照：</label>
		    <div class="col-sm-4" style="margin-bottom:20px;">
		    <img id="permitPhotoa" class = "tupian" src="${jskSysUser.permitPhotoa}" style="width: 100px; height: 100px">
	  		</div>
	  	</div><div style="clear:both"></div>
  	</c:if>
  	<div class="form-group">
	    <label for="reason" class="col-sm-2 control-label">审核意见：</label>
	    <div class="col-sm-4">
	    <input type="text" class="form-control" id="reason" name="reason" value="${jskSysUser.reason}" datatype="*">
  		</div>
  	</div><br>
 <div class="form-group">
	    <label class="col-sm-2 control-label">审核结果：</label>
	    <div class="col-sm-4">
	    <label class="btn btn-default">
	     <input id="" type="radio" name="status" value="2" checked>审核通过&nbsp&nbsp&nbsp&nbsp&nbsp
	     </label>
	     <label class="btn btn-default">
    	<input type="radio" name="status" value="3">审核失败
    	</label>
  		</div>
  	</div>
  	<div class="form-group">
  	<div class="col-sm-offset-2 col-sm-10">
	  	<button type="submit" class="btn btn-success btn-sm" >提交</button>
		 <a class="btn btn-warning btn-sm" href="${ctx}/secure/user/findPage">取消</a>
	</div>
	</div>
  </form>
  <script type="text/javascript">
  $(function(){
	  var s = true;
  	$(".tupian").click(function() {
  		if(s){
  			$(this).attr({style:"width: 100%; height: auto"});
  			s = false;
  		}else{
  			$(this).attr({style:"width: 100px; height: 100px"});
  			s = true;
  		}
  	});
  });
</script>
</body>
</html>