package com.jirengu.java.oop.cardemo;

import com.jirengu.java.oop.access.DefaultAccessDemo;
import com.jirengu.java.oop.access.PublicAccessDemo;

public class AccessDemo {

    public static void main(String[] args) {
        PublicAccessDemo demo = new PublicAccessDemo(3, "xiaohong");
        demo.printInformation();
        System.out.println(demo.id);
        System.out.println(demo.name);

        // DefaultAccessDemo defaultAccessDemo = new DefaultAccessDemo(10, "xiaoxia");
        // defaultAccessDemo.printInformation();
        // System.out.println(defaultAccessDemo.id);
        // System.out.println(defaultAccessDemo.name);
    }
}



