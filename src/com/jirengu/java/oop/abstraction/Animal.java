package com.jirengu.java.oop.abstraction;

public abstract class Animal {
    //abstract方法不能用final，static，private
    public abstract void makeSound();

    abstract void move();

    private static void walk() {
        System.out.println("Animal is walking");
    }

    public String getAnimalName() {
       return getClass().getName();
    }

    public static void main(String[] args) {
        walk();
    }

}
