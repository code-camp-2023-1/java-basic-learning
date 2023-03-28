package com.jirengu.java.oop;

public class VariableScope {
    //类变量的作用域：整个类到处都能用，只有一个，类加载的时候
    private static int number;

    //实例变量的作用域：类里面都能用(除static context外)，但是实例没有了就不行了
    private String name;

    public static void testStatic() {
        // 局部变量的作用域：就是花括号内
        {
            int a = 100;
        }

    }

    public void test(int x) {
        x = 100;
        System.out.println(x);
        number = 100;
        {
            this.name = "Java";
            number = 200;
            x = 10;
            System.out.println(x);
        }
        int a = 100;

        int i = 0;
        while (i < 10) {
            i++;
        }


        for (int j = 0; j < 10; j++) {
            int b = 10;
            System.out.println(j);
        }


        {
            i = 11;

            int j = 19;
            this.name = "SSS";
            number = 100;
        }

    }

    public static void main(String[] args) {
        System.out.println(number);
        VariableScope scope = new VariableScope();
        VariableScope scope1 = new VariableScope();
        scope.name = "XX";
        scope1.name = "AAA";
        int a;

    }

}
