package com.jirengu.java.oop.abstraction;

public class DefaultMethodDemo implements InterfaceA, InterfaceB {
    @Override
    public void functionA() {

    }

    @Override
    public void doSomething() {
        InterfaceA.super.doSomething();
        InterfaceB.super.doSomething();
        System.out.println("Default method do something");
    }

    @Override
    public void functionB() {

    }

    public static void main(String[] args) {
        DefaultMethodDemo demo = new DefaultMethodDemo();
        demo.doSomething();
    }
}
