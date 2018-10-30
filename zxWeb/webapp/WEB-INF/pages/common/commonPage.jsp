<div style="padding-left: 20px; padding-right: 20px;">
<div style="display: inline;">
	<div style="float: left; margin-left: 10px;">
		<ul class="pagination pagination-small" id="pagination1"></ul>
	</div>
	<c:if test="${page.totalPages > 0 }">
	<div style="float: right; margin-right: 10px;" class="pager">
		<li><span>共<strong> ${page.totalRows } </strong>条</span></li>
    	<li>
    	<span>每页
    	<select id="pageSize" name="pageSize">
    		<c:forEach var="str" items="${page.pageSizeList}">
    			<option value="${str.key }" <c:if test='${page.pageSize eq str.key }'> selected="selected" </c:if>>${str.value }</option>
    		</c:forEach>
    	</select> 条</span></li>
    	<li><span>第  <input type="hidden" id="pageNum" name="pageNum" value="${page.pageNum }" style="width: 40px; height: 20px; text-align: center;" />${page.pageNum } 页</span></li>
<%--     	<li><span>第  <input type="text" id="pageNum" name="pageNum" value="${page.pageNum }" style="width: 40px; height: 20px; text-align: center;" /> 页</span></li> --%>
    	<li><span>共 ${page.totalPages } 页</span></li>
	</div>
	</c:if>
</div>
</div>
<script>
$(function () {
	var totalPages = Number('${page.totalPages }');
	if(totalPages > 0){
		$('#pagination1').jqPaginator({
		    totalPages: totalPages,
		    visiblePages: 5,
		    currentPage: <c:out value="${page.pageNum }"/>,
	
		    first: '<li class="first"><a href="javascript:;" onclick="goPage(\'1\')">首页</a></li>',
		    prev: '<li class="prev"><a href="javascript:;" onclick="goPage(\'${page.pageNum-1 }\')">上一页</a></li>',
		    next: '<li class="next"><a href="javascript:;" onclick="goPage(\'${page.pageNum+1 }\')">下一页</a></li>',
		    last: '<li class="last"><a href="javascript:;" onclick="goPage(\'${page.totalPages }\')">尾页</a></li>',
		    page: '<li class="page"><a href="javascript:;" onclick="goPage(\'{{page}}\')">{{page}}</a></li>',
		    onPageChange: function (num) {
		      //  $('#text').html('当前第' + num + '页');
		    }
		});
	}
});
function goPage(num){
	var totalPages = Number('${page.totalPages }');
	num = Number(num);
	if(num<1){
		return false;
	}else if(num>totalPages){
		return false;
	}
	if((num=='1'&& $("#pageNum").val()=='1')||($("#pageNum").val()=='${page.totalPages }' && num == '${page.totalPages }' )){
		return false;
	}
	$("#pageNum").val(num);
	//loadSubmmit();
	$("form")[0].submit();
};
</script>