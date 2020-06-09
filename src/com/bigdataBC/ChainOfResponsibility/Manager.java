package com.bigdataBC.ChainOfResponsibility;

/**
 * 经理
 */
public class Manager extends Leader {

    public Manager(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveInformation leaveInformation) {
        if(leaveInformation.getLeaveDays()<10){
            System.out.println("员工--"+leaveInformation.getWorkerName()+"请假"+leaveInformation.getLeaveDays()+"天，原因"+leaveInformation.getLeaveReason());
            System.out.println("经理--"+this.leaderName+":批准！！");
        }else{
            if(this.nextLeader!=null){
                System.out.println("经理：权限不够--转交给--"+this.nextLeader.leaderName);
                this.nextLeader.handleRequest(leaveInformation);
            }
        }
    }
}
