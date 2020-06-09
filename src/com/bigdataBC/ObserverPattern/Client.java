package com.bigdataBC.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject ccSubject = new ConcreteSubject();

        //new多个观察者
        ConcreteObserver obs1 = new ConcreteObserver();
        ConcreteObserver obs2 = new ConcreteObserver();
        ConcreteObserver obs3 = new ConcreteObserver();

        //将new的观察者加入到subject的队伍中
        ccSubject.registerObserver(obs1);
        ccSubject.registerObserver(obs2);
        ccSubject.registerObserver(obs3);

        //改变目标对象状态值
        ccSubject.setState(100);
        System.out.println(obs1.getObsState());
        System.out.println(obs2.getObsState());
        System.out.println(obs3.getObsState());

        System.out.println("===============================================================");

        //改变目标对象状态值
        ccSubject.setState(200);
        System.out.println(obs1.getObsState());
        System.out.println(obs2.getObsState());
        System.out.println(obs3.getObsState());
    }
}
