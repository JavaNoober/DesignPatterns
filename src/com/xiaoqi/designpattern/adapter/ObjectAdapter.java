package com.xiaoqi.designpattern.adapter;
/**
 * ͨ��ί�������й���
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
