package com.xiaoqi.designpattern.observer;

/**
 * ���۲���
 * @author xiaoqi
 *
 */
public interface ITarget {
	public void registerObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void notifyDataChanged();
}
