package com.bigdataBC.Flyweight;

import java.util.HashMap;
import java.util.Map;

//享元工厂类
public class ChessFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map=new HashMap<>();

    public static ChessFlyWeight getChess(String name){
        if(map.get(name)!=null){
            return map.get(name);
        }else{
            ChessFlyWeight chessFlyWeight=new ConcreteChess(name);
            map.put(name,chessFlyWeight);
            return chessFlyWeight;
        }
    }
}
