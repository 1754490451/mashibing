package com.example.mediator;

/**
 * 部门抽象类
 * @author wcy
 */
public abstract class Department {

	/**
	 * 	调停者对象
 	 */
	protected Mediator mediator;

	public Department() {
	}

	public Department(Mediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 业务逻辑
	 */
	public abstract void doSomeThing();
}
