package com.bigdataBC.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Car c1=new MaseratiFactory().createCar();
        Car c2=new LamborghiniFactory().createCar();
        Car c3=new RollsRoyceFactory().createCar();

        c1.carInfo();
        c2.carInfo();
        c3.carInfo();
    }
}
