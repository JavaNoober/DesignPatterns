package com.xiaoqi.designpattern.proxy;

public class ProxySettings implements IInternet {

	AccessNetworks accessNetworks;
	
	public ProxySettings(){
		accessNetworks = new AccessNetworks();
	}
	
	public void gotoGoogle() {
		accessNetworks.gotoGoogle();
		settings();
		settingAfter();
	}

	private void settings(){
		System.out.println("通过代理进行设置");
	}
	
	private void settingAfter(){
		System.out.println("成功访问google");
	}
}
