package com.bigdataBC.MementoPattern;
/**
 * 负责人类
 * 负责管理备忘录对象
 */
public class CareTaker {

    private StuMemento stuMemento;

    public StuMemento getStuMemento() {
        return stuMemento;
    }

    public void setStuMemento(StuMemento stuMemento) {
        this.stuMemento = stuMemento;
    }
}
