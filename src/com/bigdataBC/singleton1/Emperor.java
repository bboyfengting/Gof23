package com.bigdataBC.singleton1;

public class Emperor {
    //先定义一个皇帝放在那儿
    private static Emperor emperor;
    //世俗和道德约束你，目的就是不让你产生第二个皇帝
    private Emperor(){
        //private的构造函数约束，让此类无法被其他类new出来
    }
    //public是为了给大臣的朝见的机会，getInstance()是获得唯一一个实例化对象
    public static Emperor getInstance(){
        //如果没有皇帝，那就new一个好了
        if(emperor==null){
            emperor=new Emperor();
        }
        return emperor;
    }
    //皇帝叫啥名？
    public static void emperorInfo(){
        System.out.println("朕的名字是【大数据编程】");
    }
}
