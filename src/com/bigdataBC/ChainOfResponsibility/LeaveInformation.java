package com.bigdataBC.ChainOfResponsibility;
/**
 * 请假信息封装类
 */
public class LeaveInformation {
    //员工姓名
    private String workerName;
    //请假原因
    private String leaveReason;
    //请假天数
    private int leaveDays;

    public LeaveInformation(String workerName, String leaveReason, int leaveDays) {
        this.workerName = workerName;
        this.leaveReason = leaveReason;
        this.leaveDays = leaveDays;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
