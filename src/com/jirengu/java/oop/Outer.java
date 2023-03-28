package com.jirengu.java.oop;

public class Outer {
    private int number;

    public void outerMethod() {

        System.out.println("Outer method");
    }

    public void useInnerMethod() {
        Inner inner = new Inner("JAVA");
        inner.innerMethod();
        System.out.println("Non-static inner object field: " + inner.getName());

    }

    public static void staticOuterMethod() {
        System.out.println("Static outer method");
    }

    private class Inner {
        private String name;
        public Inner() {
        }

        public Inner(String name) {
            this.name = name;
        }

        public void innerMethod() {
            outerMethod();
            staticOuterMethod();
            System.out.println("Inner method");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    protected static class StaticInner {

        private final Outer outer;

        public StaticInner(Outer outer) {
            this.outer = outer;
        }

        public void staticInnerMethod() {
            staticOuterMethod();
            outer.outerMethod();

            System.out.println("Static inner method");
        }


        public static void main(String[] args) {
            Outer outer1 = new Outer();
            StaticInner staticInner = new StaticInner(outer1);
            staticInner.staticInnerMethod();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.useInnerMethod();
    }


}
