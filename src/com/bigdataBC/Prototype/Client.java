package com.bigdataBC.Prototype;
import java.util.Date;
//大雄拿着复制镜去买车
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 大雄说要一辆玛莎
        // 第一辆玛莎生产日期
        Date productionDate=new Date(123L);
        // 生产一辆玛莎
        Car car1=new Car("玛莎拉蒂",productionDate);
        System.out.println(car1);
        System.out.println(car1.getName());
        System.out.println(car1.getProductionDate());
        //在克隆的基础上做修改，但只是浅层的
        productionDate.setTime(456456456L);
        System.out.println(car1.getProductionDate());
        // 车做好了，大雄掏出了复制镜，一照，copy一辆完全一样的玛莎plus
        Car car2=(Car) car1.clone();
        car2.setName("玛莎拉蒂plus");
        System.out.println(car2);
        System.out.println(car2.getName());
        System.out.println(car2.getProductionDate());
    }
}