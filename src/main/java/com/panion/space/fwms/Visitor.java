package com.panion.space.fwms;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年7月24日下午4:36:02
*访问者模式：主要将数据结构与数据操作分离
*总结：在被访问的类里面加一个对外提供接待访问者的接口（如下面例子的accept（）方法）。访问者封装了对被访问者结构的一些
*些杂乱操作，避免这些操作“污染”被访问者，解耦结构与算法，同时具有优秀的扩展性。
*/
public class Visitor {

	public static void main(String[] args) {
		Computer computer = new Computer("myComputer");
		//computer接收computerVisitor的访问
		computer.accept(new ComputerVisitor());
	}
}
//被访问者
class Computer{
	private String computerName;
	public String getComputerName() {
		return computerName;
	}
	public Computer(String computerName) {
		this.computerName= computerName;
	}
	//提供接待访问者的接口
	public void accept(ComputerVisitor computerVisitor) {
		//访问者访问自身
		computerVisitor.visit(this);
	}
}

//访问者
class ComputerVisitor{
	//访问computer类，将被访问者的引用传入访问者
	public void visit(Computer computer) {
		System.out.println("访问"+computer+"的name属性："+computer.getComputerName());
	}
}
