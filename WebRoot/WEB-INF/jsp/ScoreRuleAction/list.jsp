<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>查看比赛分制</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script language="javascript" src="${pageContext.request.contextPath}/script/jquery.js"></script>
    <script language="javascript" src="${pageContext.request.contextPath}/script/pageCommon.js" charset="utf-8"></script>
    <script language="javascript" src="${pageContext.request.contextPath}/script/PageUtils.js" charset="utf-8"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/pageCommon.css" />
    <script type="text/javascript">
    </script>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 比赛分制
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea" style="width:800px">
    <table cellspacing="0" cellpadding="0" class="TableStyle" >
       
        <!-- 表头-->
        <thead>
            <tr align=center valign=middle id=TableTitle>
            	<td width="200px">胜局(分)</td>
            	<td width="200px">负局(分)</td>
            	<td width="200px">平局(分)</td>
            	<td width="200px">相关操作</td>
            </tr>
        </thead>
		
		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" >
        	<tr class="TableDetail1 template">
            	<td>2.0</td>
            	<td>-2.0</td>
            	<td>0</td>
				<td><a href="javascript:void(0)">修改</a>|<a onclick="del()" href="javascript:void(0)">删除</a>
				</td>
			</tr>
        	
        	<s:iterator id="scoreRule" value="#scoreRuleList" >
	        	<tr class="TableDetail1 template">
	            	<td><s:property value="#scoreRule.winningScore" /></td>
	            	<td><s:property value="#scoreRule.losingScore" /></td>
	            	<td><s:property value="#scoreRule.drawScore" /></td>
					<td>
					<s:a href="scoreRule_editUI.action?id=%{id}">修改</s:a>|<s:a onclick="del(this)" href="javascript:void(0)">删除</s:a>
					<s:hidden name="id"></s:hidden>
					</td>
				</tr>
        	</s:iterator>
        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
			<a href="scoreRule_addUI.action" target="_self" ><img src="${pageContext.request.contextPath}/style/blue/images/button/addNew.png" /></a>
        </div>
    </div>
</div>

<script type="text/javascript">
	function del(obj){
		if(delConfirm()){
			var id = $(obj).next().val();
			window.open("scoreRule_delete.action?id="+id, "_self");
		}
	}
</script>
</body>
</html>
