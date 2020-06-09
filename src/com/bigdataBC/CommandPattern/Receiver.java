package com.bigdataBC.CommandPattern;
/**
 * 接收者
 * 执行与请求相关的操作，具体实现对请求的业务处理
 */
public class Receiver {

    /**
     * 命令的实际执行方法
     * 根据实际业务需求进行定义
     */
    public void action(){
        System.out.println("Receiver.action()");
    }
}