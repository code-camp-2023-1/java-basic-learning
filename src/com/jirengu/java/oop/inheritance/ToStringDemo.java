package com.jirengu.java.oop.inheritance;

public class ToStringDemo {
    public static void main(String[] args) {
        Car car = new Car("XX", "red", 2010, "sport", 150, 200);
        System.out.println(car);
        String str = car.getName() + car;
    }
}
