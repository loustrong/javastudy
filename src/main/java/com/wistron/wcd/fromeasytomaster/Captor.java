package com.wistron.wcd.fromeasytomaster;

public class Captor {
    static int quatient(int x,int y) throws MyException{
        if(y < 0){
            throw new MyException("除數不能是負數。");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try{
            int result = quatient(3,-1);

        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("除數不能為0.");
        }catch (Exception e){
            System.out.println("程序發生了其他異常:"+e);
        }
    }
}
