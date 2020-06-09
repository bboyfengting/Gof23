package com.bigdataBC.Factory;

public class Client2 {
    public static void main(String[] args) {
        Car c1=CarFactory.createCar("玛莎拉蒂");
        Car c2=CarFactory.createCar("兰博基尼");
        c1.carInfo();
        c2.carInfo();
    }
}
