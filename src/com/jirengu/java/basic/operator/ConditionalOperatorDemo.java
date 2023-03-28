package com.jirengu.java.basic.operator;

public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        // And, Or
        int a = 1;
        int b = 2;

        boolean b3 = (a > b) && (a != b);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println("And &&: " + (b1 && b2));
        System.out.println("And ||: " + (b1 || b2));

        // And与 Or或
        // Case 1: true and true
        System.out.println("===== Testing And/Or result =====");
        boolean op1 = true;
        boolean op2 = true;
        System.out.println("And Case 1 - true and true: " + (op1 && op2)); //Expected: true
        System.out.println("Or Case 1 - true and true: " + (op1 || op2)); //Expected: true
        // Case 2: true and false
        boolean op3 = true;
        boolean op4 = false;
        System.out.println("And Case 2 - true and false: " + (op3 && op4)); //Expected: false
        System.out.println("Or Case 2 - true and false: " + (op3 || op4)); //Expected: true

        // Case 3: false and true
        boolean op5 = false;
        boolean op6 = true;
        System.out.println("And Case 3 - false and true: " + (op5 && op6)); //Expected: false
        System.out.println("Or Case 3 - false and true: " + (op5 || op6)); //Expected: true
        // Case 4: false and false
        boolean op7 = false;
        boolean op8 = false;
        System.out.println("And Case 4 - false and false: " + (op7 && op8)); //Expected: false
        System.out.println("Or Case 4 - false and false: " + (op7 || op8)); //Expected: false

        // 三目运算符 ？： if-then-else语句简化
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean condition = true || false;

        result = condition ? value1 : value2;

        double d1 = 10.5;
        double d2 = 2.8;

        double d3 = d1 > d2 ? d1 : d2;
        System.out.println("=====================");
        System.out.println(d3);

    }
}
