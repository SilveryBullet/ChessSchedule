package com.chess.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.chess.base.BaseAction;
import com.chess.entity.MatchType;
import com.chess.entity.ScoreRule;
import com.chess.entity.Series;

@Controller
@Scope("prototype")
public class SeriesAction extends BaseAction<Series> {
	//列表
	public String list(){
		//获取当前已经有的系列赛
		//List<Series> seriesList = seriesService.findAll();

		
		return "list";
	}
	
	//跳转到添加页面
	public String addUI(){
		//获取比赛类型列表信息和积分规则列表信息
		List<MatchType> tempList1 = matchTypeService.findAll();
		List<ScoreRule> tempList2 = scoreRuleService.findAll();
		if(tempList1 == null || tempList1.size() == 0){
			return "createMatchTypeFirst";
		}
		if(tempList2 == null || tempList2.size() == 0){
			return "createScoreRuleFirst";
		}
		
		return "saveUI";
	}
	
	
	
	//跳转到修改页面
	public String editUI(){
		return "saveUI";
	}
	
	//修改
	public String edit(){
		return "toList";
	}
	
	//删除
	public String delete(){
		return "toList";
	}
	
	
	//异步请求  获取比赛类型列表
	public String findMatchTypeList() throws Exception{
		//比赛类型
		class MatchTypeVO{
			private Long key;
			private String value;
			
			public MatchTypeVO(Long key, String value){
				this.key = key;
				this.value = value;
			}
			
			public Long getKey() {
				return key;
			}
			public void setKey(Long key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		List<MatchType> tempList1 = matchTypeService.findAll();
		List<MatchTypeVO> matchTypeList = new ArrayList<MatchTypeVO>();
		if(tempList1 != null && tempList1.size() != 0){
			for(int i = 0;i < tempList1.size();){
				if(tempList1.get(i).getState().equals("正常") == false){
					tempList1.remove(i);
				}
				else{
					i++;
				}
			}
			
			for (MatchType matchType : tempList1) {
				matchTypeList.add(new MatchTypeVO(matchType.getId(),matchType.getTypeName()));
			}
		}
		
		String json = JSON.toJSONString(matchTypeList);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.write(json);
		
		return null;
	}
	
	public String findScoreRuleList() throws Exception{
		//比赛分制
		class ScoreRuleVO{
			private Long key;
			private String value;
			
			public ScoreRuleVO(Long key, String value){
				this.key = key;
				this.value = value;
			}
			
			public Long getKey() {
				return key;
			}
			public void setKey(Long key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
		List<ScoreRule> tempList2 = scoreRuleService.findAll();
		List<ScoreRuleVO> scoreRuleList = new ArrayList<ScoreRuleVO>();
		if(tempList2 != null && tempList2.size() != 0){
			for(int i = 0;i < tempList2.size();){
				if(tempList2.get(i).getState().equals("正常") == false){
					tempList2.remove(i);
				}
				else{
					i++;
				}
			}
			for (ScoreRule scoreRule : tempList2) {
				scoreRule.createDescription();
				scoreRuleList.add(new ScoreRuleVO(scoreRule.getId(),scoreRule.getDescription()));
			}
		}
		
		String json = JSON.toJSONString(scoreRuleList);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.write(json);
		
		return null;
	}
	
	//异步请求  添加
		public String addx() throws Exception{
			seriesService.save(model);
			
			String ret = model.getId().toString();
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();
			pw.write(ret);
			
			return null;
		}
}
