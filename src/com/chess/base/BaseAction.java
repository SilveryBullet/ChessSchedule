package com.chess.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.chess.service.AdminService;
import com.chess.service.MatchService;
import com.chess.service.MatchTypeService;
import com.chess.service.PlayerService;
import com.chess.service.ScoreRuleService;
import com.chess.service.SeriesService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public abstract class BaseAction<T> extends ActionSupport implements
		ModelDriven<T> {

	protected T model;

	public BaseAction() {
		try {
			// 通过反射获得真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass()
					.getGenericSuperclass();
			@SuppressWarnings("unchecked")
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			// 通过反射创建model实例
			model = clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public T getModel() {
		return model;
	}

	public HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	// ==========================Resource支持===================================
	// @Resource
	//protected RoleService roleService;
	
	@Resource
	protected AdminService adminService;
	
	@Resource
	protected PlayerService playerService;
	
	@Resource
	protected SeriesService seriesService;
	
	@Resource
	protected MatchTypeService matchTypeService;
	
	@Resource
	protected ScoreRuleService scoreRuleService;
	
	@Resource
	protected MatchService matchService;
}
