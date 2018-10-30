// 重写alert
window.Alert = function(content, con) {
  if(typeof(con) == "undefind"){
	  layer.alert(content);
  }else {
	  layer.alert(content, {icon:con});
  }
};

//删除数据
//URL 链接地址；formId 删除成功后需要刷新的表单ID
function deleteData(url,formId) {
	var _formId = "listForm";
	if(formId != null && formId != "" && formId != undefined){
		_formId = formId;
	}
	layer.msg("确定要删除吗？", {
		time : 0, //不自动关闭
		btn : [ '确定', '取消' ],
		yes : function(index) {
			layer.close(index);
			$.ajax({
				url:url,
				dataType:"json",
				type:"post",
				success:function(checkResult){
					var result = $.parseJSON(checkResult);
					if(result.success == 1){
						layer.msg(result.message,{
							time : 0, //不自动关闭
							btn : [ '确定' ],
							yes : function(index) {
								var obj = document.getElementById(_formId);
								if(obj == null){
									document.forms[0].submit();
								}else {
									obj.submit();
								}
							}});
					}else{
						layer.msg(result.message,{
							time : 0, //不自动关闭
							btn : [ '确定' ]
						});
					}
				}
			});
		}
	});
  //这句话是不让超链接的href执行
  //return false;
}
// ajax操作
// //URL 链接地址；formId 删除成功后需要刷新的表单ID；title提示确认内容
function ajaxBack(url,formId,content) {
	var _formId = "listForm";
	var _content = "确定操作吗？";
	if(content != null && content != "" && content != undefined) {
		_content = content;
	}
	if(formId != null && formId != "" && formId != undefined){
		_formId = formId;
	}
	layer.msg(_content, {
		time : 0, //不自动关闭
		btn : [ '确定', '取消' ],
		yes : function(index) {
			layer.close(index);
			$.ajax({
				url:url,
				dataType:"json",
				type:"post",
				success:function(checkResult){
					var result = $.parseJSON(checkResult);
					if(result.success == 1){
						layer.msg(result.message,{
							time : 0, //不自动关闭
							btn : [ '确定' ],
							yes : function(index) {
								var obj = document.getElementById(_formId);
								if(obj == null){
									document.forms[0].submit();
								}else {
									obj.submit();
								}
							}});
					}else{
						layer.msg(result.message,{
							time : 0, //不自动关闭
							btn : [ '确定' ]
						});
					}
				}
			});
		}
	});
}
$(function(){
	var href = "";
	$("a[target='AjaxBack']").each(function(){
		$(this).click(function(){
			href = $(this).attr("href");
			$(this).attr("href","javascript:void()");
			deleteData(href);
		});
	});
});