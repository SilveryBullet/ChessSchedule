<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>选手信息</title>
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
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 选手信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id=MainArea>
    <s:form action="player_%{id == null ? 'add' : 'edit'}">
        <div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 选手信息 </div> 
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                	<s:hidden name="id"></s:hidden>
                	<tr><td>学号</td>
                        <td><s:textfield name="playerNO" cssClass="InputStyle" />
                    </tr>
                    <tr><td>姓名</td>
                        <td><s:textfield name="name" cssClass="InputStyle"/></td>
                    </tr>
                    <tr><td width="100">所在学院</td>
                        <td>
                        <s:select list="%{#departmentList}" name="department" listKey="departmentValue" 
                        listValue="departmentName" cssClass="SelectStyle">
                        	 
                        </s:select>
                        <!-- <select name="department" class="SelectStyle">
                                <option value="未选择" selected="selected">选择院系</option>
                                <option value="通信与信息工程学院">通信与信息工程学院</option>
                                <option value="电子工程学院">电子工程学院</option>
                                <option value="计算机学院">计算机学院</option>
                                <option value="自动化学院">自动化学院</option>
                                <option value="理学院">理学院</option>
                                <option value="经济与管理学院">经济与管理学院</option>
                                <option value="数字媒体艺术学院">数字媒体艺术学院</option>
                                <option value="人文社科学院">人文社科学院</option>
                                <option value="外国语学院">外国语学院</option>
                                <option value="研究生院">研究生院</option>
                                <option value="其他">其他</option>                               
                            </select>  
                        -->
                        </td>
                    </tr>
                    <tr><td>专业</td>
                        <td><s:textfield name="major" cssClass="InputStyle"/></td>
                    </tr>
                    <tr><td>班级</td>
                        <td><s:textfield name="clazz" cssClass="InputStyle"/>
						</td>
                    </tr>
					<tr><td>性别</td>
                        <td><s:radio list="#{'男':'男','女':'女','未知':'未知'}" name="gender" value="%{id == null ? '未知' : gender }" />
						</td>
                    </tr>
					<tr><td>联系电话</td>
                        <td><s:textfield name="phoneNumber" cssClass="InputStyle"/></td>
                    </tr>
                    <tr><td>E-mail</td>
                        <td><s:textfield name="email" cssClass="InputStyle"/></td>
                    </tr>
                    <tr><td>备注</td>
                        <td><s:textarea name="detail" cssClass="TextareaStyle"></s:textarea></td>
                    </tr>
                </table>
            </div>
        </div>	
		
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/style/images/save.png"/>
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

</body>
</html>

