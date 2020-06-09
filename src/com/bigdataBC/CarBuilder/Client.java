package com.bigdataBC.CarBuilder;

public class Client {
    public static void main(String[] args) {
        LftCarDirector lftCarDirector = new LftCarDirector(new LftCarBuilder());
        Car car = lftCarDirector.carDirector();
        System.out.println(car.getEngine().getName());
        car.buy();
    }
}
