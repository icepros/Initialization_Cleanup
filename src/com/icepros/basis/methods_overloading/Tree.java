package com.icepros.basis.methods_overloading;

/**
 * ���ع����������ط���
 * @author icepros
 *
 */
public class Tree {
	int height;
	Tree() {
		System.out.println("����");
		height = 0;
	}
	Tree(int initHeight){
		height = initHeight;
		System.out.println("Creating new Tree that is " + height + "feet tall");
	}
	void info(){
		System.out.println("Tree is " + height + "feet tall");
	}
	void info(String s){
		System.out.println(s + ": Tree is " + height + "feet tall");
	}
}
