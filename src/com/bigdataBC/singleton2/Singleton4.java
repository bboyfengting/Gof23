package com.bigdataBC.singleton2;

public class Singleton4 {
    private static class SingletonClassInstance{
        private static final Singleton4 INSTANCE=new Singleton4();
    }
    private Singleton4(){}
    //方法没有同步，调用效率高
    public static Singleton4 getInstance(){
        return SingletonClassInstance.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton4 s1= Singleton4.getInstance();
        Singleton4 s2= Singleton4.getInstance();
        System.out.println(s1==s2); //true
    }
}
