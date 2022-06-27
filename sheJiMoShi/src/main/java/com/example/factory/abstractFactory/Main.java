package com.example.factory.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // 创建工厂
        AbstractFactory modernFactory = ModernFactory.INSTANCE;
        AbstractFactory magicFactory = MagicFactory.INSTANCE;

        // 通过工厂创建产品
        Food modernFood = modernFactory.createFood();
        modernFood.printName();
        Weapon modernWeapon = modernFactory.createWeapon();
        modernWeapon.shoot();

        Food magicFood = magicFactory.createFood();
        magicFood.printName();
        Weapon magicWeapon = magicFactory.createWeapon();
        magicWeapon.shoot();

    }
}
