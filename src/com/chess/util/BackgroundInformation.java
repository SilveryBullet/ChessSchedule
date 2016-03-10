package com.chess.util;

public class BackgroundInformation {
	public static void actionBegin(String str){
		System.out.println("----- 用户执行 " + str + " 操作 -----");
	}
	
	public static void actionFinish(){
		System.out.println("----- 操作完成 -----");
	}
}
