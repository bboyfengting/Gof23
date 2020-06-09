package com.bigdataBC.abstractFactory;

public interface Engine {
    void run();
    void sound();
}

class HighEngine implements Engine{

    @Override
    public void run() {
        System.out.println("高配引擎跑得快");
    }

    @Override
    public void sound() {
        System.out.println("高配引擎声音小");
    }
}

class MidEngine implements Engine{

    @Override
    public void run() {
        System.out.println("中配引擎跑得还行");
    }

    @Override
    public void sound() {
        System.out.println("中配引擎声音还行");
    }
}

class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("低配引擎跑得慢");
    }

    @Override
    public void sound() {
        System.out.println("低配引擎声音大");
    }
}
