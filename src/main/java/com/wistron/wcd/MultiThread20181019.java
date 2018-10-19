package com.wistron.wcd;

class ThreadDemoWistron extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }

}
class ThreadDemo1019 implements  Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner Thread" + i + Thread.currentThread().getName());
        }
    }
}
public class MultiThread20181019 {
    public static void main(String[] args) {
//        ThreadDemoWistron demo01 = new ThreadDemoWistron();
//        ThreadDemoWistron demo02 = new ThreadDemoWistron();
//        demo01.run();
//        demo02.run();
//        for(int i=0;i<100;i++){
//            System.out.println(i+Thread.currentThread().getName());
//        }
        ThreadDemo1019 d1 = new ThreadDemo1019();
        ThreadDemo1019 d2 = new ThreadDemo1019();
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        t1.start();
        t2.start();
    }
}
