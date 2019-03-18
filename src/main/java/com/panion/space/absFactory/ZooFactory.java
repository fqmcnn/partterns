package com.panion.space.absFactory;

import factoryDemo.Cat;
import factoryDemo.Zoo;

/**
*@author  作者：Star Flower
*@version 创建时间：2018年5月25日下午3:10:32
*/
public class ZooFactory extends AbstractFactory{

	//动物工厂
	@Override
	public Zoo getzoo(String name) {
		if(name.equalsIgnoreCase("cat")) {
			return new Cat();
		}else {
			return null;
		}
		
	}

	@Override
	public Object getobject() {
		return null;
	}

	
}
