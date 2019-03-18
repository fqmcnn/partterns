package com.panion.space.wgms;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年6月4日下午2:06:08
*/
public class Facade {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.put();
	}
}

class CPU{
	public void work() {
		//复杂操作
		System.out.println("put in disk!");
	}
}
class Disk {
	public void put () {
		System.out.println("put in disk!");
	}
}
//外观类，隐藏了系统的复杂性，提供简化的方法（访问系统的接口）
//客户端不需要知道系统内部的复杂联系
class Computer {
	private CPU cpu;
	private Disk disk;
	public Computer () {
		cpu = new CPU();
		disk = new Disk();
	}
	public void work() {
		cpu.work();
	}
	public void  put () {
		disk.put();
	}
}
