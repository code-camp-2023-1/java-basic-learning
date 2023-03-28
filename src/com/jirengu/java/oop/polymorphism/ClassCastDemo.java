package com.jirengu.java.oop.polymorphism;

public class ClassCastDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();

        //向上转型
        Shape rectangle = new Rectangle(5.6, 2);
        Shape square = new Square(3.5);
        Shape circle = new Circle(2.0);


        // 向下转型
        // Rectangle rectangle2 = (Rectangle) shape; //编译没报错，运行会出错
        Square square2 = (Square) square;

        System.out.println(square2.calculateArea());

        Circle circle2 = (Circle) circle;
        System.out.println(circle2.calculateArea());

        Square square3 = (Square) circle;

    }
}
