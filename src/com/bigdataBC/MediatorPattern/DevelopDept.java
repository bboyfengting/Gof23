package com.bigdataBC.MediatorPattern;
//开发部
public class DevelopDept implements Department {
    //持有中介的引用
    private Mediator mediator;

    public DevelopDept(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("开发部",this);
    }

    @Override
    public void selfWork() {
        System.out.println("开发部门开始工作>>进行科研开发");
    }

    @Override
    public void reqWork() {
        System.out.println("该发工资了");
    }
}
