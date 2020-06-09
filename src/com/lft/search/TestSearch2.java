package com.lft.search;

/**
 * 折半查找又称二分查找，这种查找方法需要待查的查找表满足两个条件
 * 1.查找表必须使用顺序存储结构
 * 2.查找表必须按关键字大小有序排列
 */
public class TestSearch2 {
    public static void main(String[] args) {
        //给定数组
        int[] array={1,2,3,4,5,6,7,8,9,10};

        //给定要查找的值
        int key=10;

        //进行折半（二分）查找<非递归>
        int index=binarySearch(array,key);

        //进行折半（二分）查找<递归>
        //int index=searchRecursive(array,key);

        //输出结果
        if(index==-1){
            System.out.println("不存在该分数");
        }else{
            System.out.println(key+"的索引是："+index);
        }
    }
    /*
     *1.不使用递归
     * T(n)=O(log(下标2)n)
     * S(n)=O(1)
     */
    public static int binarySearch(int[] arr,int k){
        //指定low和high
        int low=0;
        int high=arr.length-1;

        //折半查找
        while(low<=high){
            //每次换完low或high都要求一下mid
            int mid=(low+high)/2;

            //判断是否等于
            if(k==arr[mid]){
                return mid;
            }else if(k<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    /*
     * 2.使用递归
     * T(n)=O(log(下标2)n)
     * S(n)=O(1*log(下标2)n)=O(log(下标2)n)，占空间较多，所以用非递归的
     */
    public static int searchRecursive(int[] arr,int k){
        //指定low和high
        int low=0;
        int high=arr.length-1;
        return searchRecursive(arr,k,low,high);
    }
    public static int searchRecursive(int[] arr,int k,int low,int high){
        //递归的结束条件
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(k==arr[mid]){
            return mid;
        }else if(k<arr[mid]){
            return searchRecursive(arr,k,low,mid-1);
        }else{
            return searchRecursive(arr,k,mid+1,high);
        }
    }
}
