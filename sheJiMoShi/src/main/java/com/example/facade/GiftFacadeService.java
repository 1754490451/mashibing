package com.example.facade;

/**
 * 门面类
 * @author wcy
 */
public class GiftFacadeService{
	private final QualifyService qualifyService = new QualifyService();
	private final PaymentService paymentService = new PaymentService();
	private final ShippingService shippingService = new ShippingService();


	/**
	 * 积分兑换礼物
	 */
	public void exchange(GiftInfo giftInfo){
		// 先判断积分是否够
		if(qualifyService.isAvailable(giftInfo)){
			// 然后支付积分
			if(paymentService.pay(giftInfo)){
				// 最后发货
				String shippingNo = shippingService.delivery(giftInfo);
				System.out.println("物流系统下单成功，物流单号是：" + shippingNo);
			}
		}
	}
}

