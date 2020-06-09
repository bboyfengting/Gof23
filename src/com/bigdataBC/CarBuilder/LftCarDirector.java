package com.bigdataBC.CarBuilder;

public class LftCarDirector implements CarDirector {
    private CarBuilder carBuilder;

    public LftCarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public Car carDirector() {
        //造部件
        Engine engine=carBuilder.buildEngine();
        Seat seat=carBuilder.buildSeat();
        Seleton seleton=carBuilder.buildSeleton();
        //组装部件==>成品Car
        Car car=new Car();
        car.setEngine(engine);
        car.setSeat(seat);
        car.setSeleton(seleton);
        return car;
    }
}
