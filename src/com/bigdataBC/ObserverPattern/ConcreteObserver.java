package com.bigdataBC.ObserverPattern;

public class ConcreteObserver implements Observer {
    //观察者的状态值（要与目标对象一致）
    private int obsState;

    @Override
    public void update(Subject subject) {
        obsState=((ConcreteSubject)subject).getState();
    }

    public int getObsState(){
        return obsState;
    }

    public void setObsState(int state){
        this.obsState=state;
    }
}
