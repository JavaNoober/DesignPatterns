package com.xiaoqi.designpattern.proxy;
/**
 * 代理模式
 * 它和装饰者模式很像,但是代理的对象是不暴露出来的，这是一个与装饰者明显的区别
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		IInternet internet = new ProxySettings();
		internet.gotoGoogle();
	}
}
