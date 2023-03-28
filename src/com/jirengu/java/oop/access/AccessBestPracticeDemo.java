package com.jirengu.java.oop.access;

public class AccessBestPracticeDemo {

    // 一般属性设为private
    private int id;

    private String name;

    // getter and setter
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    //构造器public
    public AccessBestPracticeDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //想给别人用的方法就用public
    public void doSomething() {
        doAnotherThing();
    }

    //不想暴露给别人用的方法就用private
    private void doAnotherThing() {
        System.out.println("do another thing");
    }



}
