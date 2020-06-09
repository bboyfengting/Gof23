package com.bigdataBC.Proxy;

public class Client {
    public static void main(String[] args) {
        Star realStar=new RealStar();
        ProxyStar proxyStar=new ProxyStar(realStar);

        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();
        proxyStar.sing();
        proxyStar.collectMoney();
    }
}
