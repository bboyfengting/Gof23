package com.bigdataBC.FactoryMethod;

public class MaseratiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Maserati();
    }
}
