package com.bigdataBC.MediatorPattern;
//抽象中介者
public interface Mediator {

    //登记部门信息
    void register(String deptName,Department dept);

    //发号施令
    void issueorders(String deptName);

}
