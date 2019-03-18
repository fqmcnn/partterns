package com.panion.space.gjz;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年5月25日下午3:37:36
*/

//构建者模式：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同表示
//将一些不会变的基本组件，通过builder，组合，构建复杂对象，实现分离
public class BuilderDemo {

	public static void main(String[] args) {
		PriceBuilder priceBuiler = new PriceBuilder();
		System.out.println("Car1和Car2："+priceBuiler.Car1andCar2());
		System.out.println("Car1和Bus："+priceBuiler.Car1andBus());
	}
}

//基本组件
interface Car{
	
}

//基本组件1
class Car1 implements Car {
	int price = 20;
}

//基本组件2
class Car2 implements Car{
	int price = 90;
}

//基本组件3
class Bus{
	int price = 500;
}

class PriceBuilder{
	//car1和car2的总价格
	public int Car1andCar2() {
		int priceOfCar1 = new Car1().price;
		int priceOfCar2 = new Car2().price;
		return priceOfCar1+priceOfCar2;
	}
	
	//car1和bus的总价格
	public int Car1andBus() {
		int priceOfCar1 = new Car1().price;
		int priceOfBus = new Bus().price;
		return priceOfCar1+priceOfBus;
	}
}
