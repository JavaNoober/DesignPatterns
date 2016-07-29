package com.xiaoqi.designpattern.abstractfactory;

/**
 * ���󹤳�ģʽ
 * ��չ�ԽϺ�
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		IProvider provder = new OperatorFirstFactory();
		IOperator operator = provder.produce();
		operator.operate();
	}

}
