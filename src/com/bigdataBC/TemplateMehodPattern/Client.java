package com.bigdataBC.TemplateMehodPattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("玛莎拉蒂不按喇叭");
        Maserati maserati = new Maserati();
        maserati.run();

        System.out.println("试试玛莎拉蒂按喇叭");
        Maserati maserati2 = new Maserati();
        maserati2.setWhistleFlag(true);
        maserati2.run();
    }
}
