package com.jirengu.java.oop.polymorphism;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.6, 2);
        Shape square = new Square(3.5);
        Shape circle = new Circle(2.0);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5.6, 2);
        shapes[1] = new Square(3.5);
        shapes[2] = new Circle(2.0);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());

        // foreach
        for (Shape shape : shapes) {
            System.out.println("The area of shape: " + shape.calculateArea());
        }

    }
}
