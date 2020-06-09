package com.lft.linetable;

public class SingleLinkedList implements List {

    private Node head=new Node();//头结点，不存储数据，为了编程方便
    private int size;//一共有几个节点

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        //和顺序表不一样，不能通过索引直接计算定位，而需要从头结点开始进行查找
        Node p=head;
        for(int j=0;j<=i;j++){
            p=p.next;
        }
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {
        return indexOf(e)>=0;
    }

    @Override
    public int indexOf(Object e) {
        Node p=head;
        for(int j=0;j<size;j++){
            p=p.next;
            if(p.data.equals(e)){
                return j;
            }
        }
        return -1;
    }

    @Override
    public void add(int i, Object e) {
        //如果i的位置错误报异常
        if(i<0||i>size){
            throw new MyArrayIndexOutOfBoundsException("数组指针异常：："+i);
        }

        //找到前一个结点，从head结点开始移动指针
        Node p=head;
        for(int j=0;j<i;j++){
            p=p.next;
        }
        //新创建一个节点
        Node newNode=new Node();
        newNode.data=e;
//        newNode.next=null;
        //指明新节点的直接后继结点
        newNode.next=p.next;
        //指明新节点的直接前驱结点
        p.next=newNode;
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {

        //获取obj下标索引
        int index=indexOf(obj);
        //找到该结点的前一个结点，从head结点开始移动指针
        Node p=head;
        for(int j=0;j<index;j++){
            p=p.next;
        }
        //创建要插入的结点
        Node newNode=new Node(e);
        //指明新插入结点的后继结点
        newNode.next=p.next;
        //指明新插入结点的前驱结点
        p.next=newNode;
        size++;
        return true;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        //获取obj下标索引
        int index=indexOf(obj);
        //找到该节点，从head结点开始移动指针
        Node p=head;
        for(int i=0;i<=index;i++){
            p=p.next;
        }
        //创建要插入的新结点
        Node newNode=new Node(e);
        //指明新插入结点的后继结点
        newNode.next=p.next;
        //指明新插入结点的前驱结点
        p.next=newNode;
        return true;
    }

    @Override
    public Object remove(int i) {
        //索引异常判断
        if(i<0 | i>size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }
        //找到前一个结点和当前节点,从head开始移动指针
        Node p=head;
        for(int j=0;j<i;j++){
            p=p.next;
        }
        Node prenode=p;
        Node node=p.next;
        Object element=node.data;
        //安排！！
        prenode.next=node.next;
        node.next=null;
        node.data=null;
        return "元素："+element+"已经被删除";
    }

    @Override
    public boolean removeElement(Object e) {
        remove(indexOf(e));
        return true;
    }

    @Override
    public Object replace(int i, Object e) {
        if(i<0 | i>size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }
        Node p=head;
        for(int j=0;j<=i;j++){
            p=p.next;
        }
        Object element=p.data;
        p.data=e;
        return "元素替换："+element+"==>"+p.data;
    }

    @Override
    public String toString() {
        if(size==0){
            return "[]";
        }
        StringBuilder builder=new StringBuilder("[");
        Node p=head.next;
        for(int i=0;i<size;i++){
            if(i!=size-1){
                builder.append(p.data+",");
            }else{
                builder.append(p.data);
            }
            //移动指针到下一个结点
            p=p.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
