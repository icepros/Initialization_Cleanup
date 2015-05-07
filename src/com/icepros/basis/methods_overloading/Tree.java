package com.icepros.basis.methods_overloading;

/**
 * 重载构造器和重载方法
 * @author icepros
 *
 */
public class Tree {
	int height;
	Tree() {
		System.out.println("播种");
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
