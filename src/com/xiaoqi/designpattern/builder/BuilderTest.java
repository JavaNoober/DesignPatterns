package com.xiaoqi.designpattern.builder;
/**
 * ������ģʽ
 * �빤��ģʽ��ͬ���ǣ�����һ��Designer�����ڹ���ConcreteBuilder������˵�ǽ�����ģʽǿ�Ʒ��롣
 * һ��Builder���ǶԸ�������Ľ��죬��Designer���ǶԽ�����̵ľ������������ģʽ�Է�װ�Ը��ã��޸ĵ�ʱ������ֻ��Ҫ�½�Builder���������޸�֮ǰ���룬��֤���ȶ���.
 * ͬʱ�����кܶ�������Ҫ���õ�ʱ����builderģʽ�ͺ������
 */
public class BuilderTest {
	public static void main(String[] args) {
		//��ʽһ��
		IBuilder builder = new ConcreteBuilder();
		Designer designer = new Designer();
		designer.design(builder);
		builder.getHome();
		//��ʽ����
		IBuilder2 builder2 = new ConcreteBuilder2();
		Designer designer2 = new Designer();
		designer2.design2(builder2);
		builder2.getHome();
		//��ʽ����
		CustomDialog dialog =new CustomDialog.Builder()
							.setBtnName("name")
							.setTitle("title")
							.setContent("content")
							.build();
	}
}
