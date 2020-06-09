package com.lft.tree;

/**
 * 二叉链表的结点
 */
public class Node {
//    private Object value;
//    private Node leftChild;
//    private Node rightChild;为了饮用方便，先去掉private，不用谢getset方法直接调属性
    Object value;
    Node leftChild;
    Node rightChild;

    public Node(Object value) {
        this.value = value;
    }

    public Node(int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
