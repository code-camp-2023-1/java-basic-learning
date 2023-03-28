package com.jirengu.java.oop.access;

public class DefaultAccessDemo {
    int id;
    String name;

    DefaultAccessDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void printInformation() {
        System.out.println("Id: " + this.id + " Name: " + this.name);
    }

    public static void main(String[] args) {
        DefaultAccessDemo demo = new DefaultAccessDemo(1, "JAVA");
        demo.printInformation();
    }
}

class DefaultDemo {

}
