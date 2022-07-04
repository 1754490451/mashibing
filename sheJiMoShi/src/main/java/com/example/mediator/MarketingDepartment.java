package com.example.mediator;

/**
 * 营销部
 */
public class MarketingDepartment extends Department{
	public MarketingDepartment() {
	}

	public MarketingDepartment(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void doSomeThing() {
		System.out.println("===营销部：处理营销方面的事情===");
		// 通知调停者，自己的事情已经完成
		mediator.exchange(this);
	}
}
