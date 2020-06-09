package com.bigdataBC.ObserverPattern;

public class ConcreteSubject extends Subject {
    //目标对象值
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state=state;
        //主题（目标）对象值发生变化，通知所有观察者
        this.notifyObservers();
    }
}
