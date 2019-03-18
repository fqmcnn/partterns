package com.panion.space.singleton;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月25日下午3:28:07
*/
public class Singleton {

	public static void main(String[] args) {
		Earth e = Earth.getEarth();
		System.out.println(e.getAge());
	}
}
//创建单例对象的方式有多种，下面是比较常用的一种方式;按需求选择合适方式
class Earth{//只允许创建一个对象的类
	//创建唯一对象
	private static Earth e = new Earth();
	//构造函数访问权限必须private
	private Earth() {}

	//获取唯一对象
	public static Earth getEarth() {
		return e;
	}
	private int age = 1000;
	public int getAge() {
		return age;
	}
	
}