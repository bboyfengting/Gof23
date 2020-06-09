package com.bigdataBC.ChainOfResponsibility;

public class Director extends Leader {

    public Director(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveInformation leaveInformation) {
        if(leaveInformation.getLeaveDays()<3){
            System.out.println("员工--"+leaveInformation.getWorkerName()+"请假"+leaveInformation.getLeaveDays()+"天，原因"+leaveInformation.getLeaveReason());
            System.out.println("主任--"+this.leaderName+":批准！！");
        }else{
            if(this.nextLeader!=null){
                System.out.println("主任：权限不够--转交给--"+this.nextLeader.leaderName);
                this.nextLeader.handleRequest(leaveInformation);
            }
        }
    }
}
