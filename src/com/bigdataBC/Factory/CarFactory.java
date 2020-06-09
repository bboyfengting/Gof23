package com.bigdataBC.Factory;

public class CarFactory {
    public static Car createCar(String name){
        if(name.equals("玛莎拉蒂")){
            return new Maserati();
        }else if(name.equals("兰博基尼")){
            return new Lamborghini();
        }else{
            return null;
        }
    }
}
