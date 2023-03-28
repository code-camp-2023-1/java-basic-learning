package com.jirengu.java.oop;


public class StaticDemo {
    int id;
    static String name;

    //静态代码块会用于类的初始化
    static {
        name = "STATIC JAVA";
        System.out.println("Init static demo with static block");
        printInformation("JIRENGU");
        String[] args = new String[1];
        main(args);
    }



    public StaticDemo(int id) {
        this.id = id;
    }

    static void printInformation(String msg) {
        System.out.println("Information: " + msg);
    }

    void printObjInformation() {
        System.out.println("Print this: " + this);
        printInformation("Info");
    }

    public static void main(String[] args) {
        StaticDemo demo1 = new StaticDemo(10);
        System.out.println("demo1 id: " + demo1.id);
        printInformation("Welcome");
        StaticDemo demo2 = new StaticDemo(15);
        demo2.printObjInformation();
        StaticDemo.printInformation("GoodBye");
        System.out.println("demo1 id: " + demo2.id);
        System.out.println("Static Demo Name:" + StaticDemo.name);
    }


}
