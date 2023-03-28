package com.jirengu.java.oop.abstraction;

public interface InterfaceB {

    void functionB();
    default void doSomething() {
        System.out.println("Can't do something");
    }
}
