package com.bigdataBC.FactoryMethod;

public class LamborghiniFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Lamborghini();
    }
}
