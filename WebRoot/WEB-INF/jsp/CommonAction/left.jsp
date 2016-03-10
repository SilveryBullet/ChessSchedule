<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>导航菜单</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script language="JavaScript" src="${pageContext.request.contextPath}/script/jquery.js"></script>
<script language="JavaScript" src="${pageContext.request.contextPath}/script/menu.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/menu.css" />
</head>
<body style="margin: 0">
<div id="Menu">
    <ul id="MenuUl">
        <li class="level1">
            <div onClick="menuClick(this)" class="level1Style"><img src="style/images/MenuIcon/FUNC20001.gif" class="Icon" /> 信息查询</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="player_list.action">选手信息</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">往届系列赛</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="matchType_list.action">比赛棋种</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="scoreRule_list.action">比赛分制</a></div>
                </li>
                <li class="level2">
                	<div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">管理员</a></div>
                </li>
            </ul>
        </li>
        
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20057.gif" class="Icon" /> 安排赛事</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">添加系列赛</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">查看系列赛</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">保留</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">保留</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">保留</a></div>
                </li>
            </ul>
        </li>
        
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20064.gif" class="Icon" /> 信息查询</div>
            <ul style="display: none;" class="MenuLevel2">
                <!-- <li class="level2">
                    <div onClick="subMenuClick(this);" class="level2Style"><img src="style/images/MenuIcon/menu_arrow_close.gif" /> 选手信息</div>
                    <ul style="display: none;" class="MenuLevel2">
                        <li class="level3Head"><a target="right" href="Person_Message/saveUI.html">赛事信息</a></li>
                        <li class="level33"><a target="right" href="Person_Message/inbox.html">比赛详情</a></li>
                        <li class="level33"><a target="right" href="Person_Message/outbox.html">保留</a></li>
                        <li class="level32"><a target="right" href="Person_Message/draftbox.html">保留</a></li>
                    </ul>
                </li> -->
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">选手信息</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">赛事信息</a></div>
                </li>
                <li class="level2">
                	<div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">比赛详情</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">保留</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="javascript:void(0)">保留</a></div>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div class="level1Style"><img src="style/images/MenuIcon/FUNC20056.gif" class="Icon" /> <a target="right" href="javascript:void(0)">系统管理</a></div>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20070.gif" class="Icon" /> 综合行政</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 考勤管理</div>
                </li>
                <li class="level2">
                    <div onClick="subMenuClick(this);" class="level2Style"><img src="style/images/MenuIcon/menu_arrow_close.gif" /> 会议管理</div>
                    <ul style="display: none;" class="MenuLevel2">
                        <li class="level3Head">会议申请</li>
                        <li class="level33">暂存会议查询</li>
                        <li class="level33">待我参加会议</li>
                        <li class="level33">我已参加会议</li>
                        <li class="level33">新建会议纪要</li>
                        <li class="level33">会议纪要查询</li>
                        <li class="level33">待开会议查询</li>
                        <li class="level33">已开会议查询</li>
                        <li class="level33">会议室设置</li>
                        <li class="level32">会议类型设置</li>
                    </ul>
                </li>
                <li class="level2">
                    <div onClick="subMenuClick(this);" class="level2Style"><img src="style/images/MenuIcon/menu_arrow_close.gif" /> 车辆管理</div>
                    <ul style="display: none;" class="MenuLevel2">
                        <li class="level3Head">用车申请</li>
                        <li class="level33">派车管理</li>
                        <li class="level33">我的申请记录</li>
                        <li class="level33">车辆状态</li>
                        <li class="level33">车辆档案</li>
                        <li class="level32">私车公用</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC261000.gif" class="Icon" /> 人力资源</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 档案管理</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 培训记录</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 奖惩记录</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 职位变更</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 人事合同</div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 类别维护</div>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20076.gif" class="Icon" /> 实用工具</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://www.itcast.cn">公司网站</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://qq.ip138.com/train/">火车时刻</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://www.airchina.com.cn/">飞机航班</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://www.ip138.com/post/">邮编/区号</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="_blank" href="http://www.timedate.cn/">国际时间</a></div>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20077.gif" class="Icon" /> 个人设置</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="Person_Config/editUserInfoUI.html">个人信息</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="Person_Config/editPasswordUI.html">密码修改</a></div>
                </li>
<!--                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 桌面定义</div>
                </li>-->
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" class="level1Style"><img src="style/images/MenuIcon/FUNC20082.gif" class="Icon" /> 系统管理</div>
            <ul style="display: none;" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="System_Role/list.html"> 岗位管理</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="System_Department/list.html"> 部门管理</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> <a target="right" href="System_User/list.html"> 用户管理</a></div>
                </li>
                <!--
                <li class="level2">
                    <div class="level2Style"><img src="style/images/MenuIcon/menu_arrow_single.gif" /> 基础数据设置</div>
                </li>
                -->
            </ul>
        </li>
    </ul>
</div>
</body>
</html>

