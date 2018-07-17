package com.naresh.bean;

import java.util.List;
import java.util.Map;

public class Demo 
{
	private List theList;
	private Map theMap;
	public void setTheList(List theList) {
		this.theList = theList;
	}
	public void setTheMap(Map theMap) {
		this.theMap = theMap;
	}
	public void showTheMap()
	{
		String str=theMap.getClass().getName();
		System.out.println("container created object "+str);
		System.out.println(theMap);
	}
	public void showTheList()
	{
		String str=theList.getClass().getName();
		System.out.println("container created object"+str);
		System.out.println(theList);
	}
	
	

}
