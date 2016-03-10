<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>系列赛信息</title>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
	<script language="javascript" src="${pageContext.request.contextPath}/script/jquery.js"></script>
	<script language="javascript" src="${pageContext.request.contextPath}/script/pageCommon.js" charset="utf-8"></script>
	<script language="javascript" src="${pageContext.request.contextPath}/script/PageUtils.js" charset="utf-8"></script>
	<script language="javascript" src="${pageContext.request.contextPath}/script/DemoData.js" charset="utf-8"></script>
	<script language="javascript" src="${pageContext.request.contextPath}/script/DataShowManager.js" charset="utf-8"></script>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/pageCommon.css" />
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/forum.css" />
	<script type="text/javascript">
	</script>
</head>
<body>
<div id="Title_bar">
	<div id="Title_bar_Head">
		<div id="Title_Head"></div>
		<div id="Title">
			<!--页面标题-->
			<img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 系列赛信息 </div>
		<div id="Title_End"></div>
	</div>
</div>
<div id="MainArea">
	<center>
		<div class="ForumPageTableBorder" style="margin-top: 25px;">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
			
				<!--表头-->
				<tr align="center" valign="middle">
					<td colspan="3" class="ForumPageTableTitleLeft">赛事简介</td>
					<td width="80" class="ForumPageTableTitle">参加人数</td>
					<td width="80" class="ForumPageTableTitle">比赛种数</td>
					<td width="270" class="ForumPageTableTitle">相关信息</td>
					<td width="100" class="ForumPageTableTitle">操作</td>
				</tr>
				<tr height="1" class="ForumPageTableTitleLine"><td colspan="9"></td></tr>
				<tr height="3"><td colspan="9"></td></tr>
			
				<!--版面列表-->
				<tbody class="dataContainer" datakey="matchInforList">
				<tr height="78" align="center" class="template">
					<td width="3"></td>
					<td width="75" class="ForumPageTableDataLine">
						<img src="${pageContext.request.contextPath}/style/images/forumpage3.gif" />
					</td>
					<td class="ForumPageTableDataLine">
						<ul class="ForumPageTopicUl">
							<li class="ForumPageTopic"><a class="ForumPageTopic" href="forumShow.html">${match.name}</a></li>
							<li class="ForumPageTopicMemo">${match.description}</li>
						</ul>
					</td>
					<td class="ForumPageTableDataLine"><b>${match.roundCount}</b></td>
					<td class="ForumPageTableDataLine"><b>${match.playerCount}</b></td>
					<td class="ForumPageTableDataLine">
						<ul class="ForumPageTopicUl">
							<li><font color="#444444">┌ 主办：</font> 
								<a class="ForumTitle" href="javascript:void(0)">${match.creater}</a>
							</li>
							<li><font color="#444444">├ 承办：</font> ${match.maker}</li>
							<li><font color="#444444">└ 时间：</font> ${match.time}</li>
						</ul>
					</td>
					<td class="ForumPageTableDataLine">修改|删除</td>
					<td width="3"></td>
					
				</tr>
				</tbody>
				<!-- 版面列表结束 -->
				
				<tr height="3"><td colspan="9"></td></tr>
			</table>
		</div>
	</center>
</div>
</body>
</html>
