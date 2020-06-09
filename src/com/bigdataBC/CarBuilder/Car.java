package com.bigdataBC.CarBuilder;

public class Car {
    Engine engine;
    Seat seat;
    Seleton seleton;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Seleton getSeleton() {
        return seleton;
    }

    public void setSeleton(Seleton seleton) {
        this.seleton = seleton;
    }

    public void buy(){
        System.out.println("这是您要买的车，组装好了，开走吧！滴滴滴！！！");
    }
}
//引擎
class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//座椅
class Seat{
    private String name;

    public Seat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//骨架
class Seleton{
    private String name;

    public Seleton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
