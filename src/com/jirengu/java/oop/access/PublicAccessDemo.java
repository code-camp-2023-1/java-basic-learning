package com.jirengu.java.oop.access;

public class PublicAccessDemo {
    public int id;
    public String name;

    public PublicAccessDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

     public void printInformation() {
        System.out.println("Id: " + this.id + " Name: " + this.name);
    }

    public static void main(String[] args) {
        PublicAccessDemo demo = new PublicAccessDemo(1, "JAVA");
        demo.printInformation();
    }
}
