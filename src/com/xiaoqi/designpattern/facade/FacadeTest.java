package com.xiaoqi.designpattern.facade;

public class FacadeTest {
	
	public static void main(String[] args) {
		//没有外观模式
		Power power = new Power();
		Channel ch = new Channel();
		Volume volume = new Volume();
		power.setPower();
		ch.setChannel();
		volume.setVolume();
		
		//有了外观模式
		FacadeController controller = new FacadeController();
		controller.setPower();
		controller.setChannel();
		controller.setVolume();
	}
}
