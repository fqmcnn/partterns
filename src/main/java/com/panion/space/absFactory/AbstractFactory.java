package com.panion.space.absFactory;

import factoryDemo.Zoo;

/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月25日下午3:13:59
*/
public abstract class AbstractFactory {
//抽象工厂
	abstract public Zoo getzoo(String name);
	abstract public Object getobject();
}
