package com.bigdataBC.singleton1;

/**
 * 定义一个大臣（相当于测试类）
 * 看看每天朝见的皇帝是不是同一个
 */
public class Minister {
    public static void main(String[] args) {
//        //Day1
//        Emperor e1=Emperor.getInstance();
//        e1.emperorInfo();   //朕的名字是【大数据编程】
//        //Day2
//        Emperor e2=Emperor.getInstance();
//        e2.emperorInfo();   //朕的名字是【大数据编程】
//        System.out.println("第一天和第二天朝见的是同一个皇帝吗?   "+(e1==e2));   //true
//        //Day3
//        Emperor e3=Emperor.getInstance();
//        e3.emperorInfo();   //朕的名字是【大数据编程】
//        System.out.println("这三天朝见的是同一个皇帝吗?   "+((e1==e2)&&(e2==e3)));   //true

        for(int i=0;i<100000;i++){
            new Thread(()->{
                System.out.println(Emperor.getInstance().hashCode());
                //输出结果肯定有不一致
            }).start();
        }
    }
}
