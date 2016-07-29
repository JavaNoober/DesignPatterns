package com.xiaoqi.designpattern.abstractfactory;


public class OperatorFirstFactory implements IProvider{

	public IOperator produce() {
		return new OperateFirst();
	}
 
}
