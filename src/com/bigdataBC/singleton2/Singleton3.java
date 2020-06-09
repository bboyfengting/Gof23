package com.bigdataBC.singleton2;

public class Singleton3 {
    private static Singleton3 INSTANCE;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(INSTANCE==null){
            Singleton3 sc;
            synchronized (Singleton3.class){
                sc=INSTANCE;
                if(sc==null){
                    synchronized (Singleton3.class){
                        if(sc==null){
                            sc=new Singleton3();
                        }
                    }
                    INSTANCE=sc;
                }
            }
        }
        return INSTANCE;
    }
}
