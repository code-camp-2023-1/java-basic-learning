package com.jirengu.java.oop.abstraction;

public interface Flyable {
    // 在接口中的静态方法不能被实现类override
    static void prepare() {
        System.out.println("Preparing");
    }
    void fly();

    default void showStatus() {
        System.out.println("我要飞得更高！");
    }
}

interface CanSleep {
    void sleep();
}

@FunctionalInterface
interface TestI {
    void test();

}
