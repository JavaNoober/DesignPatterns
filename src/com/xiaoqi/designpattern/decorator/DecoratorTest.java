package com.xiaoqi.designpattern.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		IRole role = new ActorProperty(new ActorProperty(new Scourge(),"½£Ê¥"), "Ê¥½£");
		System.out.println(role.describe());
	}
}
