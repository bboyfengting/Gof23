package com.bigdataBC.singleton2;

public class Singleton1_1 {
    /**
     * 由于对象需要被静态方法调用,把方法设置为static
     * 由于对象是static,必须要设置访问权限修饰符为private ,如果是public可以直接调用对象,不执行访问入口
     * 类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，是天然的,是线程安全的！
     * 为什么要加final？ 其实可以不加，加了保证以后没人可能会更改INSTANCE，这是一个良好的编程习惯
     */
    private static final Singleton1_1 INSTANCE=new Singleton1_1();

    //private确保其他类不能实例化这个类对象
    private Singleton1_1(){ }
    //方法没有同步，调用效率高！
    public Singleton1_1 getInstance(){
        return INSTANCE;
    }
    //测试
    public static void main(String[] args) {
        Singleton1_1 s1=Singleton1_1.INSTANCE;
        Singleton1_1 s2=Singleton1_1.INSTANCE;
        System.out.println(s1==s2); //true
    }
}
