package com.example.factory.abstractFactory;

public class MagicFactory extends AbstractFactory{

    public static final MagicFactory INSTANCE = new MagicFactory();

    private MagicFactory (){};

    @Override
    Food createFood() {
        return new Potion();
    }

    @Override
    Weapon createWeapon() {
        return new Wand();
    }
}
