package com.jirengu.java.basic.statement;

public class WhileLoopingStatementDemo {
    public static void main(String[] args) {
        // while循环 要考虑到循环退出条件！！！！

        //死循环
        /**
        while (true) {
            System.out.println("Hello World");
        }
         **/

        // 没有while (false)
        /**
        while (false) {
            System.out.println("Hello World!!");
        }
         **/

        int times = 1;
        // System.out.println("Starting time" + LocalTime.now());
        while (times <= 10) {
            System.out.println(times + " Hello World!! ");
            times++; //
        }
        System.out.println("times after while-loop: " + times);
        // System.out.println("End time" + LocalTime.now());

        // System.out.println("JAVA");

        // do-while

        do {
            System.out.println("Do-While JAVA " + times);
            times++;
            System.out.println("After ++: " + times);
        } while (times < 20);
        System.out.println("time after do-while loop: " + times);
    }
}
