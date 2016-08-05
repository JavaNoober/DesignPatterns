package com.xiaoqi.designpattern.adapter;

/**
 * 类适配器，通过继承和实现接口来关联
 *
 */
public class ClassAdapter extends Current implements ITarget{

	public void TargetVoltage() {
		getCurrent();
	}
	
}
