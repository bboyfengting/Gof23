package com.bigdataBC.Decorator;

public class Client {
    public static void main(String[] args) {
        System.out.print("普通Car：");
        ICar car=new Car();
        car.run();

        System.out.println();
        System.out.print("飞车：");
        FlyCar flyCar=new FlyCar(car);
        flyCar.run();

        System.out.print("水陆两栖车：");
        WaterCar waterCar=new WaterCar(car);
        waterCar.run();

        System.out.print("水陆空通用汽车：");
        FlyCar flywaterCar=new FlyCar(waterCar);
        flywaterCar.run();
    }
}
