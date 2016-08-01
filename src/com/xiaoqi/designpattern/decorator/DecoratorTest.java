package com.xiaoqi.designpattern.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		IRole role = new ActorProperty(new ActorProperty(new Scourge(),"��ʥ"), "ʥ��");
		System.out.println(role.describe());
	}
}
