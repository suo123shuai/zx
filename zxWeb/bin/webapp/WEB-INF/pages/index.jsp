<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>主页</title>
	<%@ include file="/WEB-INF/pages/common/common_js.jsp"%>
	<link href="${ctx}/widgets/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
	<link href="${ctx}/widgets/assets/css/bui.css" rel="stylesheet" type="text/css" />
	<link href="${ctx}/widgets/assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="header">
      <div class="dl-title">
       <!--<img src="/chinapost/Public/assets/img/top.png">-->
      </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user">${userSession}</span><a href="${ctx}/system/exit" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
  </div>
   <div class="content">
    <div class="dl-main-nav">
      <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
      <ul id="J_Nav"  class="nav-list ks-clear">
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-home">例子</div></li>
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">例子1</div></li>       
      </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">
    </ul>
   </div>
	<script type="text/javascript" src="${ctx}/widgets/assets/js/bui-min.js"></script>
	<script type="text/javascript" src="${ctx}/widgets/assets/js/common/main-min.js"></script>
	<script type="text/javascript" src="${ctx}/widgets/assets/js/config-min.js"></script>
	<script>
    BUI.use('common/main',function(){
      var config = [{"id":"1",homePage : '12',"menu":[{"text":"例子",items:[{id:'12',text:'例子',href:'${ctx}/secure/demoEntity/findPage'}]}]},{id:'7',homePage : '9',menu:[{text:'测试',items:[{id:'9',text:'测试',href:''}]}]}];
      new PageUtil.MainPage({
        modulesConfig : config
      });
    });
  </script>
</body>
</html>