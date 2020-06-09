package com.bigdataBC.Flyweight;
//抽象享元类
public interface ChessFlyWeight {
    //Name是象棋名字
    void setName(String n);
    String getName();
    void show(Coordinate c);
}

//具体享元类
class ConcreteChess implements ChessFlyWeight{

    private String name;

    public ConcreteChess(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void show(Coordinate coordinate) {
        System.out.println("这个棋子名字是"+this.name);
        System.out.println("位置是："+ String.format("(%d,%d)", coordinate.getX(), coordinate.getY()));
    }
}