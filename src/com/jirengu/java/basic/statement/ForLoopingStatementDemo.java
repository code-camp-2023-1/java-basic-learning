package com.jirengu.java.basic.statement;

public class ForLoopingStatementDemo {
    public static void main(String[] args) {
        // 打印hello world 10次
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Hello World!"); // 执行10次
        }
        System.out.println("current value i: " + i); // Expected: 10

        // 打印hello world 10次, 初始化i从20开始， i = i + 5
        for (int j = 20; j < 70; j = j + 5) {
            System.out.println("j = 20 Hello World!"); // 执行10次
        }

        // 死循环
        int a = 10;
        for (int k = 1; k < 11; k = k << 1) {
            System.out.println("k - Hello World!"); // k = 20
        }

        // 计算求和：1 + 2 + 3 + ... + 100
        int sum = 0;
        for (int p = 1; p <= 100; p++) {
            sum = sum + p;
        }

        System.out.println("sum: " + sum);

        // 求和： 找到100(包括100)内奇数求和 循环遍历

        // version 1
        int count = 0;
        for (int num = 1; num <= 100; num++) {
            // 取余%： num % 2 == 0 => 偶数 num % 2 == 1 => 奇数
            if (num % 2 == 1) {
                // 奇数
                count += num; // count = count + num;
            }
        }
        System.out.println("count: " + count);

        // version 2
        int sum2 = 0;
        for (int z = 1; z <= 100; z += 2) {
            sum2 += z;
        }
        System.out.println("sum 2: " + sum2);

        // while version
        int sumForWhile = 0;
        int number = 1;
        while (number <= 100) {
            sumForWhile += number;
            number += 2;
        }
        System.out.println("Sum For While: " + sumForWhile);






    }
}
