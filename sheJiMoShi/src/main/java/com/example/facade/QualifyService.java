package com.example.facade;

/**
 * 积分系统
 */
public class QualifyService{
	public Boolean isAvailable(GiftInfo giftInfo){
		System.out.println("校验"+giftInfo.getName()+"积分资格通过，库存通过");
		return true;
	}
}

