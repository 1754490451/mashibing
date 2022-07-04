package com.example.mediator;

/**
 * 调停者接口
 */
public interface Mediator {
	/**
	 * 表示有部门向你委托了任务请求或者通知
	 * @param department
	 */
	void exchange(Department department);
}
