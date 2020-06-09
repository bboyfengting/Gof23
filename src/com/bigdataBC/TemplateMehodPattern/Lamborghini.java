package com.bigdataBC.TemplateMehodPattern;
//兰博基尼
public class Lamborghini extends TemplateMethod {
    @Override
    protected void startCar() {
        System.out.println("兰博基尼start");
    }

    @Override
    protected void startEngine() {
        System.out.println("兰博基尼启动引擎");
    }

    @Override
    protected void whistle() {
        System.out.println("兰博基尼鸣笛");
    }

    @Override
    protected void stopCar() {
        System.out.println("兰博基尼stop");
    }
}
