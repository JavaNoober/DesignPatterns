package com.xiaoqi.designpattern.builder;

public class CustomDialog {
	//基本属性
	private String title;
	private String btnName;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBtnName() {
		return btnName;
	}
	public void setBtnName(String btnName) {
		this.btnName = btnName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	private CustomDialog(Builder builder){
		this.title = builder.title;
		this.btnName = builder.btnName;
		this.content = builder.content;
	}
	
	//创建一个内部静态类用于设置属性，并且有一个返回Dialog的方法
	public static class Builder{
		private String title;
		private String btnName;
		private String content;
		
		public Builder setContent(String content){
			this.content = content;
			return this;
		}
		
		public Builder setTitle(String title){
			this.title = title;
			return this;
		}
		
		public Builder setBtnName(String btnName){
			this.btnName = btnName;
			return this;
		}
		
		//返回Dialog对象
		public CustomDialog build(){
			return new CustomDialog(this);
		}
	}
}
