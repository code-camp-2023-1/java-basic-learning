package com.jirengu.java.basic.operator;

public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int addResult = a + b;
        int subtractResult = a - b;
        int multiResult = a * b;
        int divisionResult = a / b;
        int divisionResult2 = b / a;
        int remainderResult = a % b;
        int result = 100 % 5;

        System.out.println("a + b: " + addResult);
        System.out.println("a - b: " + subtractResult);
        System.out.println("a * b: " + multiResult);
        System.out.println("a / b: " + divisionResult);
        System.out.println("b / a: " + divisionResult2);
        System.out.println("a % b: " + remainderResult);
        System.out.println(result);


    }
}
