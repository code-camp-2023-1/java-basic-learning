package com.jirengu.java.basic.statement;

public class IfStatementDemo {
    public static void main(String[] args) {
        // if-then 圆括号里面必须是布尔表达式 布尔表达式为true时会执行代码块

        int a = 1;
        int b = 2;

        boolean isOpened = false;
        if ((a > b) || isOpened) {
            System.out.println("The store is opening");
            System.out.println(a + b);
        }

        // if-then-else: if-else语句 圆括号里面必须是布尔表达式
        // 布尔表达式为true时会执行if代码块, 否则执行else代码块
        int c = 10;
        int d = 5;
        if ((c != d) && isOpened) {
            System.out.println("The block is accessed");
            System.out.println(a + b);
        } else {
            System.out.println("Hahahahaha!!!");
        }

        // if-then-else: if-else if-else语句
        // 成绩等级评定 A B C D F
        int score = 3;
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

        System.out.println("Grade: " + grade);
    }
}
