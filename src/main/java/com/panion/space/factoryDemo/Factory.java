package com.panion.space.factoryDemo;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月25日下午2:41:58
*/
public class Factory {

	public static void main(String[] args) {
		ZooFactory zf = new ZooFactory();
		//通过工厂创建一个cat对象
		Zoo cat = zf.getzoo("cat");
		Zoo dog = zf.getzoo("dog");
		cat.name();
		dog.name();
	}
}
