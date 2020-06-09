package com.bigdataBC.abstractFactory;

public class SeatFactory extends CarFactory {
    @Override
    public Engine createEngine(String type) {
        return null;
    }

    @Override
    public Seat createSeat(String type) {
        if(type.equals("high")){
            return new HighSeat();
        }else if(type.equals("low")){
            return new LowSeat();
        }else{
            return null;
        }
    }
}
