package com.example.factory.factoryMethod;


/**
 * 单一类型的工厂类(tableLamp)
 */
public class TableLightFactory extends LightFactory {

    // 将工厂变成单例
    public static final TableLightFactory INSTANCE = new TableLightFactory();

    private TableLightFactory(){}

    // 生产台灯
    @Override
    public Light create() {
        System.out.println("tableLamp is creating");
        return new TableLamp();
    }
}
