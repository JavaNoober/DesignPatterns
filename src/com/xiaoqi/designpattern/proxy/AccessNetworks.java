package com.xiaoqi.designpattern.proxy;

public class AccessNetworks implements IInternet {

	public void gotoGoogle() {
		System.out.println("不能直接访问谷歌");
	}

}
