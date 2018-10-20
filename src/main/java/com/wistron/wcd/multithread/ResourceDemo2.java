package com.wistron.wcd.multithread;

class Resource2 {
    String name;
    String sex;
    boolean flag = false;
}

class Input2 implements Runnable {
    Resource2 r;

    Input2(Resource2 r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            synchronized (r) {
                if (r.flag) {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x == 0) {
                    r.name = "Mike";
                    r.sex = "Nan";
                } else {
                    r.name = "丽丽";
                    r.sex = "女女女";
                }
                r.flag = true;
                r.notify();
            }
            x = (x + 1) % 2;
        }
    }
}

class Output2 implements Runnable {
    Resource2 r;

    Output2(Resource2 r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (r) {
                if (!r.flag) {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println(r.name + "...." + r.sex);
                r.flag = false;
                r.notify();
            }
        }
    }
}

public class ResourceDemo2 {
    public static void main(String[] args) {
        Resource2 r  = new Resource2();
        Input2 in = new Input2(r);
        Output2 out = new Output2(r);
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();

    }
}
