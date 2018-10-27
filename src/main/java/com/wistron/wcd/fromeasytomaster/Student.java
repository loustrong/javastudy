package com.wistron.wcd.fromeasytomaster;

import java.io.*;

public class Student {
    public static void main(String[] args) {
        String content[] = {"好久不見","最近好嗎","常聯繫"};
        File file = new File("word2.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            for(int k = 0;k<content.length;k++){
                bufferedWriter.write(content[k]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileReader fr = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fr);
            String s= null;
            int i = 0;
            while((s=bufferedReader.readLine())!=null){
                i++;
                System.out.println("第"+i +"行:"+s);
            }
            bufferedReader.close();
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
