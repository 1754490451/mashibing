package com.example.factory.factoryMethod;

public class Main {
    public static void main(String[] args) {
        // 创建对应的工厂类
        TableLampFactory tableLampFactory = TableLampFactory.INSTANCE;
        HangingLampFactory hangingLampFactory = HangingLampFactory.INSTANCE;

        // 通过对应的工厂类创建产品类
        Light tableLamp = tableLampFactory.create();
        Light hangingLamp = hangingLampFactory.create();
    }
}
