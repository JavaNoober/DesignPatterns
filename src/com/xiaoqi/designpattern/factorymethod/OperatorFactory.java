package com.xiaoqi.designpattern.factorymethod;

public class OperatorFactory {
	
	/**
	 * ��ͨ����ģʽ
	 * @param type
	 * @return
	 */
	public IOperator produce(String type){
		if("first".equals(type)){
			return new OperateFirst();
		}else if("second".equals(type)){
			return new OperateSecond();
		}else{
			return null;
		}
	}
	
	/*---------------------------------------*/
	/**
	 * �����������ģʽ
	 * 
	 */
	public IOperator produceSecond(){
		return new OperateSecond();
	}
	
	public IOperator produceFirst(){
		return new OperateFirst();
	}
	
	/*---------------------------------------*/
	
	/**
	 * ��̬����ģʽ
	 * 
	 */
	
	public static IOperator getSecond(){
		return new OperateSecond();
	}
	
	public static IOperator getFirst(){
		return new OperateFirst();
	}
	
}
