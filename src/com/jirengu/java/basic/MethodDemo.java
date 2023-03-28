package com.jirengu.java.basic;

public class MethodDemo {
    public static void main(String[] args) {
        String s = "JIRENGU";
        doHomework(s);
        String name = "xiaoming";
        doHomework(name);
        doHomework("girl");

        int result = add(1, 10);
        System.out.println(result);
        System.out.println(add(100, 1000));

        sayHello(5, "Baby");

        System.out.println(concat("hello", "world"));

        System.out.println(addForBinary(10, 100));

        System.out.println(getGrade(60));
        System.out.println(getGrade(3));
        System.out.println(getGrade(93));
        System.out.println(getGrade(75));

    }

    static int add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("result of adding: " + result);
        return result;
    }

    static void doHomework(String name) {
        System.out.println("Doing homework for " + name);
    }

    static void sayHello(int times, String name) {
        for (int i = 0; i < times; i++) {
            System.out.println("Say Hello to " + name);
        }
    }

    static String concat(String s1, String s2) {
        // s1 = hello s2 = world -> helloworld
        return s1 + s2;
    }

    static String addForBinary(int num1, int num2) {
        int result = num1 + num2;
        return Integer.toBinaryString(result);
    }

    // 成绩等级评定 输入score 得到等级 （A B C D F）
    static char getGrade(int score) {
        char grade;
        if (score >= 90) {
            // score >= 90
            grade = 'A';
        } else if (score >= 80) {
            // 80 <= score < 90
            grade = 'B';
        } else if (score >= 70) {
            // 70 <= score < 80
            grade = 'C';
        } else if (score >= 60) {
            // 60 <= score < 70
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

}
