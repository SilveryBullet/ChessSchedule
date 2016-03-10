package com.chess.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.chess.base.BaseAction;
import com.chess.entity.Match;

@Controller
@Scope("prototype")
public class MatchAction extends BaseAction<Match> {
	//添加比赛
	public String add(){
		matchService.save(model);
		
		return "toList";
	}
}
