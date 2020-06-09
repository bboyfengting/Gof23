package com.bigdataBC.MediatorPattern;
//抽象同事类
public interface Department {

    //做好本部门工作
    void selfWork();

    //向总经理请示工作
    void reqWork();

}
