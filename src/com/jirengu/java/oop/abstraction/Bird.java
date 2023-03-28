package com.jirengu.java.oop.abstraction;

public abstract class Bird implements Flyable {
    private String name;
    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Bird is eating food");
    }

    public void doFly() {
        System.out.println("Bird is flying");
        fly();
    }

    @Override
    public void showStatus() {
        System.out.println("I am bird, can't fly higher~");
    }

    @Override
    public String toString() {
        return "Bird{}";
    }
}
