package com.lft.linetable;
/*单链表*/
public class Node {
//    private Object data;//要存储的数据
//    private Node next;
    //本来应该私有化的，这里为了方便用public
    Object data;
    Node next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
