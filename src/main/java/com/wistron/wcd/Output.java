package com.wistron.wcd;

public interface Output {
    //接口里定义的Field只能是常量
    int MAX_CACHE_LINE = 50;
    //接口里定义的只能是public的抽象实例方法
    void out();
    void getData(String msg);
    //在接口里定义默认方法，需要使用defaut修饰
    default void print(String... msgs){
        for (String msg:msgs){
            System.out.println(msg);
        }
    }
    default void test(){
        System.out.println("默认的test()的方法");
    }
    static String staticTest(){
        return "接口里的方法";
    }
}
