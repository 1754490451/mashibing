package com.example.factory.abstractFactory;


/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    abstract Food createFood();

    abstract Weapon createWeapon();
}
