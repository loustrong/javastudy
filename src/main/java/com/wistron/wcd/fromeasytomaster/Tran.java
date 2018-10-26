package com.wistron.wcd.fromeasytomaster;

public class Tran {
    static int avg(int number1,int number2) throws MyException{
       if(number1<0 || number2 <0 ){
           throw new MyException("不可以使用負數");
       }
       if(number1 >100 || number2 > 100){
           throw new MyException("數字太大了.");
       }
       return (number1+number2)/2;
    }

    public static void main(String[] args) throws MyException {
        try{
            int result = avg(-1,102);
            System.out.println(result);
        }
        catch (MyException e){
            System.out.println(e);
        }
//        int result = avg(-1,102);
//            System.out.println(result);
    }
}
