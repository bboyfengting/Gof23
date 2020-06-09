package com.bigdataBC.FactoryMethod;

public class RollsRoyceFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new RollsRoyce();
    }
}
