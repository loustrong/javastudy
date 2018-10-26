package com.wistron.wcd.fromeasytomaster;

import java.util.*;

public class UpStu {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("01","李同學");
        map.put("02","魏同學");
        Set <String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("Key集合中的元素：");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collection <String> coll = map.values();
        it = coll.iterator();
        System.out.println("Value集合中的元素：");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
