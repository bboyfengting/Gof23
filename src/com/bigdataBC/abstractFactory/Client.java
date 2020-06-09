package com.bigdataBC.abstractFactory;

public class Client {
    public static void main(String[] args) {
        CarFactory engineFactory=FactoryProducer.getFactory("engine");
        CarFactory seatFactory=FactoryProducer.getFactory("seat");
        Seat s1 = seatFactory.createSeat("high");
        Seat s2 = seatFactory.createSeat("low");
        s1.comfort();
        s2.comfort();

        Engine e1=engineFactory.createEngine("high");
        Engine e2=engineFactory.createEngine("low");
        e1.run();
        e1.sound();
        e2.run();
        e2.sound();
    }
}
