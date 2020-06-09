package com.bigdataBC.TemplateMehodPattern;

public abstract class TemplateMethod {

    /**
     * 这四个步骤不确定具体如何实现，所以延迟到子类定义
     * 1.车辆启动（如：按钮启动/钥匙启动/../....）
     * 2.引擎启动（每个车型的原理都有一定出入）
     * 3.鸣笛（滴滴/嗒嗒/叭叭/...）
     * 4.停车（不同车型的制动原理也有出入）
     */
    protected abstract void startCar();
    protected abstract void startEngine();
    protected abstract void whistle();
    protected abstract void stopCar();

    //固定流程模板方法1>>2>>3>>4
    final public void run(){
        this.startCar();
        this.startEngine();

        //喇叭根据需要开启和关闭
        if(this.isWhistle()){
            this.whistle();
        }

        this.stopCar();
    }

    //钩子方法
    protected boolean isWhistle(){
        //默认关闭鸣笛
        return false;
    }
}
