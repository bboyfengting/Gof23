package com.bigdataBC.Bridge;
/**
 * 类型维度
 * @Author:大数据编程
 */
public class Computer {
    protected Brand brand;

    public Computer(Brand b) {
        this.brand = b;
    }

    public void sale(){
        brand.saleBrand();
    }
}

class Desktop extends Computer{

    public Desktop(Brand b) {
        super(b);
    }

    public void sale(){
        super.sale();
        System.out.println("台式机");
    }
}

class Laptop extends Computer{
    public Laptop(Brand b) {
        super(b);
    }

    public void sale(){
        super.sale();
        System.out.println("笔记本");
    }
}

class Pad extends Computer{
    public Pad(Brand b) {
        super(b);
    }

    public void sale(){
        super.sale();
        System.out.println();
    }
}


