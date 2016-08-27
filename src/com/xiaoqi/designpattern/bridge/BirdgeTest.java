package com.xiaoqi.designpattern.bridge;

public class BirdgeTest {

	public static void main(String[] args) {
		IOperate operate = new OperateImpl();
		operate.doSomething();
		BridgeImpl bridge = new BridgeImpl(operate);
		bridge.otherOperation();
	}

}
