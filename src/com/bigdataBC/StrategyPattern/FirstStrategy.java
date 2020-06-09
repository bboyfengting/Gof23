package com.bigdataBC.StrategyPattern;

class FirstStrategy implements Strategy {
    @Override
    public void operate() {
        System.out.println("策略一：见乔国老>>吴国太给孙权施压");
    }
}

class SecondStrategy implements Strategy {

    @Override
    public void operate() {
        System.out.println("策略二：谎称祭祖求吴国太放行");
    }
}

class ThirdStrategy implements Strategy {

    @Override
    public void operate() {
        System.out.println("策略三：孙尚香断后，喝退追兵！");
    }
}
