package com.bigdataBC.CommandPattern;

//抽象命令类
public interface Command {

    /**
     * 实际项目中可以根据需求设计多个不同的方法
     * 这里就不详细定义了
     */
    void execute();
}