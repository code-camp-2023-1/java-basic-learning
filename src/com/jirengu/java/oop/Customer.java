package com.jirengu.java.oop;

public class Customer {
    int id;
    String name;

    public static void printInformation(Customer c) {
        System.out.println("Customer id: " + c.id); // 1
        System.out.println("Customer name: " + c.name); // "John"

    }

    public static void updateInformation(Customer c) {
        c.id = 2;
        c.name = "XX";
        System.out.println("Updated Customer id: " + c.id); // 2
        System.out.println("Updated Customer name: " + c.name); // "XX"

    }

    public static Customer getCustomer() {
        Customer c = new Customer();
        c.name = "CC";
        c.id = 111;
        return c;
    }

    public static void updateInformationVersion2(Customer c) {
        c = new Customer();
        c.id = 10;
        c.name = "Java";
        System.out.println("Updated V2 Customer id: " + c.id); // 10
        System.out.println("Updated V2 Customer name: " + c.name); // "Java"

    }

    public static void main(String[] args) {
        //Customer customer = new Customer();
        //customer.id = 1;
        //customer.name = "John";

        // updateInformation(customer); // ?
        //updateInformationVersion2(customer);
        Customer customer = getCustomer();
        System.out.println(customer.id); // 111
        System.out.println(customer.name); // "CC"

    }
}
