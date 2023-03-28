package com.jirengu.java.oop;

public class ConstantDemo {
    static final int NUM = 100;
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num: " + num);
        num = 1000;
        System.out.println("num: " + num);
        final int num2 = 100;
        System.out.println("num2: " + num2);
        System.out.println("NUM: " + NUM);

        final double pi = 3.1415;
        final boolean isUpdated = true;

    }
}
