package com.xiaoqi.designpattern.decorator;

public class RoleDecorator implements IRole {
	IRole role;
	
	public RoleDecorator(IRole role){
		this.role = role;
	}
	
	public String describe() {
		return role.describe();
	}

}
