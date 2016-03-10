package com.chess.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.chess.base.BaseAction;
import com.chess.entity.ScoreRule;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class ScoreRuleAction extends BaseAction<ScoreRule> {
	//列表
		public String list(){
			//读取信息
			List<ScoreRule> scoreRuleList = scoreRuleService.findAll();
			if(scoreRuleList != null){
				for(int i = 0;i < scoreRuleList.size();){
					if(scoreRuleList.get(i).getState().equals("正常") == false){
						scoreRuleList.remove(i);
					}
					else {
						i++;
					}
				}
				
				ActionContext.getContext().put("scoreRuleList", scoreRuleList);
			}
			
			return "list";
		}
		
		//跳转到添加页面
		public String addUI(){
			return "saveUI";
		}
		
		//添加
		public String add(){
			scoreRuleService.save(model);
			
			return "toList";
		}
		
		//跳转到修改页面
		public String editUI(){
			ScoreRule scoreRule = scoreRuleService.findById(model.getId());
			ActionContext.getContext().getValueStack().push(scoreRule);
			
			return "saveUI";
		}
		
		//修改
		public String edit(){
			scoreRuleService.update(model);
			
			return "toList";
		}
		
		//删除
		public String delete(){
			ScoreRule scoreRule = scoreRuleService.findById(model.getId());
			scoreRule.setState("删除");
			scoreRuleService.update(scoreRule);
			
			return "toList";
		}
}
