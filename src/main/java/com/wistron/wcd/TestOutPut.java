package com.wistron.wcd;

public class TestOutPut implements Output{
    @Override
    public void out() {
        System.out.println("This is out method.");
    }

    @Override
    public void getData(String msg) {
        System.out.println(msg+",This is getData method.");
    }
    public static void main(String[] args){
        TestOutPut testOutPut = new TestOutPut();
        testOutPut.out();
        testOutPut.getData("Hello");
        testOutPut.test();
        System.out.println(Output.staticTest());
    }
}
