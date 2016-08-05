package com.xiaoqi.designpattern.builder;
/**
 * 建造者模式
 * 与工厂模式不同的是，多了一个Designer，用于管理ConcreteBuilder。可以说是讲工厂模式强制分离。
 * 一般Builder类是对各个组件的建造，而Designer则是对建造过程的具体操作。这种模式对封装性更好，修改的时候我们只需要新建Builder，而不用修改之前代码，保证了稳定性.
 * 同时，当有很多属性需要设置的时候，用builder模式就很清楚。
 */
public class BuilderTest {
	public static void main(String[] args) {
		//方式一：
		IBuilder builder = new ConcreteBuilder();
		Designer designer = new Designer();
		designer.design(builder);
		builder.getHome();
		//方式二：
		IBuilder2 builder2 = new ConcreteBuilder2();
		Designer designer2 = new Designer();
		designer2.design2(builder2);
		builder2.getHome();
		//方式三：
		CustomDialog dialog =new CustomDialog.Builder()
							.setBtnName("name")
							.setTitle("title")
							.setContent("content")
							.build();
	}
}
