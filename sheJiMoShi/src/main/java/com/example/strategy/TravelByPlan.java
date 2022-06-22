package com.example.strategy;

public class TravelByPlan implements TravelStrategy{


    public static final TravelByPlan T_B_P = new TravelByPlan();

    private TravelByPlan() {
    }

    @Override
    public void travel(Person person) {
        System.out.println(person.getName()+"飞机旅行。。。。。。。。。。");
    }
}
