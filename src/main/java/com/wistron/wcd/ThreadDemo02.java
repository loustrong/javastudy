package com.wistron.wcd;

class DemoT02 extends Thread {
    private String name;

    DemoT02(String name) {
        super(name);
        this.name = name;
    }

    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println(this.name + "......x" + x + "......name" + Thread.currentThread().getName());
        }
    }
}

class ThreadDemo02 {
    public static void main(String[] args) {
        DemoT02 d1 = new DemoT02("旺财");
        DemoT02 d2 = new DemoT02("xiaoqiang");
        d1.start();

        d2.start();
        System.out.println("Over...." + Thread.currentThread().getName());
    }


}
