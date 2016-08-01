package com.xiaoqi.designpattern.adapter;
/**
 * 通过委派来进行关联
 *
 */
public class ObjectAdapter implements ITarget{
	private Current current;
	
	public ObjectAdapter(Current current){
		this.current = current;
	}

	public void TargetVoltage() {
		current.getCurrent();
	}
	
}
