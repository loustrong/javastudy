package com.wistron.wcd.fromeasytomaster;

import java.io.*;

public class Example_01 {
    public static void main(String[] args) {

        FileOutputStream fs ;

        {
            try {
                fs = new FileOutputStream("wordexample.txt");

                DataOutputStream ds = new DataOutputStream(fs);
                ds.writeUTF("使用writeUFT()方法寫入數據;");
                ds.writeChars("使用writeChars()方法寫入數據：");
                ds.writeBytes("使用writeBytes()方法寫入數據");
                ds.close();

                FileInputStream fis = new FileInputStream("wordexample.txt");
                DataInputStream dis = new DataInputStream(fis);
                System.out.println(dis.readUTF());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
