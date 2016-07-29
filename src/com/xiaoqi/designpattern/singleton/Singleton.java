package com.xiaoqi.designpattern.singleton;

/**
 * 	����ģʽ
 *
 */
public class Singleton {
	private static Singleton singleton;
	public int id;
	public int id2;
	public int id1;
	public int id3;
	/**
	 *˽�й��췽������ֹ��ʵ����
	 *��ʱע�͵�
	 */
	private Singleton() {
	} 
	
	//�̲߳���ȫ
	public static Singleton getInstance1(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	
	//�̰߳�ȫ���������������½���ÿ��getInstance2()��Ҫ��������ʵ��ֻ�е�һ����Ҫ��֮��Ͳ���Ҫ�ˡ�
	public static synchronized Singleton getInstance2(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	/**
	 *  ���ã�
	 *  a>A��B�߳�ͬʱ�����˵�һ��if�ж�
	 *
	 *	b>A���Ƚ���synchronized�飬����instanceΪnull��������ִ��instance = new Singleton();
	 *
	 *	c>����JVM�ڲ����Ż����ƣ�JVM�Ȼ�����һЩ�����Singletonʵ���Ŀհ��ڴ棬����ֵ��instance��Ա��ע���ʱJVMû�п�ʼ��ʼ�����ʵ������Ȼ��A�뿪��synchronized�顣
	 *
	 *	d>B����synchronized�飬����instance��ʱ����null������������뿪��synchronized�鲢��������ظ����ø÷����ĳ���
	 *
	 *	e>��ʱB�̴߳���ʹ��Singletonʵ����ȴ������û�б���ʼ�������Ǵ������ˡ�
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
	 * ����ģʽʹ���ڲ�����ά��������ʵ�֣�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ�������ļ��ع������̻߳���ġ����������ǵ�һ�ε���getInstance��ʱ��
	 * JVM�ܹ������Ǳ�֤instanceֻ������һ�Σ����һᱣ֤�Ѹ�ֵ��instance���ڴ��ʼ�����
	 *
	 */
	public static class SingletonFactory{
		private static Singleton singleton = new Singleton();
	}
	
	public static Singleton	getInstance4(){
		return SingletonFactory.singleton;
	}
	
	/**
	 * �������Ҳ����
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
