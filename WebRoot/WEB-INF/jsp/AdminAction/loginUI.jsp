<html>
<head>
    <meta http-equiv=Content-type CONTENT="text/html; charset=utf-8" />
	<title>棋类编排 - 管理员登录</title>
	<link href="${pageContext.request.contextPath}/style/blue/login.css" type=text/css rel=stylesheet />
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/top.css" />
</head>

<style>
#Head2 {
	height: 31px;
}
</style>

<body LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 class=PageBody >

<div id="Head1">
		<div id="Logo">
			<a id="msgLink" href="javascript:void(0)"></a>
            <font color="#0000CC" style="color:#F1F9FE; font-size:28px; font-family:Arial Black, Arial">弈林棋社-棋类编排系统</font> 
			<!-- <img border="0" src="style/blue/images/logo.png" /> -->
        </div>
		
		<div id="Head1Right">
			<div id="Head1Right_UserName">
                <img border="0" width="13" height="14" src="style/images/top/user.gif" /> 您好，<b>请登录&nbsp;&nbsp;</b>
			</div>
			<div id="Head1Right_UserDept"></div>
		</div>
		
        <div id="Head1Right_SystemButton">
            <a target="_parent" href="System_User/logout.html">
				<img width="78" height="20" alt="退出系统" src="style/blue/images/top/logout.gif" />
			</a>
        </div>
	</div>
    
    <div id="Head2">
         <div id="Head2_Awoke">
            <ul id="AwokeNum">
                <li><a target="desktop" href="javascript:void(0)">
						<img border="0" width="11" height="13" src="style/images/top/msg.gif" /> 正在进行的比赛：
						<span id="msg"></span>
					</a>
				</li>
            </ul>
        </div> 
	</div>







<form method="post" name="actForm" action="javascript:void(0)">
    <div id="CenterAreaBg">
        <div id="CenterArea">
            <div id="LogoImg"><IMG border="0" src="${pageContext.request.contextPath}/style/blue/images/logo.png" /></div>
            <div id="LoginInfo">
                <table border=0 CELLSPACING=0 CELLPADDING=0 width=100%>
                    <tr>
                        <td width=45 class="Subject">
                        	<img border="0" src="${pageContext.request.contextPath}/style/blue/images/login/userId.gif" />
                        </td>
                        <td>
                        	<input id="loginName" size="20" class="TextField" type="text" name="loginName" />
                        </td>
                        <td ROWSPAN="2" style="padding-left:10px;">
                        	<input id="submit" type="image" src="${pageContext.request.contextPath}/style/blue/images/login/userLogin_button.gif"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="Subject">
                        	<img border="0" src="${pageContext.request.contextPath}/style/blue/images/login/password.gif" />
                        </td>
                        <td>
                        	<input id="password" size="20" class="TextField" type="password" name="password" />
                        </td>
                    </tr>
                </table>
            </div>
            <!-- 后期可以放链接 -->
            <div id="CopyRight"><a href="javascript:void(0)">&copy; 弈林棋社 版权所有 棋类比赛编排V1.01</a></div>
        </div>
    </div>
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery-1.9.1.min.js" ></script>
<script type="text/javascript">
	$(function(){
		$("#submit").bind("click",function(){
			//检查用户名和密码不能为空
			if($("#loginName").val() == ""){
				alert("用户名不能为空！");
				$("#loginName").focus();
				return;
			}
			
			if($("#password").val() == ""){
				alert("密码不能为空！");
				$("#password").focus();
				return;
			}
			
			//用户登录验证
			$.ajax({
				type : "post",
				url  : "admin_checkLogin.action",
				data : {
					loginName : $("#loginName").val(),
					password  : $("#password").val()
				},
				dataType : "json",
				success : function(data){
					alert(data.msg);
					if(data.state == "success"){
						window.open("common_indexUI.action","_self");
					}
				},
				error : function(){
					alert("网络异常！请稍后再试！");
				}
			});
		});
	});
</script>
</html>
