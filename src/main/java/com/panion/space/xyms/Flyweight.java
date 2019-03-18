package com.panion.space.xyms;

import java.util.HashMap;

/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年6月4日下午2:54:48
享元模式：运用共享技术有效地支持大量细粒度的对象
总结：重要现有的同类对象，若未找到匹配的对象，则创建新对象。例如数据库的连接池。减少对象的创建，降低系统内存，提高效率
*/
public class Flyweight {

	public static void main(String[] args) {
		//red Circle默认存在，所以拿的时候不用new
		Circle circle = CircleFactory.getCircle("red");
		circle.draw();
		for(int i=0;i<2;i++) {
			//第一次拿的时候需要new green circle，第二次拿的时候不用new
			circle = CircleFactory.getCircle("green");
			circle.draw();
		}
	}
}
class Circle{
	private String color;
	public Circle(String color) {
		this.color=color;
	}
	public void draw() {
		System.out.println(color+"Cricle!");
	}
}
class CircleFactory{
	private static final HashMap<String,Circle> circleMap = new HashMap<String , Circle>();
	static {
		//初始化，放在red Circle
		circleMap.put("red", new Circle("red"));
	}
	public static Circle getCircle(String color) {
		Circle circle = circleMap.get(color);
		//map如果不存在改颜色的circle，则新建
		if(circle==null) {
			circle= new Circle(color);
			circleMap.put(color, circle);
			System.out.println("new a circle of color:"+color);
		}
		//如果存在，则返回map中的对象
		return circle;
	}
}