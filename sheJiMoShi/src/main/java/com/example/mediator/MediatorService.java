package com.example.mediator;

/**
 * 调停者实现
 */
public class MediatorService implements Mediator{
	/**
	 * 人事部
	 */
	private final Personel personel = new Personel(this);

	/**
	 * 财务部
	 */
	private final FinanceDepartment financeDepartment = new FinanceDepartment(this);

	/**
	 * 技术部
	 */
	private final TechnologyDepartment technologyDepartment = new TechnologyDepartment(this);

	/**
	 * 营商部
	 */
	private final MarketingDepartment marketingDepartment = new MarketingDepartment(this);

	@Override
	public void exchange(Department department) {
		// 人事部门处理完成
		if (department instanceof Personel){
			System.out.println("人事部处理完成。。。。。。");
			// 交给财务部
			this.financeDepartment.doSomeThing();
		// 财务部处理完成
		}else if (department instanceof FinanceDepartment){
			System.out.println("财务部处理完成。。。。。。");
			// 交给技术部和营商部一起处理
			this.technologyDepartment.doSomeThing();
			this.marketingDepartment.doSomeThing();
		}
	}
}
