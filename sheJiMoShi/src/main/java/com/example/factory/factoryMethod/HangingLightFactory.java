package com.example.factory.factoryMethod;

/**
 * 单一类型的工厂类(hangingLamp)
 */
public class HangingLightFactory extends LightFactory {

    // 单例化
    public static final HangingLightFactory INSTANCE = new HangingLightFactory();

    private HangingLightFactory(){};

    @Override
    public Light create() {
        System.out.println("hangingLamp is creating");
        return new HangingLamp();
    }
}
