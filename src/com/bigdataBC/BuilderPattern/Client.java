package com.bigdataBC.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        AirShipDirector director=new LftAirShipDirector(new LftAirShipBuilder());
        AirShip airShip = director.directorShip();
        System.out.println(airShip.getEngine().getName());
        airShip.lunch();
    }
}
