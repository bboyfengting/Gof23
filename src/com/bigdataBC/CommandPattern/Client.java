package com.bigdataBC.CommandPattern;

/**
 * 客户类
 * 在客户类中需要创建调用者对象、具体命令类对象
 * 在创建具体命令对象时指定对应的接受者
 * 发送者和接收者之间没有直接关系，都通过命令对象间接调用
 */
public class Client {
    public static void main(String[] args) {
        ConcreteCommand concreteCommand = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(concreteCommand);
        invoker.call();
    }
}