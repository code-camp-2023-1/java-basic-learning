package com.jirengu.java.basic.operator;

public class RelationalOperatorDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        // ==, !=
        System.out.println("== : " + (value1 == value2)); // Expected: false
        System.out.println("!= : " + (value1 != value2)); // Expected: true
        // >, >=, <, <=
        System.out.println("> : " + (value1 > value2)); // Expected: false
        System.out.println(">= : " + (value1 >= value2)); // Expected: false
        System.out.println("< : " + (value1 < value2)); // Expected: true
        System.out.println("<= : " + (value1 <= value2)); // Expected:

        boolean boolValue1 = true;
        boolean boolValue2 = true;
        String str = "Hello";
        String str2 = "World";
        System.out.println(str != str2);


    }
}
