package com.jirengu.java.oop.encapsulation;

public class UserSystem {
    public static void main(String[] args) {
        User user = new User("jirengu", "JAVA");

        user.login("jirengu", "JAVA");
        user.login("jirengu", "java");

        user.login("jirengu", "java");

    }
}
