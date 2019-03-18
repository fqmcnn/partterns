package com.panion.space.qjms;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年6月4日下午2:16:05
*将抽象部分与现实部分分离，使它们都可以独立的变化
*/
public class Bridge {

	public static void main(String[] args) {
		AnimalsBridge bridge = new AnimalsBridge(new Dog());
		bridge.method();
	}
}
interface Animals{
	public void method();
}

//实现1
class Cat implements Animals{

	public void method() {
		System.out.println("this is cat");
	}
	
}

class Dog implements Animals{

	public void method() {
		System.out.println("this is dog!");
	}
	
}

//将Animals接口下的不同实现
//通过桥接模式是它们在抽象层建立一个关联关系
//实现至今独立变化，减少耦合
class AnimalsBridge{

	private Animals animals;
	public AnimalsBridge (Animals animals) {
		this.animals=animals;
	}
	public void method() {
		animals.method();
	}
}
