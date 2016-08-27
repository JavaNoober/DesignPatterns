package com.xiaoqi.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者的具体实现
 * @author xiaoqi
 *
 */
public class ConcreteTarget implements ITarget {
	private String newInfo;
	private List<IObserver> listObserver = new ArrayList<IObserver>();
	
	//添加观察者
	public void registerObserver(IObserver observer) {
		listObserver.add(observer);
	}

	//移除观察者
	public void removeObserver(IObserver observer) {
		if(listObserver.size()>0){
			listObserver.remove(observer);
		}
	}

	//更新数据
	public void notifyDataChanged() {
		for(IObserver ob : listObserver){
			ob.update(newInfo);
		}
	}

	public String getNewInfo() {
		return newInfo;
	}

	//数据改变的同时动态改变其他被观察者状态
	public void setNewInfo(String newInfo) {
		this.newInfo = newInfo;
		notifyDataChanged();
	}

	public List<IObserver> getListObserver() {
		return listObserver;
	}

	public void setListObserver(List<IObserver> listObserver) {
		this.listObserver = listObserver;
	}
	
}
