package com.xiaoqi.designpattern.adapter;

public class AdpaterTest {
	public static void main(String[] args) {
		//����������
		//û������֮ǰ
		Target target = new Target();
		target.TargetVoltage();
		//����֮��
		ClassAdapter classAdapter = new ClassAdapter();
		classAdapter.TargetVoltage();
		
		//����������
		ObjectAdapter objectAdapter = new ObjectAdapter(new Current());
		objectAdapter.TargetVoltage();
		
		//�ӿ�������
		InterfaceAdapterRealize iar = new InterfaceAdapterRealize();
		iar.getA();
		iar.getB();
		iar.getC();
	}
}
