package com.jirengu.java.basic;

public class StringDemo {
    public static void main(String[] args) {
        // 1. 创建字符串
        // (1) 双引号 - 最常用
        String s1 = "Hello World";
        // (2) 利用构造器
        String s2 = new String("Hello");

        char[] chars = {'H', 'E', 'L', 'L', 'O'};
        String s3 = new String(chars);

        // (3) StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append('h');
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');

        String s4 = sb.toString();

        // (4) StringBuffer - Thread Safe线程安全
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('h')
                .append('e')
                .append('l')
                .append('l')
                .append('o')
                .append(" ")
                .append("world");

        String s5 = stringBuffer.toString();

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);

        // 2. 获取字符串长度
        //ctrl + [
        int length1 = s1.length();
        System.out.println("The length of s1: " + length1);
        System.out.println("The length of s2: " + s2.length());

        // 3. 获取特定位置字符 index取值范围：[0, 字符串长度 - 1], 不要越界
        char ch1 = s2.charAt(0);
        System.out.println("index 0 of s2: " + ch1); // Expected: H
        //char ch2 = s2.charAt(5);
        //System.out.println("index 5 of s2: " + ch2);
        //char ch3 = s2.charAt(-1);

        // 遍历字符串
        for (int i = 0; i < s2.length(); i++) {
            System.out.println("ch in s2: " + s2.charAt(i));
        }

        // 4. 字符串连接
        // (1) 用+加号连接
        String str1 = String.format("%s %s", s1, s2);
        System.out.println("Str1: " + str1); // Expected: Hello WorldHello
        // (2) concat函数（方法）
        String str2 = s1.concat(s2); //Hello WorldHello
        String str3 = s2.concat(s1); // HelloHello World
        String str4 = s1.concat(s2).concat(s3).concat(s4);
        System.out.println("Str2: " + str2);
        System.out.println("Str3: " + str3);
        System.out.println("Str4: " + str4);

        // 5. 格式化字符串
        String formatS = String.format("int value: %d,"
                + " float(double) value: %f,"
                + " 2 bit double value: %.3f,"
                + " string value: %s",
                100, 3.1415f, 1.23456, "java");
        System.out.println("s after formatting: " + formatS);
        System.out.printf("SOUF: %s %s\n", s1, s2);

        // 6. 字符串与数字的相互转化
        // String -> Numeric：用包装类的parseXXX
        int intNum = Integer.parseInt("100");
        long longNum = Long.parseLong("10000000");
        double doubleNum = Double.parseDouble("3.1415");

        System.out.printf("int num: %d\n", intNum);
        System.out.printf("long num: %d\n", longNum);
        System.out.printf("double num: %.3f\n", doubleNum);

        // Numeric -> String
        String numberStr1 = 100 + "";
        System.out.println(numberStr1);

        String numberStr2 = String.valueOf(1.618);
        System.out.println(numberStr2);

        String numberStr3 = String.valueOf(1000);
        System.out.println(numberStr3);

        System.out.println(s5.isEmpty());// false
        String s7 = new String();
        System.out.println(s7.isEmpty()); // true

        System.out.println(s1.equals(s2));

        System.out.println(s3.indexOf('L'));// index: 2
        System.out.println(s3.lastIndexOf('L'));// index: 2

        System.out.println(s3.toLowerCase()); // hello
        System.out.println(s4.toUpperCase()); // HELLO
        System.out.println(s1.toLowerCase()); // hello world

        System.out.println(s1.substring(0, 3)); // [start, end)

        String st = "  Hello  ";
        System.out.println(st);
        System.out.println(st.trim());

    }
}
