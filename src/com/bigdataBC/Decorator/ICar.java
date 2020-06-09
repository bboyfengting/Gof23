package com.bigdataBC.Decorator;
//抽象构件
public interface ICar {
    void run();
}
//ConcreteComponent具体构建角色（真实对象）
class Car implements ICar{
    @Override
    public void run() {
        System.out.print("能在陆地上跑，");
    }
}
//Decorator装饰角色
class SuperCar implements ICar{
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void run() {
        car.run();
    }
}
//ConcreteDecorator具体装饰角色
class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("还能在天上飞");
    }

    public void run(){
        super.run();
        fly();
    }
}
//ConcreteDecorator具体装饰角色
class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("还能在水里游");
    }

    public void run(){
        super.run();
        swim();
    }
}
