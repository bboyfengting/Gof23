package com.bigdataBC.singleton2;

public enum Singleton_enum {
    //这个枚举元素，本身就是单例对象！
    INSTANCE;
    public void function(){
        System.out.println("添加自己需要的操作");
    }
    public static void main(String[] args) {
        Singleton_enum enum1=Singleton_enum.INSTANCE;
        enum1.function();
        Singleton_enum enum2=Singleton_enum.INSTANCE;
        System.out.println(enum1==enum2);   //true
    }
}
