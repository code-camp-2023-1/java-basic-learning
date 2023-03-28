package com.jirengu.java.oop.access;

public class AccessDemo {
    public static void main(String[] args) {
        // PrivateDemo privateDemo = new PrivateDemo(1, "XiaoMing");
        PublicAccessDemo publicAccessDemo = new PublicAccessDemo(2, "xiaoming");
        publicAccessDemo.printInformation();

        DefaultAccessDemo defaultAccessDemo = new DefaultAccessDemo(10, "xiaoxia");
        defaultAccessDemo.printInformation();
        System.out.println(defaultAccessDemo.id);
        System.out.println(defaultAccessDemo.name);

        DefaultDemo demo = new DefaultDemo();

        AccessBestPracticeDemo bestPracticeDemo = new AccessBestPracticeDemo(100, "jirengu");
        bestPracticeDemo.doSomething();
        System.out.println("Best practice demo id: " + bestPracticeDemo.getId());
        bestPracticeDemo.setId(1000);
        System.out.println("Best practice demo id after setter: " + bestPracticeDemo.getId());


    }
}
