package com.panion.space.dl;
/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年6月4日下午1:49:02
*/
//代理者模式：为其他对象提供一种代理以控制对这个对象的访问
public class Proxy {

	public static void main(String[] args) {
		Animals dog = new DogProxy(new Dog());
		dog.run();
	}
}
interface Animals{
	public void run();
}
class Dog implements Animals{

	public void run() {
		System.out.println("run!");
	}
	
}
class DogProxy implements Animals{

	private Animals animals;
	public DogProxy (Animals animals) {
		super();
		this.animals = animals;
	}
	public void run() {
		before();
		animals.run();
		after();
	}
	private void after() {
		System.out.println("after run!");
	}
	private void before() {
		System.out.println("before run!");
	}
	
}