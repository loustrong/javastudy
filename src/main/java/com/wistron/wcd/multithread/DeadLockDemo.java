package com.wistron.wcd.multithread;

class Ticket implements Runnable{
    private int num = 1000;
    Object obj = new Object();
    boolean flag = true;
    public void run(){
        if(flag)
            while(true){
                synchronized (obj){
                    this.show();
                }
            }
            else
                while(true){
                    this.show();
                }
    }
    public  synchronized void show(){
        synchronized (obj){
            if(num>0){
                try{Thread.sleep(10);} catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+".....sale...."+num--);
            }
        }

    }
}
public class DeadLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Ticket t =new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        Thread.sleep(2);
        t.flag = false;
        t2.start();
    }
}
