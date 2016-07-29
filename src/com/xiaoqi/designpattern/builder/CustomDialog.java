package com.xiaoqi.designpattern.builder;

public class CustomDialog {
	//��������
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
	
	//����һ���ڲ���̬�������������ԣ�������һ������Dialog�ķ���
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
		
		//����Dialog����
		public CustomDialog build(){
			return new CustomDialog(this);
		}
	}
}
