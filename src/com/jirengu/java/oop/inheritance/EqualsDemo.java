package com.jirengu.java.oop.inheritance;

public class EqualsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("XX", "red", 2010, "sport", 150, 200);
        Car car2 = new Car("XX", "red", 2010, "sport", 150, 200);
        Vehicle vehicle = new Vehicle();

        System.out.println(car1.equals(vehicle));
    }
}
