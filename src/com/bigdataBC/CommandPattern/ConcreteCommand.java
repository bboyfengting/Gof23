package com.bigdataBC.CommandPattern;

//具体命令类
public class ConcreteCommand implements Command {

    //持有接收者的引用
    Receiver receiver;  //命令真正的执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //可以根据业务需求定义命令执行前的相关处理
        System.out.println("receiver.beforeAction()");

        receiver.action();  //命令真正的执行

        //可以根据业务需求定义命令执行前的相关处理
        System.out.println("receiver.afterAction()");
    }
}