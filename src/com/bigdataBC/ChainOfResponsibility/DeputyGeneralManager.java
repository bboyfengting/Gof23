package com.bigdataBC.ChainOfResponsibility;

/**
 * 副总经理
 */
public class DeputyGeneralManager extends Leader {

    public DeputyGeneralManager(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveInformation leaveInformation) {
        if(leaveInformation.getLeaveDays()<20){
            System.out.println("员工--"+leaveInformation.getWorkerName()+"请假"+leaveInformation.getLeaveDays()+"天，原因"+leaveInformation.getLeaveReason());
            System.out.println("副总经理经理--"+this.leaderName+":批准！！");
        }else{
            if(this.nextLeader!=null){
                System.out.println("副总经理：权限不够--转交给--"+this.nextLeader.leaderName);
                this.nextLeader.handleRequest(leaveInformation);
            }
        }
    }
}
