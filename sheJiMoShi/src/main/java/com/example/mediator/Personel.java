package com.example.mediator;

/**
 * 人事部
 */
public class Personel extends Department{

	public Personel() {
	}

	public Personel(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void doSomeThing() {
		System.out.println("===人事部：处理人事相关的事情===");
		// 通知调停者，自己的事情已经处理完毕
		mediator.exchange(this);
	}
}
