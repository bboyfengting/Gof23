package com.bigdataBC.StrategyPattern;

public class ZhaoYun {
    public static void main(String[] args) {

        System.out.println("到达东吴，拆第一个");
        new Context(new FirstStrategy()).getStrategy();

        System.out.println("乐不思蜀，拆第二个");
        new Context(new SecondStrategy()).getStrategy();

        System.out.println("遭遇围追堵截，拆第三个");
        new Context(new ThirdStrategy()).getStrategy();
    }
}
