package com.xiaoqi.designpattern.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		IRole role = new ActorProperty(new ActorProperty(new Scourge(),"剑圣"), "圣剑");
		System.out.println(role.describe());
	}
}
