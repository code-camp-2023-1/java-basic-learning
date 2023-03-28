package com.jirengu.java.basic.operator;

public class BitShiftOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        String binaryA = Integer.toBinaryString(a);
        System.out.println("Binary A: " + binaryA);

        int b = a << 1; // Expected: b是20
        int c = a << 2; // Expected: c是40


        System.out.println("a: " + a); // 00000000000000000000000000001010
        System.out.println("左移1位 b: " + b); // 00000000000000000000000000010100
        System.out.println("Binary B: " + Integer.toBinaryString(b));
        System.out.println("左移2位 c: " + c); // // 0000000000000000000000000101000
        System.out.println("Binary C: " + Integer.toBinaryString(c));

        int d = a >> 1; // Expected: d是5
        int e = a >> 2; // Expected: e是2

        System.out.println("a: " + a); // 00000000000000000000000000001010
        System.out.println("右移1位 d: " + d); // 00000000000000000000000000000101
        System.out.println("Binary D: " + Integer.toBinaryString(d));
        System.out.println("右移2位 e: " + e); // 00000000000000000000000000000010
        System.out.println("Binary E: " + Integer.toBinaryString(e));

        int number = -100;

        int number2 = number << 1;
        int number3 = number >> 1;
        int number4 = number >>> 1;
        System.out.println(number); // 11111111111111111111111110011100
        System.out.println("Binary number: " + Integer.toBinaryString(number));
        System.out.println(number2); // 11111111111111111111111100111000
        System.out.println("Binary number2: " + Integer.toBinaryString(number2));
        System.out.println(number3); // 11111111111111111111111111001110
        System.out.println("Binary number3: " + Integer.toBinaryString(number3));

        System.out.println(number4); // 2147483598 01111111111111111111111111001110
        System.out.println("Binary number4: " + Integer.toBinaryString(number4));

        // -100: 11111111111111111111111110011100
        // -50 : 11111111111111111111111111001110
        //       X1111111111111111111111111001110
        //       01111111111111111111111111001110 -> 2147483598




    }
}
