package com.chess.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.chess.base.BaseAction;
import com.chess.entity.Common;

@Controller
@Scope("prototype")
public class CommonAction extends BaseAction<Common>{
	public String indexUI(){
		return "indexUI";
	}
	
	public String topUI(){
		return "topUI";
	}
	
	public String leftUI(){
		return "leftUI";
	}
	
	public String rightUI(){
		return "rightUI";
	}
	
	public String bottomUI(){
		return "bottomUI";
	}
}
