package com.bigdataBC.singleton2;

import com.bigdataBC.singleton1.Emperor;

import java.util.concurrent.CountDownLatch;
/**
 * 测试多线程环境下五种创建单例模式的效率
 */
public class effiTest {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        //CountDownLatch：同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一 个或多个线程一直等待。
        final CountDownLatch  countDownLatch = new CountDownLatch(threadNum);

        for(int i=0;i<threadNum;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<1000000;i++){
//						Object o = Emperor.getInstance();
//						Object o = Singleton2.getINSTANCE();
//						Object o = Singleton3.getInstance();
//						Object o = Singleton4.getInstance();
                      Object o = Singleton_enum.INSTANCE;
                    }
                    //countDown()  当前线程调此方法，则计数减一(建议放在 finally里执行)
                    countDownLatch.countDown();
                }
            }).start();
        }
        //await()，调用此方法会一直阻塞当前线程，直到计时器的值为0
        countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！

        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
    }
}
