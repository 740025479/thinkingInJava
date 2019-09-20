package org.wy.learn.thread.producerConsumer;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        test2();
    }


    public static void test1(){
        Storage storage = new Storage(5,new ArrayList());
        Producer producer1 = new Producer(storage,1);
        Producer producer2 = new Producer(storage,2);
        Producer producer3 = new Producer(storage,3);
        Consumer consumer1 = new Consumer(storage,5);
        Consumer consumer2 = new Consumer(storage,2);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,30, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        executor.execute(producer1);
        executor.execute(producer2);
        executor.execute(producer3);
        executor.execute(consumer1);
        executor.execute(consumer2);
    }
    public static void test2(){
        Storage storage = new Storage(5);
        Producer producer1 = new Producer(storage,1);
        Producer producer2 = new Producer(storage,2);
        Producer producer3 = new Producer(storage,3);
        Consumer consumer1 = new Consumer(storage,5);
        Consumer consumer2 = new Consumer(storage,2);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,30, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        executor.execute(producer1);
        executor.execute(producer2);
        executor.execute(producer3);
        executor.execute(consumer1);
        executor.execute(consumer2);
    }



}
