package com.bigdataBC.Prototype;

import java.util.Date;

public class Car implements Cloneable {
    // 车名
    private String name;
    //生产日期
    private Date productionDate;

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        Object obj=super.clone();
//        return obj;
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Car() {}

    public Car(String name, Date productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }
}
