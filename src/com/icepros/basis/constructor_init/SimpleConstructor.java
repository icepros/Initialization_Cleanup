package com.icepros.basis.constructor_init;

/**
 * �ù�����ȷ����ʼ��(��ʼ���ʹ�������һ�����߲��ܷ���)
 * @author icepros
 * 
 * �ڴ�������ʱ new Rock();
 * ����Ϊ�������洢�ռ䣬��������Ӧ�Ĺ�������ȷ���ڲ�������֮ǰ�����Ѿ�����ʼ����
 */
public class SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			//new Rock();
			new Rock2(i);
		}
	}
}
