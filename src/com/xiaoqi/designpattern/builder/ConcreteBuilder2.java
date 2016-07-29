package com.xiaoqi.designpattern.builder;

public class ConcreteBuilder2 implements IBuilder2 {
	private Home home = new Home();
	
	public IBuilder2 buildHouse() {
		System.out.println("buildHouse");
		return this;
	}

	public IBuilder2 buildCar() {
		System.out.println("buildCar");
		return this;
	}

	public IBuilder2 buildRoom() {
		System.out.println("buildRoom");
		return this;
	}

	public Home getHome() {
		return home;
	}

}
