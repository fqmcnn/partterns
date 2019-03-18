package com.panion.space.absFactory;

import factoryDemo.Zoo;

/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月25日下午3:08:20
*/
public class Abstract_Factory {

	//工厂生成器：生产具体的工厂
	public static AbstractFactory getFactory(String factoryName) {
		if(factoryName.equalsIgnoreCase("zoo")) {
			return new ZooFactory();
		}else if(factoryName.equalsIgnoreCase("others")) {
			return new OtherFactory();
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		AbstractFactory asf = getFactory("zoo");
		Zoo cat = asf.getzoo("cat");
		cat.name();
		System.out.println("你猜你是不是傻");
	}
	
}
