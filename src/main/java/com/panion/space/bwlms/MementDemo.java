package com.panion.space.bwlms;

import java.util.ArrayList;
import java.util.List;

/**
*@author  作者：Star Flower(启明)
*@version 创建时间：2018年7月24日下午4:00:48
*备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
*总结：创建一个备忘录类，用来存储原始类的信息；同时创建备忘录仓库类，
*用来存储备忘录类，当然，原始类与备忘录类的对应关系要处理好
*/
public class MementDemo {

	public static void main(String[] args) {
		//待备份的类
		Originator originator = new Originator();
		originator.setState("123");
		System.out.println("初始化的状态为 ： "+ originator.getState());
		MementoStorage mementoStorage = new MementoStorage();
		mementoStorage.add(originator.createMemento());
		originator.setState("321");
		System.out.println("修改后的状态："+originator.getState());
		originator.restoreMemento(mementoStorage.get(0));
		System.out.println("还原后的状态为："+originator.getState());
	}
}

//备忘录类
class Memento{
	private String state;
	public Memento(String state) {
		this.state = state;
	}
	public String getState() {
		return this.state;
	}
}

//备忘录类仓库，备忘录管理类
class MementoStorage{
	private List<Memento> mementoList = new ArrayList<Memento>();
	public void add(Memento state) {
		mementoList.add(state);
	}
	public Memento get(int index) {
		return mementoList.get(index);
	}
}

//原始类
class Originator{
	private String state;
	public void setState(String state) {
		this.state= state;
	}
	public String getState() {
		return this.state;
	}
	//创建备份
	public Memento createMemento() {
		//把需要备份的信息全部存储到备份类中
		return new Memento(state);
	}
	
	//还原备份
	public void restoreMemento(Memento memento) {
		//把备份类中存储的信息还原
		state = memento.getState();
	}
}
