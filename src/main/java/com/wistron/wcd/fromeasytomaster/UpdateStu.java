package com.wistron.wcd.fromeasytomaster;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object> {
    String name;
    long id;

    public UpdateStu(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        UpdateStu upstu = (UpdateStu) o;
        int result = id > upstu.id ? 1:(id==upstu.id ?0:-1);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李同學",01011);
        UpdateStu stu2 = new UpdateStu("陳同學",01021);
        UpdateStu stu3 = new UpdateStu("王同學",01031);
        UpdateStu stu4 = new UpdateStu("馬同學",01041);
        TreeSet<UpdateStu> treeSet = new TreeSet<>();
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        Iterator<UpdateStu> it = treeSet.iterator();
        System.out.println("Set集合的元素：");
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId()+"  "+stu.getName());
        }
        it = treeSet.headSet(stu2).iterator();
        System.out.println("截取stu2前面的Set集合的元素：");
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId()+"  "+stu.getName());
        }
        it = treeSet.subSet(stu2,stu3).iterator();

        System.out.println("截取中間的Set集合的元素：");
        while(it.hasNext()){
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getId()+"  "+stu.getName());
        }
    }
}
