package com.bigdataBC.MediatorPattern;
//财务部
public class FinanceDept implements Department {
    //持有中介的引用
    private Mediator mediator;

    public FinanceDept(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("财务部",this);
    }

    @Override
    public void selfWork() {
        System.out.println("财务部门开始工作>>资金分配");
    }

    @Override
    public void reqWork() {
        System.out.println("钱太多了，怎么花");
    }
}
