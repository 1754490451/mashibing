package com.example.strategy;

public class TravelByCar implements TravelStrategy{


    public static final TravelByCar T_B_C = new TravelByCar();

    private TravelByCar() {
    }

    @Override
    public void travel(Person person) {
        System.out.println(person.getName()+"汽车旅行。。。。。。。。。。");
    }
}
