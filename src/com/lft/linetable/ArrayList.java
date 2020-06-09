package com.lft.linetable;

import java.util.Arrays;

/**
 * 顺序表
 * 底层采用的数组，但是长度可以动态变化
 *
 * java.util.ArrayList每次增长50%
 */

public class ArrayList implements List {

    private Object[] elementData;//底层是一个数组，目前还没有确定长度

    private int size;//不是数组分配了几个空间，而是元素的个数

    public ArrayList(){
        //没有指定长度，默认长度是4
        this(4);
        //没有指定长度，长度是0
//        elementData=new Object[]{};
    }

    /*指定数组的初始长度*/
    public ArrayList(int initialCapacity){
        //给数组分配指定数量的空间
        elementData=new Object[initialCapacity];
        //指定顺序表的元素个数，默认是0
//        size=0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if(i<0||i>=size){
//            throw new RuntimeException("数组索引越界异常"+i);
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常"+i);
        }

        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {
//        for(int i=0;i<size;i++){
//            //逐个判断各个元素是否与要查询元素内容相同，效率低下
//            //注意不是elementData.length，而是size
//            if(e.equals(elementData[i])){
//                return true;
//            }
//        }
//        return false;
        return this.indexOf(e)>=0;
    }

    @Override
    public int indexOf(Object e) {
        for(int i=0;i<size;i++){
            //逐个判断各个元素是否与要查询元素内容相同，效率低下
            //注意不是elementData.length，而是size
            //有漏洞，如果e是null呢？使用if分别处理
            if(e.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(int i, Object e) {
        //i的位置要正确
        if(i<0||i>size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }
        //数组满了就扩容
        if(size==elementData.length){
            grow();
        }
        //后移i及其后面元素，从最后一个元素开始
        for (int j=size;j>i;j--){
            elementData[j]=elementData[j-1];
        }
        //给数组的第i个位置赋值
        elementData[i]=e;
        //元素个数加一
        size++;
//        该输出语句测试扩容过程
//        System.out.println("length=="+elementData.length);
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
    }

    private void grow(){
//            //新创建一个新的数组，长度是旧数组的二倍
//            Object[] newArr=new Object[elementData.length*2];
//            //将旧数组的数据拷贝到新数组
//            for(int i=0;i<size;i++){
//                newArr[i]=elementData[i];
//            }
//            //让elementData指向新数组
//            elementData=newArr;
        //简化上面几行为一行
        elementData= Arrays.copyOf(elementData,elementData.length*2);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        int index=indexOf(obj);
        if(elementData.length==size){
            grow();
        }
        int i=size;
        while(i>index){
            elementData[i]=elementData[i-1];
            i--;
        }
        elementData[index]=e;
        size++;
        return elementData[index]==e;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        int index=indexOf(obj)+1;
        if(elementData.length==size){
            grow();
        }
        for(int i=size;i>index;i--){
            elementData[i]=elementData[i-1];
        }
        elementData[index]=e;
        size++;
        return elementData[index]==e;
    }

    @Override
    public Object remove(int i) {
        if(i<0 | i>size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }
        Object element=elementData[i];
        for(int j=i;j<size;j++){
            elementData[j]=elementData[j+1];
        }
        size--;
        return "成功删除了元素==>"+element;
    }

    @Override
    public boolean removeElement(Object e) {
        remove(indexOf(e));
        return true;
    }

    @Override
    public Object replace(int i, Object e) {
        Object element=elementData[i];
        elementData[i]=e;
        return "元素："+element+"==>"+elementData[i];
    }

    @Override
    public String toString() {
        if(size==0){
            return "[]";
        }
        StringBuilder builder=new StringBuilder("[");
        for(int i=0;i<size;i++){
            if(i!=size-1){
//                如果不是最后一个，就追加一个逗号
                builder.append(elementData[i]+",");
            }else{
                builder.append(elementData[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
