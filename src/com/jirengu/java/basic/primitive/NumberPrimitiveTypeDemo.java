package com.jirengu.java.basic.primitive;

public class NumberPrimitiveTypeDemo {
    public static void main(String[] args) {
        //整数型 byte short int long

        // byte
        byte byteNumber = 1;
        byte byteNumber2 = 100;
        System.out.println("======= byte =======");
        System.out.println(byteNumber);
        System.out.println(byteNumber2);

        // short
        short shortNum1 = 32767;
        short shortNum2 = -32768;
        short shortNum3 = 100;
        System.out.println("======= short =======");
        System.out.println(shortNum1);
        System.out.println(shortNum2);
        System.out.println(shortNum3);

        // int
        int intNum1 = 1000;
        int intNum2 = -10000000;
        System.out.println("======= int =======");
        System.out.println(intNum1);
        System.out.println(intNum2);

        // long
        long longNum1 = 10000000000000000L;
        long longNum2 = 19000000000000000L;
        System.out.println("======= long =======");
        System.out.println(longNum1);
        System.out.println(longNum2);

        // float
        float floatNum1 = 3.14F;
        float floatNum2 = 1.5544555f;
        float floatNum3 = 1.55445555555555555f;
        float floatNum4 = 0.1F;

        float floatNum5 = 1000000000;
        float floatNum6 = floatNum5 + 1;

        System.out.println("======= float =======");
        System.out.println(floatNum1);
        System.out.println(floatNum2);
        System.out.println(floatNum3);
        System.out.println(floatNum1 == floatNum3);
        System.out.println(floatNum2 == floatNum3);
        System.out.println(floatNum5 == floatNum6);

        // double
        double doubleNumber1 = 1.356;
        double doubleNumber2 = 0.1;

        System.out.println("======= double =======");
        System.out.println(doubleNumber1);
        System.out.println(doubleNumber2);
        System.out.println(floatNum4 == doubleNumber2);


    }
}
