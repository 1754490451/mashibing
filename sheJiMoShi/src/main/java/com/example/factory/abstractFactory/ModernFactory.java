package com.example.factory.abstractFactory;

public class ModernFactory extends AbstractFactory{

    public static final ModernFactory INSTANCE = new ModernFactory();

    private ModernFactory(){};

    @Override
    Food createFood() {
        return new Cake();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
