package com.xiaoqi.designpattern.builder;


public interface IBuilder2 {
	//���÷�Ҳ���Լ�,ÿ�β�����󷵻ض���Ϊ�Լ�
	public IBuilder2 buildHouse();
	public IBuilder2 buildCar();
	public IBuilder2 buildRoom();
	public Home getHome();
}
