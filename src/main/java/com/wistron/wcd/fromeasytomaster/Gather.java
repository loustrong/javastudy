package com.wistron.wcd.fromeasytomaster;

import java.util.ArrayList;
import java.util.List;

public class Gather {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int) (Math.random()*list.size());
        System.out.println("隨機抽取數組中的元素："+list.get(i));
        list.remove(2);
        System.out.println("將索引是2的元素移除後，list的元素為：");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));

        }
    }
}
