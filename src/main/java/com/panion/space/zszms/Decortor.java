package com.panion.space.zszms;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月28日上午11:21:08
*/
//动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比子类更为灵活。
//创建类的装饰类，对被装饰类增强功能。装饰模式是继承的一个替代模式。
public class Decortor {

	public static void main(String[] args) {
		Animals dog = new AnimalsDecorator(new Dog());
		dog.run();
	}
}

interface Animals {
	public void run();
}

//被装饰类
class Dog implements Animals{

	public void run() {
		System.out.println("dog run！");
	}
	
}

//装饰类
class AnimalsDecorator implements Animals {
	private Animals animals;

	//动态装饰，参数为Animals接口，传入什么实现就装饰什么实现
	//继承不能做到这一点，继承的功能是静态的，不能动态增删。
	
	public AnimalsDecorator(Animals animals) {
		this.animals = animals;
	}
	
	//装饰run（）方法
	public void run() {
		animals.run();
		System.out.println("fast!");
	}
}
