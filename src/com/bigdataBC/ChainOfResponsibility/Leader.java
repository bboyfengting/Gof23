package com.bigdataBC.ChainOfResponsibility;
/**
 * 领导抽象类
 */
public abstract class Leader {
    //领导姓名
    protected String leaderName;
    //责任链上的后继对象
    protected Leader nextLeader;

    public Leader(String leaderName) {
        this.leaderName = leaderName;
    }
    //设置责任链后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //处理请求的核心业务方法
    public abstract void handleRequest(LeaveInformation leaveInformation);
}
