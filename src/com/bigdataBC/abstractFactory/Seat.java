package com.bigdataBC.abstractFactory;

public interface Seat {
    void comfort();
}

class HighSeat implements Seat{

    @Override
    public void comfort() {
        System.out.println("高配座椅坐着舒服");
    }
}

class MidSeat implements Seat{

    @Override
    public void comfort() {
        System.out.println("中配座椅坐着还行");
    }
}

class LowSeat implements Seat{

    @Override
    public void comfort() {
        System.out.println("低配座椅感觉一般");
    }
}
