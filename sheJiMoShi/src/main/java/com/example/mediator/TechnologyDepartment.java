package com.example.mediator;

/**
 * 生产技术部
 */
public class TechnologyDepartment extends Department{
	public TechnologyDepartment() {
	}

	public TechnologyDepartment(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void doSomeThing() {
		System.out.println("===生产技术部：处理技术相关的事情===");
		mediator.exchange(this);
	}
}
