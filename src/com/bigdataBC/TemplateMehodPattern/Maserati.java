package com.bigdataBC.TemplateMehodPattern;
//玛莎
public class Maserati extends TemplateMethod {
    //按喇叭才会响
    private boolean whistleFlag=false;

    @Override
    protected void startCar() {
        System.out.println("玛莎拉蒂start");
    }

    @Override
    protected void startEngine() {
        System.out.println("玛莎拉蒂启动引擎");
    }

    @Override
    protected void whistle() {
        System.out.println("玛莎拉蒂鸣笛");
    }

    @Override
    protected void stopCar() {
        System.out.println("玛莎拉蒂stop");
    }

    @Override
    protected boolean isWhistle() {
        return this.whistleFlag;
    }

    //鸣笛按钮，按了就是true,不按就是false
    public void setWhistleFlag(Boolean Flag){
        this.whistleFlag=Flag;
    }
}
