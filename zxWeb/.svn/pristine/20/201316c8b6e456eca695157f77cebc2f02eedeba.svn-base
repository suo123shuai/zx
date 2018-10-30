<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<title>登录</title>
<style type="text/css">
.u_ipt {
	background-image: url("../style/image/login/u_userName.png"); /*设置小图标*/
	background-size: 15px 15px; /*小图标的大小*/
	background-position: 8px 10px; /*小图标在input的位置*/
	background-repeat: no-repeat; /*背景小图标不重复*/
}

.p_ipt {
	background-image: url("../style/image/login/p_passWord.png"); /*设置小图标*/
	background-size: 15px 15px; /*小图标的大小*/
	background-position: 8px 10px; /*小图标在input的位置*/
	background-repeat: no-repeat; /*背景小图标不重复*/
}
</style>
<META content="IE=11.0000" http-equiv="X-UA-Compatible">
<%@ include file="/WEB-INF/pages/common/common_js.jsp"%>
<link rel="stylesheet" type="text/css"
	href="${ctx}/style/css/login/login.css" />

<SCRIPT type="text/javascript">
	function checkForm() {
		var loginName = $("#loginName").val();
		var password = $("#password").val();
		if (loginName == null || loginName == "") {
			alert("请输入用户名");
			return false;
		}
		if (password == null || password == "") {
			alert("请输入密码");
			return false;
		}
	}
	$(function() {
		//得到焦点
		$("#password").focus(function() {
			$("#left_hand").animate({
				left : "150",
				top : " -38"
			}, {
				step : function() {
					if (parseInt($("#left_hand").css("left")) > 140) {
						$("#left_hand").attr("class", "left_hand");
					}
				}
			}, 2000);
			$("#right_hand").animate({
				right : "-64",
				top : "-38px"
			}, {
				step : function() {
					if (parseInt($("#right_hand").css("right")) > -70) {
						$("#right_hand").attr("class", "right_hand");
					}
				}
			}, 2000);
		});
		//失去焦点
		$("#password").blur(function() {
			$("#left_hand").attr("class", "initial_left_hand");
			$("#left_hand").attr("style", "left:100px;top:-12px;");
			$("#right_hand").attr("class", "initial_right_hand");
			$("#right_hand").attr("style", "right:-112px;top:-12px");
		});
		var result_error = '${errorMessage}';
		if (result_error != "") {
			alert(result_error);
		}
	});
</SCRIPT>
</head>
<body style="background-image: url('../upload/system/PCLogin.jpg');">
	<DIV style="width: 100%; height: 400px;"></DIV>
	<form action="${ctx}/system/login" method="post"
		onsubmit="return checkForm();">
		<DIV class="div_bottom"
			style="background-image: url('../upload/system/PCLogin.jpg');">

			<DIV style="width: 165px; height: 96px; position: absolute;">
				<DIV class="tou"></DIV>
				<DIV class="initial_left_hand" id="left_hand"></DIV>
				<DIV class="initial_right_hand" id="right_hand"></DIV>
			</DIV>
			<P style="padding: 30px 0px 10px; position: relative;">
				<SPAN class="u_logo"></SPAN> <INPUT class="u_ipt" id="loginName"
					name="loginName" type="text" placeholder="请输入用户名" value="admin" />
			</P>
			<P style="position: relative;">
				<SPAN class="p_logo"></SPAN> <INPUT class="p_ipt" id="password"
					name="password" type="password" placeholder="请输入密码" value="admin" />
			</P>
			<DIV class="div_submit">
				<P style="margin: 0px 15px 20px 45px;">
					<SPAN style="float: center;"> <!-- 
           			<input type="reset" value="重置" class="btn_submit"/>
           			--> <input type="submit" value="登录" class="btn_submit" />
					</SPAN>
				</P>
			</DIV>
		</DIV>
	</form>
</body>
</html>
