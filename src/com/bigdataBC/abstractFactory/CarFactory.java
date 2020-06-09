package com.bigdataBC.abstractFactory;

public abstract class CarFactory {
    public abstract Engine createEngine(String type);
    public abstract Seat createSeat(String type);
}
