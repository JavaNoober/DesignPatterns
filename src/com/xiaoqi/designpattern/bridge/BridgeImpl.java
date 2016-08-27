package com.xiaoqi.designpattern.bridge;

public class BridgeImpl extends Bridge {

	public BridgeImpl(IOperate operate) {
		super(operate);
	}
	
    public void otherOperation() {
        // 实现一定的功能，可能会使用具体实现部分的实现方法,
    	System.out.println("实现额外操作");
    }
}
