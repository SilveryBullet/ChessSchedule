package com.chess.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.chess.base.BaseAction;
import com.chess.entity.MatchType;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class MatchTypeAction extends BaseAction<MatchType> {
	//列表
	public String list(){
		//读取信息
		List<MatchType> matchTypeList = matchTypeService.findAll();
		if(matchTypeList != null){
			for(int i = 0;i < matchTypeList.size();){
				if(matchTypeList.get(i).getState().equals("正常") == false){
					matchTypeList.remove(i);
				}
				else {
					i++;
				}
			}
			
			ActionContext.getContext().put("matchTypeList", matchTypeList);
		}
		
		return "list";
	}
	
	//跳转到添加页面
	public String addUI(){
		return "saveUI";
	}
	
	//添加
	public String add(){
		matchTypeService.save(model);
		
		return "toList";
	}
	
	//跳转到修改页面
	public String editUI(){
		MatchType matchType = matchTypeService.findById(model.getId());
		ActionContext.getContext().getValueStack().push(matchType);
		
		return "saveUI";
	}
	
	//修改
	public String edit(){
		matchTypeService.update(model);
		
		return "toList";
	}
	
	//删除
	public String delete(){
		MatchType matchType = matchTypeService.findById(model.getId());
		matchType.setState("删除");
		matchTypeService.update(matchType);
		
		return "toList";
	}
}
