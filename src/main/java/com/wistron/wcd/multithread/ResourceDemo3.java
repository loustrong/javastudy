package com.wistron.wcd.multithread;

class Resource3{
    private String name;
    private String sex;
    private boolean flag = true;
    public synchronized void set(String name,String sex) throws InterruptedException {
        if(flag) this.wait();
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }
    public synchronized void out() throws InterruptedException {
        if(!flag) this.wait();
        System.out.println(name+"....."+sex);
        flag = false;
        notify();
    }
}

class Input3 implements Runnable{
    Resource3 r ;
    Input3(Resource3 r){
        this.r = r ;
    }
    @Override
    public void run() {
        int x = 0 ;
        while(true){
            if(x==0){
                try {
                    r.set("mike","nan");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    r.set("丽丽","女女女");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            x = (x+1)%2;
        }
    }
}
class Output3 implements Runnable{
    Resource3 r ;
    Output3(Resource3 r){
        this.r = r ;
    }
    @Override
    public void run() {
        while(true){
            try {
                r.out();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ResourceDemo3 {
    public static void main(String[] args) {
        Resource3 r = new Resource3();
        Input3 in = new Input3(r);
        Output3 out = new Output3(r);
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();

    }
}
