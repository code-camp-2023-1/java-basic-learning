package com.jirengu.java.oop.cardemo;

import com.jirengu.java.oop.inheritance.Car;

public class SportCar extends Car {

    public static void main(String[] args) {
        SportCar car = new SportCar();
        car.start("XIAOMING");
        System.out.println(car.fuelCapacity);
    }
}
