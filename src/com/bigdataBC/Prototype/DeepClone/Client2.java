package com.bigdataBC.Prototype.DeepClone;

import java.util.Date;
/**
 * 原型模式(深复制)
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        // 大雄说要一辆玛莎
        // 第一辆玛莎生产日期
        Date productionDate=new Date(123L);
        // 生产一辆玛莎
        Car2 car1=new Car2("玛莎拉蒂",productionDate);
        // 拿镜子clone一辆
        //实现深复制。car2对象的productionDate是一个新对象！
        Car2 car2=(Car2) car1.clone();

        System.out.println(car1);
        System.out.println(car1.getName());
        System.out.println(car1.getProductionDate());
        //在克隆的基础上做修改，这次是深层的，各自指向各自的date对象
        productionDate.setTime(456456456L);
        System.out.println(car1.getProductionDate());
        // 把clone的命名为玛莎plus
        car2.setName("玛莎plus");
        System.out.println(car2);
        System.out.println(car2.getName());
        System.out.println(car2.getProductionDate());
    }
}
