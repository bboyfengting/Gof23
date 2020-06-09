package com.bigdataBC.MediatorPattern;

import java.util.HashMap;
import java.util.Map;

//总经理
public class GeneralManager implements Mediator {
    //部门信息map
    public Map<String,Department> deptMap=new HashMap<>();

    @Override
    public void register(String deptName, Department dept) {
        deptMap.put(deptName,dept);
    }
    //指定部门名称，进行发号施令
    @Override
    public void issueorders(String deptName) {
        deptMap.get(deptName).selfWork();
    }
}
