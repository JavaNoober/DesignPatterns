package com.xiaoqi.designpattern.factorymethod;

import java.util.BitSet;

/**
 * 普通工厂模式
 * 凡是出现了大量的对象需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		//普通工厂模式
		OperatorFactory factory = new OperatorFactory();
		IOperator operator = factory.produce("first");
		operator.operate();
		
		//多个方法工厂模式
		OperatorFactory factory2 = new OperatorFactory();
		IOperator operator2 = factory2.produceFirst();
		operator2.operate();
		
		//静态工厂模式
		IOperator operator3 = OperatorFactory.getFirst();
		operator3.operate();
	}

}
