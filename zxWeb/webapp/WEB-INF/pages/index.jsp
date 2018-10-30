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

    <div class="dl-log">欢迎您，<span class="dl-log-user">${userSession.user.userName}</span><a href="${ctx}/system/exit" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
  </div>
   <div class="content">
    <div class="dl-main-nav">
      <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
      <ul id="J_Nav"  class="nav-list ks-clear">
      	<c:if test="${userSession.user.loginName eq 'admin' }">
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-home">系统管理</div></li>
		<!--        
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">例子</div></li>
		 -->
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">消息管理</div></li>
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">装修小知识</div></li>
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">商品推荐</div></li>
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">大时圈管理</div></li>
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">积分商城</div></li>
		</c:if>
		<c:if test="${userSession.user.loginName ne 'admin' }">
		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">商品管理</div></li>
		</c:if>
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
      var loginName = '${userSession.user.loginName}';
      var config = [{id:'1',homePage : '1',"menu":[{"text":'用户管理',items:[{id:'1',text:'用户管理',href:'${ctx}/secure/user/findPage'},{id:'2',text:'评论管理',href:'${ctx}/secure/user/findPage'}]},{"text":'字典管理',items:[{id:'1',text:'字典管理',href:'${ctx}/secure/dict/findPage'}]}]},
                    {"id":"2",homePage : '2',"menu":[{"text":"信息管理",items:[{id:'2',text:'信息管理',href:'${ctx}/secure/news/findPage'}]}]},
                    {"id":"3",homePage : '3',"menu":[{"text":"装修小知识",items:[{id:'3',text:'装修小知识',href:'${ctx}/secure/knowledge/findPage'}]}]},
                    {"id":"4",homePage : '4',"menu":[{"text":"商品推荐",items:[{id:'4',text:'商品推荐',href:'${ctx}/secure/recommend/findPage?status=1'}]}]},
                    {"id":"6",homePage : '6',"menu":[{"text":"大时圈",items:[{id:'6',text:'大时圈',href:'${ctx}/secure/topNews/findPage'}]}]},
                    {"id":"7",homePage : '7',"menu":[{"text":"积分商城",items:[{id:'7',text:'积分商城',href:'${ctx}/secure/market/findPage'}]}]}
                    ];
      if(loginName != "admin") {
    	config = [{"id":"5",homePage : '5',"menu":[{"text":"商品管理",items:[{id:'5',text:'商品管理',href:'${ctx}/secure/product/findPage'}]}]}];
      }
      new PageUtil.MainPage({
        modulesConfig : config
      });
    });
  </script>
</body>
</html>