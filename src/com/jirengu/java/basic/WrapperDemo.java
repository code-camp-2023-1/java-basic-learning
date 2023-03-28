package com.jirengu.java.basic;

public class WrapperDemo {
    public static void main(String[] args) {
        // 包装类用途：就是把基本类型包装成一个对象
        // byte -> Byte
        byte byteNumber = 0;
        Byte byteWrapperNumber = byteNumber;
        // short -> Short
        short shortNumber = 1;
        Short shortWrapperNumber = shortNumber;
        // int -> Integer (特殊)
        Integer integer = 1;
        // long -> Long
        Long longNumber = 10L;

        // float -> Float
        Float floatNumber = 0.15f;

        // double -> Double
        Double aDouble = 1.5;

        // char -> Character(特殊)
        Character character = 'c';

        // boolean -> Boolean
        Boolean b = true;

    }
}
