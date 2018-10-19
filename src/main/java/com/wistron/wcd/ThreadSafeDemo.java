package com.wistron.wcd;

class Ticket implements Runnable{

    private int num = 100;
    Object obj = new Object();
    public   void run(){

        while(true ) {
            synchronized (obj) {
                if (num > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    System.out.println(Thread.currentThread().getName() + "....sale...." + num--);
                }
            }
        }

    }
}
public class ThreadSafeDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        Thread thread3 = new Thread(t);


        thread1.start();
        thread2.start();
        thread3.start();



    }


}
