package com.xiaoqi.designpattern.observer;

/**
 * ±ªπ€≤Ï’ﬂ
 * @author xiaoqi
 *
 */
public interface ITarget {
	public void registerObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void notifyDataChanged();
}
