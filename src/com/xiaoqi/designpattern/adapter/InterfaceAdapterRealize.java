package com.xiaoqi.designpattern.adapter;

public class InterfaceAdapterRealize extends InterfaceAdapter{
	
	public void getA() {
		super.getA();
		System.out.println("只实现了A方法");
	}
	
}
