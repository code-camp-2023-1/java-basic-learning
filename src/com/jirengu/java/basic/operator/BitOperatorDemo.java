package com.jirengu.java.basic.operator;

public class BitOperatorDemo {
    public static void main(String[] args) {
        int a = 10; // 二进制表示: 00000000000000000000000000001010
        String binaryA = Integer.toBinaryString(a);
        int b = 99; // 二进制表示: 00000000000000000000000001100011
        String binaryB = Integer.toBinaryString(b);
        System.out.println("Binary Representation for a: " + binaryA);
        System.out.println("Binary Representation for b: " + binaryB);

        System.out.println("====== bit ======");
        // 按位与
        int result1 = a & b; // 00000000000000000000000000000010
        System.out.println("按位与 a & b: " + result1);
        System.out.println("Binary representation for a & b: "
            + Integer.toBinaryString(result1));
        // 按位或
        int result2 = a | b; // 00000000000000000000000001101011
        System.out.println("按位或 a | b: " + result2);
        System.out.println("Binary representation for a & b: "
                + Integer.toBinaryString(result2));
        // 按位异或
        int result3 = a ^ b; // 00000000000000000000000001101001
        System.out.println("按位异或 a ^ b: " + result3);
        System.out.println("Binary representation for a ^ b: "
                + Integer.toBinaryString(result3));
        // 按位取反
        int result4 = ~a; // 11111111111111111111111111110101
        System.out.println("按位取反 a: " + result4);
        System.out.println("Binary representation for ~a: "
                + Integer.toBinaryString(result4));
        int result5 = ~b; // 11111111111111111111111110011100
        System.out.println("按位取反 b: " + result5);
        System.out.println("Binary representation for ~b: "
                + Integer.toBinaryString(result5));

    }
}
