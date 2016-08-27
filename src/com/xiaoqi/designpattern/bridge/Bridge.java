package com.xiaoqi.designpattern.bridge;

public abstract class Bridge {
	private IOperate operate;
	public Bridge(IOperate operate){
		this.operate = operate;
	}
	
	public void bridgeOperate(){
		operate.doSomething();
	}
}
