package com.xiaoqi.designpattern.builder;

public class ConcreteBuilder implements IBuilder {
	private Home home = new Home();
	
	public void buildHouse() {
		System.out.println("buildHouse");
	}

	public void buildCar() {
		System.out.println("buildCar");
	}

	public void buildRoom() {
		System.out.println("buildRoom");
	}

	public Home getHome() {
		return home;
	}

}
