package com.panion.space.clms;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年7月24日下午1:47:38
*策略模式：定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换
*统一接口的一系列算法类（多种策略），用一个类将其封装起来，使它们（多种策略）可动态切换。
*和工厂模式的区别：工厂模式是创建模型，是为了传创建不同对象；二策略模式是行为模式，为了选择不同的行为
*
*
*/
public class Strategy {
	
	public static void main(String[] args) {
		OperationStrategy operationStrategy = new OperationStrategy(new OperationAdd());
		operationStrategy.excuteStrategy(15, 21);
	}
}

interface Operation{
	public void doOperation(int a, int b);
}

//策略1
class OperationAdd implements Operation{

	public void doOperation(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
}

//策略2
class OperationMultiply implements Operation{

	public void doOperation(int a, int b) {
		System.out.println(a+"*"+b+"="+(a*b));
	}
	
}

//封装一系列策略，可任意替换策略（实现同一个接口）
class OperationStrategy{
	private Operation operation;
	public OperationStrategy(Operation operation) {
		this.operation=operation;
	}
	//执行策略
	public void excuteStrategy(int a ,int b) {
		operation.doOperation(a, b);
	}
}