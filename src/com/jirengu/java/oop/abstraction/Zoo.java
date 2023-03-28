package com.jirengu.java.oop.abstraction;

public class Zoo {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal fish = new Fish();

        dog.makeSound();
        dog.move();

        cat.makeSound();
        cat.move();

        fish.makeSound();
        fish.move();
    }
}
