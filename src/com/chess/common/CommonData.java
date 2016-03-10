package com.chess.common;

import java.util.ArrayList;
import java.util.List;

//学院select列表专用
class DepartmentVO{
	private String departmentName;
	private String departmentValue;
	
	public DepartmentVO(String departmentName, String departmentValue){
		this.departmentName = departmentName;
		this.departmentValue = departmentValue;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentValue() {
		return departmentValue;
	}
	public void setDepartmentValue(String departmentValue) {
		this.departmentValue = departmentValue;
	}
}

public class CommonData {
	//学院列表专用
	private static List<DepartmentVO> departmentList = new ArrayList<DepartmentVO>();
	
	static{
		departmentList.add(new DepartmentVO("选择院系", "未选择"));
		departmentList.add(new DepartmentVO("通信与信息工程学院", "通信与信息工程学院"));
		departmentList.add(new DepartmentVO("电子工程学院", "电子工程学院"));
		departmentList.add(new DepartmentVO("计算机学院", "计算机学院"));
		departmentList.add(new DepartmentVO("自动化学院", "自动化学院"));
		departmentList.add(new DepartmentVO("理学院", "理学院"));
		departmentList.add(new DepartmentVO("经济与管理学院", "经济与管理学院"));
		departmentList.add(new DepartmentVO("数字媒体艺术学院", "数字媒体艺术学院"));
		departmentList.add(new DepartmentVO("人文社科学院", "人文社科学院"));
		departmentList.add(new DepartmentVO("外国语学院", "外国语学院"));
		departmentList.add(new DepartmentVO("研究生院", "研究生院"));
		departmentList.add(new DepartmentVO("其他", "其他"));
	}

	
	
	
	
	
	public static List<DepartmentVO> getDepartmentList() {
		return departmentList;
	}

	public static void setDepartmentList(List<DepartmentVO> departmentList) {
		CommonData.departmentList = departmentList;
	}
}
