<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>棋类编排 - 系统主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<frameset rows="100,*,25" framespacing="0" border="0" frameborder="0">
    <frame src="common_topUI.action" name="TopMenu"  scrolling="no" noresize />
    <frameset cols="180,*" id="resize">
        <frame noresize name="menu" src="common_leftUI.action" scrolling="yes" />
        <frame noresize name="right" src="common_rightUI.action" scrolling="yes" />
    </frameset>
    <frame noresize name="status_bar" scrolling="no" src="common_bottomUI.action" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
