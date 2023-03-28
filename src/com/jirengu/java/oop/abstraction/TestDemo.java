package com.jirengu.java.oop.abstraction;

public class TestDemo {
    public void collect(Bird bird) {
        System.out.println(bird);
    }

    public void show(Flyable flyable) {
        flyable.fly();
    }

    public static void main(String[] args) {
        TestDemo demo = new TestDemo();
        Bird bird = new Bird() {
            @Override
            public void fly() {
                System.out.println("Anonymous Bird is flying");

            }
        };
        demo.collect(bird);
        String name = "JAVA";
        Bird javaBird = new Bird(name) {
            @Override
            public void fly() {
                System.out.println("JAVA BIRD is flying");
            }
        };
        demo.show(javaBird);

        Flyable flyableThing = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Something is flying");
            }
        };

        demo.show(flyableThing);
    }
}
