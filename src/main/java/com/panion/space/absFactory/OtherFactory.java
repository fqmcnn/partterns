package com.panion.space.absFactory;

import factoryDemo.Zoo;

/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月25日下午3:11:30
*/
public class OtherFactory extends AbstractFactory{

	@Override
	public Zoo getzoo(String name) {//其他工厂
		return null;
	}

	@Override
	public Object getobject() {
		return null;
	}

}
