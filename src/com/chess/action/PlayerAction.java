package com.chess.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.chess.base.BaseAction;
import com.chess.common.CommonData;
import com.chess.entity.Player;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PlayerAction extends BaseAction<Player> {
	/**
	 * 列表
	 * @return
	 */
	public String list(){
		//查询当前所有成员
		List<Player> playerList = playerService.findAll();
		if(playerList != null){
			for (int i = 0;i < playerList.size();) {
				if(playerList.get(i).getState().equals("正常") == false){
					playerList.remove(i);
				}
				else {
					i++;
				}
			}
			ActionContext.getContext().put("playerList", playerList);
		}
		
		return "list";
	}
	
	/**
	 * 添加
	 * @return
	 */
	public String addUI(){
		//准备列表数据
		ActionContext.getContext().put("departmentList",CommonData.getDepartmentList());
		
		return "saveUI";
	}
	
	/**
	 * 修改
	 * @return
	 */
	public String editUI(){
		//准备列表数据
		ActionContext.getContext().put("departmentList",CommonData.getDepartmentList());
		
		//准备回显数据
		Player player = playerService.findById(model.getId());
		ActionContext.getContext().getValueStack().push(player);
		
		return "saveUI";
	}
	
	/**
	 * 添加
	 * @return toList 重定向
	 */
	public String add() throws Exception{
		//model.setName(new String(model.getName().getBytes("ISO-8859-1"),"UTF-8"));
		//model.setDepartment(new String(model.getDepartment().getBytes("ISO-8859-1"),"UTF-8"));
		playerService.save(model);
		
		return "toList";
	}
	
	/**
	 * 修改
	 * @return toList 重定向
	 */
	public String edit() throws Exception{
		//model.setName(new String(model.getName().getBytes("ISO-8859-1"),"UTF-8"));
		//model.setDepartment(new String(model.getDepartment().getBytes("ISO-8859-1"),"UTF-8"));
		playerService.update(model);
		
		return "toList";
	}
	
	
	/**
	 * 删除
	 * @return list 重定向
	 */
	public String delete(){
		Player player = playerService.findById(model.getId());
		player.setState("删除");
		playerService.update(player);
		
		return "toList";
	}
}
