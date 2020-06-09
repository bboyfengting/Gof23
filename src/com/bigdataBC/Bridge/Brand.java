package com.bigdataBC.Bridge;

/**
 * 品牌维度
 * @Author:大数据编程
 */
public interface Brand {
    void saleBrand();
}

class Lenovo implements Brand{

    @Override
    public void saleBrand() {
        System.out.print("销售联想品牌的");
    }
}

class Shenzhou implements Brand{

    @Override
    public void saleBrand() {
        System.out.print("销售神舟品牌的");
    }
}

class Dell implements Brand{

    @Override
    public void saleBrand() {
        System.out.print("销售戴尔品牌的");
    }
}