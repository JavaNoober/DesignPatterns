package com.xiaoqi.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ���۲��ߵľ���ʵ��
 * @author xiaoqi
 *
 */
public class ConcreteTarget implements ITarget {
	private String newInfo;
	private List<IObserver> listObserver = new ArrayList<IObserver>();
	
	//��ӹ۲���
	public void registerObserver(IObserver observer) {
		listObserver.add(observer);
	}

	//�Ƴ��۲���
	public void removeObserver(IObserver observer) {
		if(listObserver.size()>0){
			listObserver.remove(observer);
		}
	}

	//��������
	public void notifyDataChanged() {
		for(IObserver ob : listObserver){
			ob.update(newInfo);
		}
	}

	public String getNewInfo() {
		return newInfo;
	}

	//���ݸı��ͬʱ��̬�ı��������۲���״̬
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
