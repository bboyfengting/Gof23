package com.lft.stackqueue;


import java.util.Deque;
import java.util.LinkedList;

/**
 * 十进制转换为二进制
 * 一直除2倒着取余数
 */
public class TestConvert {
    public static void main(String[] args) {
        //给定一个十进制数
        int n=31;
        //把十进制数转换为二进制数
        int t=n;//被除数
//        String str="";
        //定义一个空栈
        Deque stack=new LinkedList();
        do{
            //除以2求余数
            int mod=t%2;
            //输出余数
//            System.out.println("余数："+mod);
            //入栈
            stack.push(mod);
            //除以2得到商,使用商做被除数
            t=t/2;
        }while (t>0);//商大于0
        //出栈
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
