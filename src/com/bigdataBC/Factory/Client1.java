package com.bigdataBC.Factory;

public class Client1 {
    public static void main(String[] args) {
        Car c1=new Maserati();
        Car c2=new Lamborghini();
        c1.carInfo();
        c2.carInfo();
    }
}
