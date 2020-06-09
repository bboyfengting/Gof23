package com.bigdataBC.Facade;
//联想官方旗舰店
public interface Lenovo {
    void buyLaptop();
}

class Laptop implements Lenovo{
    @Override
    public void buyLaptop() {
        System.out.println("联想笔记本到手");
    }
}

//华为官方旗舰店
interface HuaWei{
    void buyPhone();
}

class Phone implements HuaWei{
    @Override
    public void buyPhone() {
        System.out.println("华为手机到手");
    }
}

//Apple官方旗舰店
interface Apple{
    void buyIpad();
}

class Ipad implements Apple{
    @Override
    public void buyIpad() {
        System.out.println("IPad到手");
    }
}