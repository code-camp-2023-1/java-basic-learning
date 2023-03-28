package com.jirengu.java.oop;

public class ThisDemo  {
    private int field1;
    private int field2;

    private int field3;

    public ThisDemo() {
        System.out.println("Constructor this: " + this);
    }

    public ThisDemo(int field1) {
        this();
        this.field1 = field1;

    }

    public ThisDemo(int field1, int field2) {
        this(field1);
        this.field2 = field2;
    }

    public ThisDemo(int field1, int field2, int field3) {
        this(field1, field2);
        this.field3 = field3;
    }

    public void printInformation() {
        System.out.println("this: " + this);
        System.out.println("field 1: " + this.field1);
        System.out.println("field 2: " + this.field2);
        System.out.println("field 3: " + this.field3);
    }

    public void sayHello() {
        this.printInformation(); //this(demo4的地址）
    }

    public static void main(String[] args) {
        ThisDemo demo1 = new ThisDemo();
        demo1.printInformation();
        ThisDemo demo2 = new ThisDemo(1);
        demo2.printInformation();
        ThisDemo demo3 = new ThisDemo(1, 2);
        demo3.printInformation();
        ThisDemo demo4 = new ThisDemo(1, 2, 3);
        demo4.printInformation();
        demo4.sayHello();

    }
}
