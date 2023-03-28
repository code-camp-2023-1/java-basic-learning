package com.jirengu.java.basic.statement;

public class BranchingStatementDemo {
    public static void main(String[] args) {
        // break
        System.out.println("============= break =============");
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("Hello World: " + i);
        }

        int time = 0;
        while (time < 5) {
            if (time % 2 == 0) {
                break;
            }
            System.out.println("while: " + time);
        }

        // continue
        System.out.println("============= continue =============");
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Hello World: " + i);
        }

        //return
        if (1 > 2) {
            return;
        }

    }
}
