package com.jirengu.java.oop.abstraction;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Flyable.prepare();
        airplane.fly();
        airplane.showStatus();

    }
}
