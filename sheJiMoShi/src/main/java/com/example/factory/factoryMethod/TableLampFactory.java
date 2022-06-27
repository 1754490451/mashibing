package com.example.factory.factoryMethod;


/**
 * 单一类型的工厂类(tableLamp)
 */
public class TableLampFactory extends LampFactory{

    // 将工厂变成单例
    public static final TableLampFactory INSTANCE = new TableLampFactory();

    private TableLampFactory(){}

    // 生产台灯
    @Override
    public Light create() {
        System.out.println("tableLamp is creating");
        return new TableLamp();
    }
}
