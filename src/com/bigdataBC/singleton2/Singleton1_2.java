package com.bigdataBC.singleton2;

public class Singleton1_2 {
    private static final Singleton1_2 INSTANCE;
    static {
        INSTANCE=new Singleton1_2();
    }
    private Singleton1_2(){}
    public Singleton1_2 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton1_2 s1=Singleton1_2.INSTANCE;
        Singleton1_2 s2=Singleton1_2.INSTANCE;
        System.out.println(s1==s2);
    }

}
