package com.wistron.wcd.fromeasytomaster;

import java.io.File;

public class FileTest151 {
    public static void main(String[] args) {
        File file = new File("word.txt");
        if(file.exists()){
            file.delete();
            System.out.println("系統文件已經刪除。");
        }else{
            try{
                file.createNewFile();
                System.out.println("文件已經創建。");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
