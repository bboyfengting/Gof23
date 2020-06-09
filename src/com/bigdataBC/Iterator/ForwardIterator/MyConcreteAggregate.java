package com.bigdataBC.Iterator.ForwardIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 */
public class MyConcreteAggregate {

    private List<Object> list=new ArrayList<>();

    public void addObject(Object object){
        this.list.add(object);
    }

    public void removeObject(Object object){
        this.list.remove(object);
    }

    public List<Object> getList(){
        return list;
    }

    public void setList(List<Object> list){
        this.list=list;
    }

    //获得迭代器
    public MyIterator createMyIterator(){
        return new ConcreteInterator();
    }

    /**
     * 使用内部类定义迭代器，可以直接使用外部类的属性
     */
    public class ConcreteInterator implements MyIterator {
        //游标
        private int cusor;

        @Override
        public void first() {
            cusor=0;
        }

        @Override
        public void next() {
            if(cusor<list.size()){
                cusor++;
            }
        }

        @Override
        public boolean hasNext() {
            if(cusor<list.size()){
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return cusor==0?true:false;
        }

        @Override
        public boolean isLast() {
            return cusor==(list.size()-1)?true:false;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cusor);
        }
    }
}