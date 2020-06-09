package com.bigdataBC.StrategyPattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getStrategy(){
        this.strategy.operate();
    }
}
