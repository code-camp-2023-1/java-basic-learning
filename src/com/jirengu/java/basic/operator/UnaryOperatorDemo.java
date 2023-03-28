package com.jirengu.java.basic.operator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        // +,-
        int count = 100;
        int num = +count;
        int num2 = -count;
        int num3 = -num2;
        int num4 = +num2;

        System.out.println(count);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        double pi = 3.1415;
        System.out.println(pi);

        // ++,--
        int a = 10;
        System.out.println("=============================");
        System.out.println("a: " + a);
        a++;// a = a + 1;
        System.out.println("a after a++ : " + a);
        a--; // a = a - 1;
        System.out.println("a after a-- : " + a);

        int b = 10;
        System.out.println("b: " + b);
        ++b;// b = b + 1;
        System.out.println("b after b++ : " + b);
        --b; // b = b - 1;
        System.out.println("b after b-- : " + b);

        System.out.println("=============== i++/++i ==============");
        int i = 10;
        int i1 = i++;
        System.out.println("i1: " + i1 + " i: " + i);
        int i2 = i--;
        System.out.println("i2: " + i2 + " i: " + i);
        int i3 = ++i;
        System.out.println("i3: " + i3 + " i: " + i);
        int i4 = --i;
        System.out.println("i4: " + i4 + " i: " + i);

        // !：取反
        boolean isClosed = true;
        boolean value = !isClosed;
        System.out.println(value); // Expected: false

        boolean value2 = !value;
        System.out.println(value2); // Expected: true
    }
}
