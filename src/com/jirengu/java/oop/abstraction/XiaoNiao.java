package com.jirengu.java.oop.abstraction;

public class XiaoNiao extends Bird implements CanSleep {
    @Override
    public void fly() {
        System.out.println("XiaoNiao is flying slow");
    }

    @Override
    public void sleep() {
        System.out.println("XiaoNiao is sleep");
    }

    public static void main(String[] args) {
        XiaoNiao xiaoNiao = new XiaoNiao();
        xiaoNiao.doFly();

        xiaoNiao.showStatus();
    }
}
