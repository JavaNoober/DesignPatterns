package com.xiaoqi.designpattern.bridge;

public class BridgeImpl extends Bridge {

	public BridgeImpl(IOperate operate) {
		super(operate);
	}
	
    public void otherOperation() {
        // ʵ��һ���Ĺ��ܣ����ܻ�ʹ�þ���ʵ�ֲ��ֵ�ʵ�ַ���,
    	System.out.println("ʵ�ֶ������");
    }
}
