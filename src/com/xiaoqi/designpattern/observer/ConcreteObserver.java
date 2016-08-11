package com.xiaoqi.designpattern.observer;

public class ConcreteObserver implements IObserver {

	public void update(String info) {
		System.out.println(info);
	}

}
