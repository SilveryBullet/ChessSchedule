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
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/pageCommon.css" />
    <script type="text/javascript">
    </script>
</head>
<body>

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 系列赛信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id=MainArea>
	<s:hidden id="url" value="series_%{id == null ? 'add' : 'edit'}"></s:hidden>
    <s:form action="javascript:void(0)">
        <div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 系列赛信息 </div> 
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                	<s:hidden name="id"></s:hidden>
                	<tr><td>系列赛名称</td>
                        <td><s:textfield id="seriesName" name="seriesName" cssClass="InputStyle" />
                    </tr>
                    <tr><td>举办时间(yyyy-mm-dd 至 yyyy-mm-dd)</td>
                        <td><s:textfield id="seriesTime" name="seriesTime" cssClass="InputStyle"/></td>
                    </tr>
                    <tr><td>主办方</td>
                        <td><s:textfield id="sponsor" name="sponsor" cssClass="InputStyle"/></td>
                    </tr>
                    <tr><td>承办方</td>
                        <td><s:textfield id="organizer" name="organizer" cssClass="InputStyle"/>
						</td>
                    </tr>
                    <tr><td>系列赛简介</td>
                        <td><s:textarea id="description" name="description" cssClass="TextareaStyle"></s:textarea></td>
                    </tr>
                </table>
            </div>
        </div>	
		
		<div class="ItemBlock_Title1"><!-- 信息说明 -->
			<div class="ItemBlock_Title1">
        		<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 
        		比赛项目设置  -- [<s:a href="javascript:void(0)" onclick="addMatch()">添加比赛项目</s:a>]
        	</div> 
        </div>
		
		<!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
	        <table cellspacing="0" cellpadding="0" class="TableStyle">
		        <!-- 表头-->
		        <thead>
		            <tr align=center valign=middle id=TableTitle>
		            	<td>比赛名称</td>
		            	<td>比赛类型</td>
						<td>比赛时间</td>
		                <td>比赛地点</td>
		                <td>参赛人数</td>
		                <td>对战轮次</td>
		                <td>积分规则</td>
		                <td>相关操作</td>
		            </tr>
		        </thead>
				
				<!--显示数据列表-->
		        <tbody id="TableData" class="dataContainer" >
		        	<tr class="TableDetail1 template" isNew="0">
		            	<td>启航杯围棋比赛</td>
						<td>围棋</td>
						<td>2016-03-01 至 2016-03-02</td>
		                <td>基础教学楼</td>
		                <td>60</td>
		                <td>6</td>
		                <td>默认</td>
						<td><a href="javascript:void(0)">修改</a>|<a onclick="del()" href="javascript:void(0)">删除</a>
						</td>
					</tr>
					
					<tr class="TableDetail1 template" isNew="3">
		            	<td><input type="text" /></td>
						<td><select>
								<option value="象棋">象棋</option>
								<option value="围棋">围棋</option>
							</select></td>
						<td><input type="text" /></td>
		                <td><input type="text" /></td>
		                <td>0</td>
		                <td><input type="text" value="0" /></td>
		                <td><select>
								<option value="1">胜:2.0 负:-2.0 平:0</option>
								<option value="2">胜:2.0 负:-2.0 平:0</option>
							</select></td>
						<td>
							<a href="javascript:void(0)" onclick="delMatch(this)">删除</a>
						</td>
					</tr>
		        	
		        	<s:iterator id="match" value="#matchList" >
			        	<tr class="TableDetail1 template" isNew="0">
			            	<td><s:property value="#match.matchName" /></td>
							<td><s:property value="#match.matchTypeId" /></td>
							<td><s:property value="#match.matchTime" /></td>
			                <td><s:property value="#match.matchAddress" /></td>
			                <td><s:property value="#match.playerNumber" /></td>
			                <td><s:property value="#match.roundCount" /></td>
			                <td><s:property value="#match.scoreRuleId" /></td>
							<td>
							<s:a href="player_editUI.action?id=%{id}">修改</s:a>|<s:a onclick="del(this)" href="javascript:void(0)">删除</s:a>
							<s:hidden name="id"></s:hidden>
							</td>
						</tr>
		        	</s:iterator>
		        </tbody>
		    </table>
        </div>
		
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/style/images/save.png" onclick="beforeSubmit()"/>
            <a href="javascript:void(0);"><img src="${pageContext.request.contextPath}/style/images/goBack.png"/></a>
        </div>
    </s:form>
</div>

<div class="Description">
	说明：<br />
	1，用户的登录名要唯一，在填写时要同时检测是否可用。<br />
	2，新建用户后，密码被初始化为"1234"。<br />
	3，密码在数据库中存储的是MD5摘要（不是存储明文密码）。<br />
	4，用户登录系统后可以使用“个人设置→修改密码”功能修改密码。<br />
	5，新建用户后，会自动指定默认的头像。用户可以使用“个人设置→个人信息”功能修改自已的头像<br />
	6，修改用户信息时，登录名不可修改。
</div>

<script type="text/javascript">
var matchTypeList = null;
var scoreRuleList = null;

function beforeSubmit(){
	//获取url
	var url = $("#url").val() + "x.action";
	
	
	//提交系列赛信息
	$.ajax({
		type : "post",
		url  : url,
		data : {
			seriesName : $("#seriesName").val(),
			seriesTime : $("#seriesTime").val(),
			sponsor : $("#sponsor").val(),
			organizer : $("#organizer").val(),
			description : $("#description").val()
		},
		success : function(ret){
			var sId = ret;
			var trs = $("#TableData").children();
			for(var index = 0;index < trs.length;index++){
				if($(trs[index]).attr("isNew") == 1){
					var tds = $(trs[index]).children();
					var matchName = $($(tds[0]).children()[0]).val();
					var matchTypeId = $($(tds[1]).children()[0]).val();
					var matchTime = $($(tds[2]).children()[0]).val();
					var matchAddress = $($(tds[3]).children()[0]).val();
					var playerNumber = 0;
					var roundCount = $($(tds[5]).children()[0]).val();
					var scoreRuleId = $($(tds[6]).children()[0]).val();
				                
					$.ajax({
						type : "post",
						url  : "match_add.action",
						data : {
							matchName : matchName,
							matchTypeId : matchTypeId,
							matchTime : matchTime,
							matchAddress : matchAddress,
							playerNumber : playerNumber,
							roundCount : roundCount,
							scoreRuleId : scoreRuleId,
							seriesId : sId
						},
						success : function(){
						}
					}); 
				}
			}
		}
		
	});
}

function addMatch(){
	var html = 
		"<tr class='TableDetail1 template' isNew='1'>"+
           	"<td><input type='text' /></td>"+
			"<td><select>";
			for(var index = 0;index < matchTypeList.length;index++){
				html += "<option value='" + matchTypeList[index].key + "'>" + matchTypeList[index].value + "</option>";
			}
			html += "</select></td>"+
			"<td><input type='text' /></td>"+
            "<td><input type='text' /></td>"+
            "<td>0</td>"+
            "<td><input type='text' value='0' /></td>"+
            "<td><select>";
			for(var index = 0;index < scoreRuleList.length;index++){
				html += "<option value='" + scoreRuleList[index].key + "'>" + scoreRuleList[index].value + "</option>";
			}	
			html += "</select></td>"+
			"<td>"+
				"<a href='javascript:void(0)' onclick='delMatch(this)'>删除</a>"+
			"</td>"+
		"</tr>";
		
		$("#TableData").append(html);
}

function delMatch(obj){
	$(obj).parent().parent().remove();
}

$(function(){
	//请求比赛类型列表 和 比赛分制列表的数据并存储起来
	$.ajax({
		type : "post",
		url  : "series_findMatchTypeList.action",
		dataType : "json",
		success : function(data){
			matchTypeList = data;
		}
	});
	
	$.ajax({
		type : "post",
		url  : "series_findScoreRuleList.action",
		dataType : "json",
		success : function(data){
			scoreRuleList = data;
		}
	});
});
</script>

</body>
</html>

