package com.jirengu.java.oop;

public class User {
    int id;
    String name;

    void sayHello() {

    }

    void login() {

    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.id); // 0
        System.out.println(user.name); // null
        user.id = 1;
        user.name = "Java";
        System.out.println(user.id); // 1
        System.out.println(user.name); // "Java"
        user.sayHello();
        user.login();

        User user2 = new User();
        System.out.println(user2.id); // 0
        System.out.println(user2.name); // null
        user2.id = 2;
        user2.name = "xx";
        System.out.println(user2.id); // 2
        System.out.println(user2.name); // "xx"

        System.out.println(user.id); // 1
        System.out.println(user.name); // "Java"
        System.out.println("###################");
        User user3 = user2;

        System.out.println(user3.id); // 2
        System.out.println(user3.name); // "xx"

        user3.id = 3;
        user3.name = "jirengu";
        System.out.println(user3.id); // 3
        System.out.println(user3.name); // "jirengu"

        System.out.println(user2.id); // 3
        System.out.println(user2.name); // "jirengu"

        System.out.println(user.id); // 1
        System.out.println(user.name); // "Java"


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
