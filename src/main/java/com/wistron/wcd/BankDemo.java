package com.wistron.wcd;


class Bank{
    private int sum;
    public void add(int num){
        sum = sum + num;
        System.out.println("sum="+sum);
    }
}
class Cus implements Runnable{
    Bank b = new Bank();
    public synchronized void run(){

        for(int x=0;x<3;x++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b.add(100);
        }
    }
}


public class BankDemo {
    public static void main(String[] args) {
        Cus c = new Cus();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
