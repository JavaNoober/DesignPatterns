package com.xiaoqi.designpattern.adapter;

public class AdpaterTest {
	public static void main(String[] args) {
		//类适配器：
		//没有适配之前
		Target target = new Target();
		target.TargetVoltage();
		//适配之后
		ClassAdapter classAdapter = new ClassAdapter();
		classAdapter.TargetVoltage();
		
		//对象适配器
		ObjectAdapter objectAdapter = new ObjectAdapter(new Current());
		objectAdapter.TargetVoltage();
		
		//接口适配器
		InterfaceAdapterRealize iar = new InterfaceAdapterRealize();
		iar.getA();
		iar.getB();
		iar.getC();
	}
}
