package com.xiaoqi.designpattern.builder;


public interface IBuilder2 {
	//调用方也是自己,每次操作完后返回对象为自己
	public IBuilder2 buildHouse();
	public IBuilder2 buildCar();
	public IBuilder2 buildRoom();
	public Home getHome();
}
