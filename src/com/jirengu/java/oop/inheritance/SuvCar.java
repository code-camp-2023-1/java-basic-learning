package com.jirengu.java.oop.inheritance;

public class SuvCar extends Car {

    public void drive() {
        printInformation();
    }

    @Override
    public void start(String name) {
        super.start(name);
    }

    public static void main(String[] args) {
        SuvCar suvCar = new SuvCar();
        suvCar.start("XIAOMING");
    }
}
