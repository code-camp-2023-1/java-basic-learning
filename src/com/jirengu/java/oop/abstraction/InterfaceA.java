package com.jirengu.java.oop.abstraction;

public interface InterfaceA {

    void functionA();
    default void doSomething() {
        System.out.println("Do something by A");
    }
}
