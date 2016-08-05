package com.xiaoqi.designpattern.abstractfactory;

/**
 * 抽象工厂模式
 * 扩展性较好
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		IProvider provder = new OperatorFirstFactory();
		IOperator operator = provder.produce();
		operator.operate();
	}

}
