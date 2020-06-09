package com.bigdataBC.abstractFactory;

public class FactoryProducer {
    public static CarFactory getFactory(String choice){
        if(choice.equals("engine")){
            return new EngineFactory();
        } else if(choice.equals("seat")){
            return new SeatFactory();
        }else{
            return null;
        }
    }
}