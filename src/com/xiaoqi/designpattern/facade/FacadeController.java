package com.xiaoqi.designpattern.facade;

public class FacadeController {
	Channel channel;
	Power power;
	Volume volume;
	public FacadeController() {
		channel = new Channel();
		power = new Power();
		volume = new Volume();
	}
	
	public void setChannel(){
		channel.setChannel();
	}
	
	public void setPower(){
		power.setPower();
	}
	
	public void setVolume(){
		volume.setVolume();
	}
}
