package com.lft.search;

/**
 * 顺序查找的存储结构可以是顺序表，也可以是链表
 * 逐个比较查询，如果找到返回数据或者索引，如果最后也没有找到，返回null
 * 在各个结点查找概率相同的情况下，默认查询长度为一半长度，所以
 * T(n)=O(n)
 * S(n)=O(1)
 *
 * 功能：在分数中查询指定分数的索引
 */
public class TestSearch {
    public static void main(String[] args) {
        //给定分数数组
        int[] scoreArr={89,45,78,45,100,98,86,100,65};
        //给定要查找的分数
        int score=65;
        //完成查找
        int index=search(scoreArr,score);

        //输出结果
        if(index==-1){
            System.out.println("不存在该分数");
        }else{
            System.out.println(score+"的索引是："+index);
        }
    }

    public static int search(int[] arr,int key){
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        return index;
    }
}
