package org.wy.learn.thread.producerConsumer;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage {

    private int maxSize;
    private List list;
    private BlockingQueue<Integer> blockingQueue;

    public Storage(int maxSize, List list) {
        this.maxSize = maxSize;
        this.list = list;
    }



    public void produce(int num) throws InterruptedException {
        synchronized (list) {
            while (list.size() + num > maxSize) {
                list.wait();
            }
            System.out.println("开始生产" + num + "个");
            for (int i = 0; i < num; i++) {
                list.add(i);
            }
            System.out.println("仓库现有" + list.size() + "个");
            list.notifyAll();
        }
    }

    public void consume(int num) throws InterruptedException {
        synchronized (list) {
            while (num > list.size()) {
                list.wait();
            }
            System.out.println("开始消费" + num + "个");
            for (int i = 0; i < num; i++) {
                list.remove(list.size() - 1);
            }
            System.out.println("仓库现有" + list.size() + "个");
            list.notifyAll();
        }
    }

    public Storage(int size) {
        blockingQueue = new LinkedBlockingQueue<Integer>(size);
    }

    public void produce() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                blockingQueue.offer(1);
            }
            System.out.println("仓库现有" + blockingQueue.size() + "个");
        }
    }
    public void consume() throws InterruptedException {
        while (true) {
            blockingQueue.take();
            System.out.println("仓库现有" + blockingQueue.size() + "个");
        }
    }



}
