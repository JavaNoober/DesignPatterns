package com.xiaoqi.designpattern.adapter;

/**
 * ����������ͨ���̳к�ʵ�ֽӿ�������
 *
 */
public class ClassAdapter extends Current implements ITarget{

	public void TargetVoltage() {
		getCurrent();
	}
	
}
