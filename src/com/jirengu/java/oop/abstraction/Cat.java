package com.jirengu.java.oop.abstraction;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miaomiao!!");
    }

    @Override
    void move() {
        System.out.println(getAnimalName() + " walking......");
    }

    @Override
    public String getAnimalName() {
        return "Pretty Cat";
    }
}
