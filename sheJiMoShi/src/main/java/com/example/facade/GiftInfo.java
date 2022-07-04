package com.example.facade;

import lombok.Data;

/**
 * 礼品实体类
 */
@Data
public class GiftInfo {

	private String name;

	public GiftInfo() {
	}

	public GiftInfo(String name) {
		this.name = name;
	}
}
