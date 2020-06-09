package com.bigdataBC.CarBuilder;

public interface CarBuilder {
    //构建引擎
    Engine buildEngine();
    //构建座椅
    Seat buildSeat();
    //构建car的骨架
    Seleton buildSeleton();
}
