package com.jirengu.java.oop.access;

public class PrivateAccessDemo {
    private int id;
    private String name;

    private PrivateAccessDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void printInformation() {
        System.out.println("Id: " + this.id + " Name: " + this.name);
    }

    public static void main(String[] args) {
        PrivateAccessDemo demo = new PrivateAccessDemo(1, "JAVA");
        demo.printInformation();
    }
}
