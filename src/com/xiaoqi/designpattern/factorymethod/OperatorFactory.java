package com.xiaoqi.designpattern.factorymethod;

public class OperatorFactory {
	
	/**
	 * 普通工厂模式
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
	 * 多个工厂方法模式
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
	 * 静态工厂模式
	 * 
	 */
	
	public static IOperator getSecond(){
		return new OperateSecond();
	}
	
	public static IOperator getFirst(){
		return new OperateFirst();
	}
	
}
