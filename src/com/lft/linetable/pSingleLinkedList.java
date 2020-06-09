package com.lft.linetable;

/**
 * 单链表
 * @author Administrator
 *
 */
public class pSingleLinkedList implements List{

    public Node head = new Node();//只有一个头结点

    public int size;//默认长度是0，头结点不算

    public pSingleLinkedList(){

    }

    @Override
    public int size() {

        return size;
    }
    /**
     * 和数组可是不一样了！！！
     */
    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return this.indexOf(e)>=0;
    }

    @Override
    public int indexOf(Object e) {
        Node p = head.getNext();
        for(int i = 0 ;i<size;i++){
            //取出当前结点的值
            Object data = p.getData();
            //判断是否相同
            if(e.equals(data)){
                return i;
            }
            //移动指针
            p = p.getNext();
        }

        return -1;
    }

    @Override
    public void add(int i, Object e) {
        //判断i的范围，提高健壮性
        if(i<0 || i>size){
            throw new IndexOutOfBoundsException("索引越界异常："+i);
        }
        //定位到前一个结点
        Node p = head;
        for(int j = 0 ;j<i;j++){
            p = p.getNext();
        }

        //创建一个新结点
        Node s = new Node();
        s.setData(e);

        //完成添加操作
        s.setNext(p.getNext());//指明新结点的后继
        p.setNext(s);//指明新结点的前驱（其实是指明前驱结点的后继是新结点）

        //size增1
        size++;
    }


    @Override
    public void add(Object e) {
        int i = this.size;
        this.add(i,e);

    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {

        return null;
    }

    @Override
    public boolean removeElement(Object e) {
        //先确定前驱结点和要删除结点
        Node p = head;
        Node s = head.getNext();
        boolean flag = false;//默认该结点不存在
        while(s!= null ){
            //判断是否找到
            if(e.equals(s.getData())){
                flag = true;
                break;
            }
            //如果没有找到，移动指针到后一个结点
            p = s;
            s = s.getNext();
        }
        //如果找到，就删除
        if(flag){
            p.setNext(s.getNext());
            s.setNext(null);
            s =null;
        }
        return flag;

    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node p = head.getNext();
        while(p!=null){
            //取出结点值
            Object data = p.getData();
            //加入StringBuffer
            builder.append(data+",");
            //后移一个结点
            p = p.getNext();
        }
        //删除最后的一个逗号
        if(builder.length()>1){
            builder.deleteCharAt(builder.length()-1);
        }
        builder.append("]");

        return builder.toString();
    }
}