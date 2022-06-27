package com.example.factory.factoryMethod;

// 继承抽象类(台灯)
public class TableLamp extends Light {


    @Override
    public void turnOn() {
        System.out.println("台灯-开启咯。。。。");
    }

    @Override
    public void turnOff() {
        System.out.println("台灯-关闭咯。。。。");
    }
}
