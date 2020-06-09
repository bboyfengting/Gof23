package com.bigdataBC.Adapter;
/**
 * @Author 大数据编程
 * 适配器（对象适配器，使用了组合的方式跟被适配对象整合）
 */
public class ObjectAdapter implements Target {
    Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}