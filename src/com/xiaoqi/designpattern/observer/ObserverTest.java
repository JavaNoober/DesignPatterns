package com.xiaoqi.designpattern.observer;

public class ObserverTest {
	public static void main(String[] args) {
		ConcreteObserver co1 = new ConcreteObserver();
		co1.update("观察者1");
		ConcreteObserver co2 = new ConcreteObserver();
		co2.update("观察者2");
		ConcreteTarget target = new ConcreteTarget();
		target.registerObserver(co1);
		target.registerObserver(co2);
		target.setNewInfo("信息改变-------");
	}
}
