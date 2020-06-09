package com.bigdataBC.Adapter;
/**
 * @Author 大数据编程
 * 适配器（类适配器）
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}