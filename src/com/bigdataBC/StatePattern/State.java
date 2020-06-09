package com.bigdataBC.StatePattern;

public interface State {
    void handle();
}

class shipped implements State{

    @Override
    public void handle() {
        System.out.println("已发货");
    }
}

class transit implements State{

    @Override
    public void handle() {
        System.out.println("运输中");
    }
}

class Received implements State{

    @Override
    public void handle() {
        System.out.println("已收货");
    }
}
