package com.xiaoqi.designpattern.proxy;
/**
 * ����ģʽ
 * ����װ����ģʽ����
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		IInternet internet = new ProxySettings();
		internet.gotoGoogle();
	}
}
