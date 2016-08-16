package com.xiaoqi.designpattern.facade;

public class FacadeTest {
	
	public static void main(String[] args) {
		//û�����ģʽ
		Power power = new Power();
		Channel ch = new Channel();
		Volume volume = new Volume();
		power.setPower();
		ch.setChannel();
		volume.setVolume();
		
		//�������ģʽ
		FacadeController controller = new FacadeController();
		controller.setPower();
		controller.setChannel();
		controller.setVolume();
	}
}
