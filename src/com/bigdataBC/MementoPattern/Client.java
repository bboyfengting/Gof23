package com.bigdataBC.MementoPattern;

public class Client {
    public static void main(String[] args) {
        //new一个负责人
        CareTaker careTaker = new CareTaker();
        //new一个学生
        Student zhangsan = new Student("001", "张三", "666666");
        System.out.println("录入结果："+zhangsan.toString());

        //进行备忘操作一次
        careTaker.setStuMemento(zhangsan.memento());

        //号码记错了，改一下
        zhangsan.setTelnum("999999");
        System.out.println("录入结果："+zhangsan.toString());

        //又核实了一遍，上次没记错，恢复到以前
        zhangsan.recover(careTaker.getStuMemento());
        System.out.println("录入结果："+zhangsan.toString());

    }
}
