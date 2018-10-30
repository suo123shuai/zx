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
	  $.post(url,function(checkResult) {
	    if(checkResult.success == 1){
	      layer.msg(checkResult.message,{
		    time : 0, //不自动关闭
		    btn : [ '确定' ],
		    yes : function(index) {
		      $("#"+_formId).submit();
		    }});
	    }else{
	      layer.msg(checkResult.message,{
		    time : 0, //不自动关闭
		    btn : [ '确定' ]});
		  }
	    });
	}
  });
  //这句话是不让超链接的href执行
  return false;
}