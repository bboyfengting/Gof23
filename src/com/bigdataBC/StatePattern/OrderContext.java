package com.bigdataBC.StatePattern;
//订单对象
public class OrderContext {
    private State state;

    public void setState(State s){
        System.out.print("修改订单状态为>>");
        this.state=s;
        state.handle();
    }
}
