package com.example.facade;

/**
 * 支付系统
 */
public class PaymentService{
	public Boolean pay(GiftInfo pointsGift){
		//扣减积分
		System.out.println("支付"+pointsGift.getName()+"积分成功");
		return true;
	}
}

