package com.bigdataBC.Bridge;

public class Client {
    public static void main(String[] args) {
        //联想台式机
        Computer c1=new Desktop(new Lenovo());
        c1.sale();
        //神舟笔记本
        Computer c2=new Laptop(new Shenzhou());
        c2.sale();
    }
}
