package com.example.facade;

public class Main {
	public static void main(String[] args) {

		GiftFacadeService giftFacadeService = new GiftFacadeService();
		giftFacadeService.exchange(new GiftInfo("3090ti"));

	}
}
