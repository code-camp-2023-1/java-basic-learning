package com.jirengu.java.oop.abstraction;

public class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Don't know");
    }

    @Override
    void move() {
        System.out.println(getAnimalName() + " Swimming");
    }
}
