package com.xiaoqi.designpattern.proxy;
/**
 * 代理模式
 * 它和装饰者模式很像
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		IInternet internet = new ProxySettings();
		internet.gotoGoogle();
	}
}
