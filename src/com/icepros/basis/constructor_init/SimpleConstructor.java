package com.icepros.basis.constructor_init;

/**
 * 用构造器确保初始化(初始化和创建绑在一起，两者不能分离)
 * @author icepros
 * 
 * 在创建对象时 new Rock();
 * 将会为对象分配存储空间，并调用相应的构造器，确保在操作对象之前，它已经被初始化了
 */
public class SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			//new Rock();
			new Rock2(i);
		}
	}
}
