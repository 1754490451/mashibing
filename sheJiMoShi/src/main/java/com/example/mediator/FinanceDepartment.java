package com.example.mediator;

/**
 * 财务部
 */
public class FinanceDepartment extends Department{

	public FinanceDepartment() {
	}

	public FinanceDepartment(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void doSomeThing() {
		System.out.println("===财务部：处理钱相关的事情===");
		// 通知调停者，自己的事情已经处理完成
		mediator.exchange(this);
	}
}
