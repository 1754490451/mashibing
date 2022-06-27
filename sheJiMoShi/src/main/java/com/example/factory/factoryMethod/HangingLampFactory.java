package com.example.factory.factoryMethod;

/**
 * 单一类型的工厂类(hangingLamp)
 */
public class HangingLampFactory extends LampFactory{

    // 单例化
    public static final HangingLampFactory INSTANCE = new HangingLampFactory();

    private HangingLampFactory(){};

    @Override
    public Light create() {
        System.out.println("hangingLamp is creating");
        return new HangingLamp();
    }
}
