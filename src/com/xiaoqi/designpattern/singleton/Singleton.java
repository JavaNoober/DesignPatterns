package com.xiaoqi.designpattern.singleton;

/**
 * 	单例模式
 *
 */
public class Singleton {
	private static Singleton singleton;
	public int id;
	public int id2;
	public int id1;
	public int id3;
	/**
	 *私有构造方法，防止被实例化
	 *暂时注释掉
	 */
	private Singleton() {
	} 
	
	//线程不安全
	public static Singleton getInstance1(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	
	//线程安全但是性能上有所下降，每次getInstance2()都要加锁，事实上只有第一次需要，之后就不需要了。
	public static synchronized Singleton getInstance2(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	/**
	 *  引用：
	 *  a>A、B线程同时进入了第一个if判断
	 *
	 *	b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
	 *
	 *	c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
	 *
	 *	d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
	 *
	 *	e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
	 */
	public static Singleton getInstance3(){
		if(singleton == null){
			synchronized (singleton) {
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	/**
	 * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
	 * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕
	 *
	 */
	public static class SingletonFactory{
		private static Singleton singleton = new Singleton();
	}
	
	public static Singleton	getInstance4(){
		return SingletonFactory.singleton;
	}
	
	/**
	 * 这个方法也可以
	 */
    private static synchronized void syncInit() {  
        if (singleton == null) {  
        	singleton = new Singleton();  
        }  
    }  
  
    public static Singleton getInstance5() {  
        if (singleton == null) {  
            syncInit();  
        }  
        return singleton;  
    }  
}
