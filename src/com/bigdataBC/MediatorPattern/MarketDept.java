package com.bigdataBC.MediatorPattern;
//市场部
public class MarketDept implements Department {
    //持有中介（总经理）的引用
    private Mediator mediator;

    public MarketDept(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("市场部",this);
    }

    @Override
    public void selfWork() {
        System.out.println("市场部门开始工作>>谈好项目并接手");
    }

    @Override
    public void reqWork() {
        System.out.println("项目来了！！需要开发部进行研发");
        mediator.issueorders("开发部");
        System.out.println("没钱了！！需要资金支持");
        mediator.issueorders("财务部");
    }
}
