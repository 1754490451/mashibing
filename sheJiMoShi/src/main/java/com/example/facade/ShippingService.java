package com.example.facade;

/**
 * 物流系统
 */
public class ShippingService {

	public String delivery(GiftInfo giftInfo){
		//发货
		System.out.println(giftInfo.getName()+"进入物流系统");
		return "666";
	}

}
