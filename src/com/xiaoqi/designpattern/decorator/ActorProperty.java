package com.xiaoqi.designpattern.decorator;

public class ActorProperty extends RoleDecorator {
	String actor;
	
	public ActorProperty(IRole role,String actor) {
		super(role);
		this.actor = actor;
	}
	
	public String describe() {
		return super.describe() + " " +actor;
	}
}
