package com.xiaoqi.designpattern.factorymethod;

import java.util.BitSet;

/**
 * ��ͨ����ģʽ
 * ���ǳ����˴����Ķ�����Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ������ͨ����������ģʽ���д���
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		//��ͨ����ģʽ
		OperatorFactory factory = new OperatorFactory();
		IOperator operator = factory.produce("first");
		operator.operate();
		
		//�����������ģʽ
		OperatorFactory factory2 = new OperatorFactory();
		IOperator operator2 = factory2.produceFirst();
		operator2.operate();
		
		//��̬����ģʽ
		IOperator operator3 = OperatorFactory.getFirst();
		operator3.operate();
	}

}
