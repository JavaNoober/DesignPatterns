package com.xiaoqi.designpattern.builder;

public interface IBuilder {
	public void buildHouse();
	public void buildCar();
	public void buildRoom();
	public Home getHome();
}
