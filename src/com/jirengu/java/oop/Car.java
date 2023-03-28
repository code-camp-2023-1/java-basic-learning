package com.jirengu.java.oop;

public class Car {

    // 属性/字段/状态/成员变量（静态数据） fields
    int topSpeed;
    String color;
    int totalSeats;

    //无参数构造器：初始化对象 (显式声明 V.S 隐式声明)
    //default constructor
    Car() {
        System.out.println("This is car constructor");
        this.topSpeed = 200;
        this.color = "black";
        this.totalSeats = 2;
        welcome();
    }

    //有参数的构造器
    Car(String color) {
        this.topSpeed = 150;
        this.color = color;
        this.totalSeats = 4;
        welcome();
    }

    Car(int topSpeed, String color, int totalSeats) {
        this.topSpeed = topSpeed;
        this.color = color;
        this.totalSeats = totalSeats;
    }


    // 方法（动态行为） method
    void welcome() {
        System.out.println("Welcome!, init information:"
            + " Speed: " + this.topSpeed
            + " Color: " + this.color
            + " Seats: " + this.totalSeats);

    }
    void drive() {
        System.out.println("Start driving....");
    }

    //void speedUp()
    void speedUp() {
        System.out.println("speed 10");
    }

    //void speedUp(int)
    void speedUp(int speedToUpdate) {
        System.out.printf("speed %d\n", speedToUpdate);
    }

    // void speedUp(String)
    void speedUp(String speed) {

    }
    // int speedUp(String)
    //int speedUp(String speed) {}

    // void speedUp(String, int)
    void speedUp(String speed, int speedToUpdate) {

    }
    // void speedUp(int, String)
    void speedUp(int speedToUpdate, String speed) {

    }
    // void speedUp(int, int)
    void speedUp(int currentSpeed, int speedToUpdate) {

    }

    // void speedUp(int, int)
    //void speedUp(int a, int b) {}



    void speedDown() {

    }

    String display(String context) {
        return context;
    }

    public static void main(String[] args) {
        // 创建对象(最常用，最简单): 通过new
        Car car = new Car();
        Car car1 = new Car("white");
        car1.speedUp("100");
        Car car2 = new Car(100,  "red", 10);
        // 用对象（实例）变量调用
        System.out.println("Top speed: " + car.topSpeed);
        System.out.println("Color: " + car.color);
        System.out.println("Total seats: " + car.totalSeats);

        System.out.println("com.jirengu.java.oop.Car 1 Top speed: " + car1.topSpeed);
        System.out.println("com.jirengu.java.oop.Car 1 Color: " + car1.color);
        System.out.println("com.jirengu.java.oop.Car 1 Total seats: " + car1.totalSeats);

        System.out.println("com.jirengu.java.oop.Car 2 Top speed: " + car2.topSpeed);
        System.out.println("com.jirengu.java.oop.Car 2 Color: " + car2.color);
        System.out.println("com.jirengu.java.oop.Car 2 Total seats: " + car2.totalSeats);

        car.drive();
        System.out.println(car.display("I Love You!!!"));
    }
}
// 一个.java文件中可以有很多类，有且仅有一个public class，并且类名要和文件名相同
class Driver {

    public Driver() {
    }
}

class VideoSystem {

}





