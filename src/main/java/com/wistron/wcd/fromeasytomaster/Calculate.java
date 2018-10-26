package com.wistron.wcd.fromeasytomaster;

public  class Calculate {
    public static double cal(int i){
        double k = 1.0;
        for(int j=1;j<=i;j++){
            k=k/j;
        }
        return k;
    }

    public static void main(String[] args) {
        double sum = 0;
        for(int i=1;i<=20;i++){
            sum = sum + cal(i);
        }
        System.out.println(sum);
        System.out.println("Hello World!");
    }
}
