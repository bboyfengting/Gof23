package com.bigdataBC.abstractFactory;

public class EngineFactory extends CarFactory {
    @Override
    public Engine createEngine(String type) {
        if(type.equals("high")){
            return new HighEngine();
        }else if(type.equals("low")){
            return new LowEngine();
        }else{
            return null;
        }
    }

    @Override
    public Seat createSeat(String type) {
        return null;
    }
}
