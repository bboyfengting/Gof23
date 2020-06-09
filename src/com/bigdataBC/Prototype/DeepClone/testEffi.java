package com.bigdataBC.Prototype.DeepClone;

public class testEffi {
    public static void testNew(int size){
        long startTime=System.currentTimeMillis();
        for(int i=0;i<size;i++){
            Car car=new Car();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("普通New方式创建对象耗时："+(endTime-startTime));
    }

    public static void testPrototype(int size){
        long startTime=System.currentTimeMillis();
        Car car=new Car();
        for(int i=0;i<size;i++){
            try {
                Car carPlus=(Car)car.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("原型模式创建对象耗时："+(endTime-startTime));
    }

    public static void main(String[] args) {
        testNew(1000);
        testPrototype(1000);
    }
}
class Car implements Cloneable{

    public Car() {
        try {
            Thread.sleep(10);   //模拟创建对象时的过程！
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
