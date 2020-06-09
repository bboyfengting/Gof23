package com.bigdataBC.Adapter;

public class Client {
    public void testAdapter(Target target){
        target.handleReq();
    }

    public static void main(String[] args) {
        Client c1=new Client();
//        ClassAdapter classAdapter = new ClassAdapter();
//        c1.testAdapter(classAdapter);
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        c1.testAdapter(objectAdapter);
    }
}
