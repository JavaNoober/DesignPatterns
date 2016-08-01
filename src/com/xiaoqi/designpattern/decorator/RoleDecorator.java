package com.xiaoqi.designpattern.decorator;

//×°ÊÎÕß
public class RoleDecorator implements IRole {
	IRole role;
	
	public RoleDecorator(IRole role){
		this.role = role;
	}
	
	public String describe() {
		return role.describe();
	}

}
