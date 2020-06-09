package com.bigdataBC.Prototype.DeepClone;

import java.util.Date;

public class Car2 implements Cloneable {
    private String name;
    private Date productionDate;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();
        // 添加如下代码进行深复制（deep clone）
        Car2 car=(Car2)obj;
        car.productionDate=(Date)this.productionDate.clone();//把属性也进行克隆

        return obj;
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

    public Car2() {}

    public Car2(String name, Date productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }
}
