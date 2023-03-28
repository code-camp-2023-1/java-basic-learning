package com.jirengu.java.oop.abstraction;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Wang wang!!!");
    }

    @Override
    void move() {
        System.out.println(getAnimalName() + " fast running");
    }
}
