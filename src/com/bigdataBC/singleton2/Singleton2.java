package com.bigdataBC.singleton2;
/**
 * 为什么要加volatile？去掉行不行？（volatile保证可见性和禁止指令重排）
 *     volatile保证多线程访问情况下的可见性
 *     这里可能会有疑问：synchronized不但保证可见性还保证原子性，多此一举干嘛？
 *     这里有一个少有人知的秘密：其实很多时候不加也没啥明显问题，
 *     但是如果是特别大的项目比如淘宝京东这些非常大的高并发情况下就有可能出现bug，可能一百万次中只有一次出错
 *     volatile可以禁止指令重排（现在基本所有的CPU所有的语言都支持指令重排，这个指令重排序可以显著提高CPU流水线的执行效率）
 */
public class Singleton2 {
    private static volatile Singleton2 INSTANCE;
    private Singleton2(){}
    public static Singleton2 getINSTANCE(){
        if(INSTANCE==null){
            synchronized (Singleton2.class){
                if(INSTANCE==null){
//                    try {
//                        Thread.sleep(1);    //歇一毫秒方便看结果
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
                    INSTANCE=new Singleton2();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100000;i++){
            new Thread(()->{
                System.out.println(Singleton2.getINSTANCE().hashCode());
            }).start();
        }
    }
}
