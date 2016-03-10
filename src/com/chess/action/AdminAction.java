package com.chess.action;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.chess.base.BaseAction;
import com.chess.entity.Admin;
import com.chess.util.MD5;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class AdminAction extends BaseAction<Admin> {
	//转到loginUI.jsp
	public String loginUI(){
		return "loginUI";
	}
	
	//异步请求，检查管理员登录
	public String checkLogin() throws Exception{	
		Map<String, String> msg = new HashMap<String, String>();
		
		//获取用户信息并且对密码进行转码操作
		model.setPassword(MD5.GetMD5Code(model.getPassword()));
		
		//查询数据库
		Admin admin = adminService.findByLoginNameAndPassword(model.getLoginName(),model.getPassword());
		
		//返回信息逻辑
		if(admin != null){
			ActionContext.getContext().getSession().put("admin",admin);
			msg.put("state", "success");
			msg.put("msg", "登陆成功！欢迎使用本系统!");
		}
		else{
			msg.put("state", "error");
			msg.put("msg", "用户名或密码错误!");
		}
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		String json = JSON.toJSONString(msg);
		PrintWriter pw = response.getWriter();
		pw.write(json);
		
		return null;
	}
}
