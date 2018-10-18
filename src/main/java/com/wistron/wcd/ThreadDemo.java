package com.wistron.wcd;

class DemoT extends Object {
    public void finalize() {
        System.out.println("demo OK.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new DemoT();
        new DemoT();
        new DemoT();
        System.gc();
        System.out.println("Hello World!");
    }
}
