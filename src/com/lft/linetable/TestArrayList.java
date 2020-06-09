package com.lft.linetable;

public class TestArrayList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(123);
        list.add(321);
        list.add(456);
        list.add(678);
//        list.add(789);
//        list.add(789);
//        list.add(789);
//        list.add(789);

//        list.add(6,555);
//        list.addBefore(678,666);

//        list.addAfter(678,666);
        System.out.println(list.get(3));
//        list.removeElement(678);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
        System.out.println(list.replace(3,999));
        System.out.println(list.get(3));
        System.out.println(list.contains(678));
    }
}
