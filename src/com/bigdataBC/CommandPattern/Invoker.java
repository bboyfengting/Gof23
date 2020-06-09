package com.bigdataBC.CommandPattern;

/**
 * 请求的发送者，它通过命令对象来执行请求
 * 一个调用者并不需要在设计时确定其接受者，因此它只与抽象命令类之间存在关联
 * 在程序运行时，将调用命令对象的execute()，间接调用接受者的相关操作
 */
public class Invoker {

    private Command command;
    /**
     * 需求多的时候可以通过容器List<Command>容纳很多命令对象，进行批处理
     * 数据库底层的事务管理就是类似的结构
     */
    public Invoker(Command command) {
        this.command = command;
    }

    //业务方法：用于调用命令类的方法
    public void call(){
        command.execute();
    }
}