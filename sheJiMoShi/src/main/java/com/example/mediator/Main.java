package com.example.mediator;

public class Main {
	public static void main(String[] args) {
		// 创建调停者对象
		Mediator mediatorService = new MediatorService();

		// 创建各个部门
		Department personnel = new Personel(mediatorService);
		Department financeDepartment = new FinanceDepartment(mediatorService);
		Department technologyDepartment = new TechnologyDepartment(mediatorService);
		Department marketingDepartment = new MarketingDepartment(mediatorService);

		// 由人事部发起
		financeDepartment.doSomeThing();

	}
}
