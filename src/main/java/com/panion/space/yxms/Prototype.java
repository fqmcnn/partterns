package com.panion.space.yxms;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月25日下午3:55:52
*/
//原型模型：用原型实例指令创建对象的种类，并且通过拷贝这些原型创建新的对象
//将对象复制了一份ing返还给调用者，对象需继承Cloneable并重写clone（）方法
public class Prototype implements Cloneable{
	private String message = "hello";
	public Object clone()throws CloneNotSupportedException{
		Prototype proto = (Prototype) super.clone();
		//操纵克隆对象
		proto.message += "world!";
		return proto;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype p = (Prototype) new Prototype().clone();
		//操作克隆对象
		System.out.println(p.message);
	}
}
