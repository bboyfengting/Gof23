package com.bigdataBC.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        //来个总经理
        GeneralManager generalManager = new GeneralManager();
        //各部门来总经理办公室登记
        MarketDept marketDept = new MarketDept(generalManager);
        DevelopDept developDept = new DevelopDept(generalManager);
        FinanceDept financeDept = new FinanceDept(generalManager);
        //市场部开始工作
        marketDept.selfWork();
        //市场部需要支援
        marketDept.reqWork();
    }
}
