package com.wistron.wcd.multithread;

class Resource{
    String name;
    String sex;
}

class Input implements Runnable{
    Resource r;
    Input(Resource r){
        this.r =r;
    }
    public void run(){
        int x =0;
        while(true){
            synchronized(r){
                if(x==0){
                    r.name = "mike";
                    r.sex = "nan";
                }
                else{
                    r.name = "丽丽";
                    r.sex = "女";
                }
            }
            x=(x+1)%2;
        }
    }
}
class Output implements Runnable{
    Resource r;

    Output(Resource r){
        this.r =r;
    }
    @Override
    public void run() {

while(true){
    synchronized (r){
        //锁代表了一段代码块，直到代码全部执行完毕，锁才会释放掉。
        System.out.println(r.name+"....."+r.sex);
    }
}
    }
}
public class ResourceDemo {
    public static void main(String[] args) {
        Resource r = new Resource();
        Input in = new Input(r);
        Output out = new Output(r);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();
    }

}
