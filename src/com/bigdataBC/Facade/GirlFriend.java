package com.bigdataBC.Facade;
//对象
public class GirlFriend {
    public void buyThree(){
        Lenovo l=new Laptop();
        HuaWei p=new Phone();
        Apple i=new Ipad();
        l.buyLaptop();
        p.buyPhone();
        i.buyIpad();
    }
}
