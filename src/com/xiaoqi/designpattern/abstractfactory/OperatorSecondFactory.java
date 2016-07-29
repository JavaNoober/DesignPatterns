package com.xiaoqi.designpattern.abstractfactory;


public class OperatorSecondFactory implements IProvider{

	public IOperator produce() {
		return new OperateSecond();
	}
 
}
