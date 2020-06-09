package com.bigdataBC.Iterator.ForwardIterator;

public class Client {
    public static void main(String[] args) {
        MyConcreteAggregate myca = new MyConcreteAggregate();
        myca.addObject("大数据编程！");
        myca.addObject("专注技术分享！");
        myca.addObject("所有资源皆可白嫖！");

        MyIterator myIterator = myca.createMyIterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.getCurrentObj());
            myIterator.next();
        }
    }
}