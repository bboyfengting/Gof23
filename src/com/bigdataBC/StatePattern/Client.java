package com.bigdataBC.StatePattern;

public class Client {
    public static void main(String[] args) {

        OrderContext orderContext = new OrderContext();

        //商品发货了，修改一下状态
        orderContext.setState(new shipped());

        //买家收到货了，修改一下状态
        orderContext.setState(new Received());
    }
}
