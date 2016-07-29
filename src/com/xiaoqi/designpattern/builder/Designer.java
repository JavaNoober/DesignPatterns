package com.xiaoqi.designpattern.builder;

public class Designer {
	
	public void design(IBuilder builder){
		builder.buildCar();
		builder.buildHouse();
		builder.buildRoom();
	}
	
	public void design2(IBuilder2 builder){
		 builder.buildCar()
		.buildHouse()
		.buildRoom();
	}
}
