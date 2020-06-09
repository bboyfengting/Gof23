package com.bigdataBC.Flyweight;

public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1=ChessFactory.getChess("馬");
        ChessFlyWeight chess2=ChessFactory.getChess("馬");
        System.out.println(chess1==chess2);

        //定义棋子位置（非共享）
        System.out.println("定义棋子位置");
        chess1.show(new Coordinate(10,20));
        //移动棋子
        chess2.show(new Coordinate(20,40));
    }
}
