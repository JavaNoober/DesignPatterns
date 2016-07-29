package com.xiaoqi.designpattern.adapter;

public class Target implements ITarget {

	public void TargetVoltage() {
		System.out.println("电器电压是180V，不能使用220V");
	}

}
