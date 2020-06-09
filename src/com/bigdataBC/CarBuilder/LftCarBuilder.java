package com.bigdataBC.CarBuilder;

public class LftCarBuilder implements CarBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("构建引擎");
        return new Engine("Lft牌的引擎");
    }

    @Override
    public Seat buildSeat() {
        System.out.println("构建座椅");
        return new Seat("Lft牌座椅");
    }

    @Override
    public Seleton buildSeleton() {
        System.out.println("构建汽车骨架");
        return new Seleton("Lft牌的汽车骨架");
    }
}
