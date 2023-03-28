package com.jirengu.java.basic;

public class ArrayDemo {
    public static void main(String[] args) {
        // 1. 如何创建一个数组: 方括号里面填数组长度
        int[] numberArray = new int[10]; //推荐写法

        //不推荐
        int[] nums;
        nums = new int[4];

        boolean[] booleanArray = new boolean[4];

        double[] doubles = new double[20];

        String[] strings = new String[4];
        ArrayDemo[] arrayDemos = new ArrayDemo[0]; //没有意义

        Integer[] integers = new Integer[30];

        // 2. 如何初始化数组

        // 偷懒的方法: 静态初始化
        int[] scores = {5, 10, 2, 4, 70};
        boolean[] statusArray = {true, false, false};

        // index为0的位置 -> 赋值
        numberArray[0] = 1; //int语句赋值
        numberArray[4] = 100;

        //index不能越界： index是有范围的，max-index = array.length - 1; min-index = 0
        numberArray[9] = 9;
        //numberArray[10] = 20;
        // numberArray[101] = 10;

        //默认

        // 3. 如何获取某个index的值 数组名[index]
        System.out.println(numberArray[0]);
        System.out.println(numberArray[2]);
        System.out.println(numberArray[3]);
        System.out.println(numberArray[4]);

        System.out.println(scores[4]);

        // 4. 如何获取数组长度 array-name.length
        int length = numberArray.length;
        System.out.println("length of numberArray: " + length);// Expected: 10
        System.out.println(doubles.length); //Expected: 20

        // 5. 如何遍历数组
        // (1) 最笨的方法
        System.out.println("最笨的方法: " + numberArray[0]);
        System.out.println("最笨的方法: " + numberArray[1]);
        System.out.println("最笨的方法: " + numberArray[2]);
        System.out.println("最笨的方法: " + numberArray[3]);
        System.out.println("最笨的方法: " + numberArray[4]);
        System.out.println("最笨的方法: " + numberArray[5]);
        System.out.println("最笨的方法: " + numberArray[6]);
        System.out.println("最笨的方法: " + numberArray[7]);
        System.out.println("最笨的方法: " + numberArray[8]);
        System.out.println("最笨的方法: " + numberArray[9]);

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        // (2) 推荐的用法：for循环 （重点，常用）
        int arrayLength = numberArray.length;
        // index [0, arrayLength - 1]
        // i. 推荐
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("for循环：" + numberArray[i]);
        }

        // ii. 不推荐
        for (int j = 0; j <= arrayLength - 1; j++) {
            System.out.println("for循环 (j <= arrayLength - 1)：" + numberArray[j]);
        }

        // iii. while 不推荐
        int index = 0;
        while (index < numberArray.length) {
            System.out.println("while: " + numberArray[index]);
            index++;
        }

        // (3) 推荐的用法：for-each 用于数组遍历和集合遍历（之后讲）(没有显式的index)
        // 不适用于需要知道数组元素index的情况
        for (int num : numberArray) {
            System.out.println("For-each: " + num);
        }

        for (double number: doubles) {
            System.out.println("For-each double: " + number);
        }



    }
}
