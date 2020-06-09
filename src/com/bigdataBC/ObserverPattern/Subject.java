package com.bigdataBC.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
//目标对象
public class Subject {
    private List<Observer> observerList=new ArrayList<>();
    public void registerObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    //通知all观察者更新
    public void notifyObservers(){
        for(Observer obs:observerList){
            obs.update(this);
        }

    }
}
