package com.lft.linetable;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        List list=new pSingleLinkedList();
        list.add(123);
        list.add(321);
        list.add(456);
        list.add(678);
        list.add(444);
        list.add(5);
        list.add(6);
        list.add(7);

//        list.add(7,555);
        System.out.println(list.get(5));
//        list.addAfter(5,67);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.remove(6));
//        list.removeElement(444);
        System.out.println(list.replace(5,555));
        System.out.println(list.get(5));
//        System.out.println(list.indexOf(7));
//        System.out.println(list.toString());
        System.out.println(list.contains(555));
    }
}
