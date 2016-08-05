package com.xiaoqi.designpattern.protototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式
 * 关键是实现super.clone()方法，调用Object的clone方法
 */
public class Prototype implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//浅克隆
	protected Object clone() throws CloneNotSupportedException {
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}
	
	//深克隆
	protected Object deepClone() throws IOException,ClassNotFoundException {
        //将对象序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
