package com.xiaoqi.designpattern.singleton;

public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance4();
		s.id = 1;
		new Thread(new Runnable() {
			
			public void run() {
				Singleton.getInstance4().id1 =2;
				System.out.println(Singleton.getInstance4().id);
				System.out.println(Singleton.getInstance4().id1);
				System.out.println(Singleton.getInstance4().id2);
				System.out.println(Singleton.getInstance4().id3);
			}
		}).start();
		new Thread(new Runnable() {
			
			public void run() {
				Singleton.getInstance4().id2 =3;
				System.out.println(Singleton.getInstance4().id);
				System.out.println(Singleton.getInstance4().id1);
				System.out.println(Singleton.getInstance4().id2);
				System.out.println(Singleton.getInstance4().id3);
			}
		}).start();
		new Thread(new Runnable() {
			
			public void run() {
				Singleton.getInstance4().id3 =4;
				System.out.println(Singleton.getInstance4().id);
				System.out.println(Singleton.getInstance4().id1);
				System.out.println(Singleton.getInstance4().id2);
				System.out.println(Singleton.getInstance4().id3);
			}
		}).start();
	}

}
