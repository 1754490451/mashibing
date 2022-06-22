package com.example.strategy;

import java.util.Calendar;

public class Person {

    private String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void travel(TravelStrategy ts){
        ts.travel(this);
    }

    public static void main(String[] args) {
        Person person = new Person("张三");
        person.travel(TravelByPlan.T_B_P);

        Person person1 = new Person("张三");
        person.travel(TravelByCar.T_B_C);

        try {
            Person person2 = Person.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
