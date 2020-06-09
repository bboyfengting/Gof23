package com.bigdataBC.ChainOfResponsibility;

/**
 * 总经理
 */
public class GeneralManager extends Leader {

    public GeneralManager(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveInformation leaveInformation) {
        if(leaveInformation.getLeaveDays()<30){
            System.out.println("员工--"+leaveInformation.getWorkerName()+"请假"+leaveInformation.getLeaveDays()+"天，原因："+leaveInformation.getLeaveReason());
            System.out.println("总经理--"+this.leaderName+"：批准！！");
        }else {
            System.out.println("总经理--"+this.leaderName+"拉出去斩首示众！！");
        }
    }
}
