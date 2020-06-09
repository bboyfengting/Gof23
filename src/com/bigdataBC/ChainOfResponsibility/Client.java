package com.bigdataBC.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Director director = new Director("三当家");
        Manager manager = new Manager("二当家");
        GeneralManager generalManager = new GeneralManager("大当家");

        //组织责任链对象关系
        director.setNextLeader(manager);
        manager.setNextLeader(generalManager);

        System.out.println("胡汉三给主任请假");
        LeaveInformation leaveInformation1 = new LeaveInformation("胡汉三", "回家娶媳妇", 15);
        director.handleRequest(leaveInformation1);

        System.out.println("西门庆给主任请假");
        //西门庆填写请假信息
        LeaveInformation leaveInformation2 = new LeaveInformation("西门庆", "私会潘金莲", 30);
        director.handleRequest(leaveInformation2);
    }
}
