package com.panion.space.factoryDemo;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月25日下午2:44:34
*/
public class ZooFactory {
	//动物工厂
	public Zoo getzoo(String name) {
		if(name.equalsIgnoreCase("cat")) {
			return new Cat();
		}else if(name.equalsIgnoreCase("dog")) {
			return new Dog();
		}else {
			return null;
		}
	}

}
