<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/pages/include/taglibs.jsp"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html style="overflow-x:auto;overflow-y:auto;">
<head>
	<title><sitemesh:title/></title>
	<%@include file="/WEB-INF/pages/common/common.jsp" %>
	<link type="text/css" rel="stylesheet" href="${ctx }/widgets/validform/css/style.css"/>
	<sitemesh:head/>
</head>
<body>
	<sitemesh:body/>
</body>
<script type="text/javascript" src="${ctx }/widgets/validform/js/Validform_v5.3.2_min.js" charset="utf-8"></script>
<script type="text/javascript">
	var valid=$("#validateForm").Validform({
		tiptype:3,
		label:".label",
		showAllError:false,
		ajaxPost:false
	});
</script>
</html>