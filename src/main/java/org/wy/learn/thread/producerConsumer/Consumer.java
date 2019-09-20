package org.wy.learn.thread.producerConsumer;

public class Consumer implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        try {
            while (true) {
                consume(consumeNum);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Storage storage;
    private int consumeNum;

    public Consumer(Storage storage, int consumeNum) {
        this.storage = storage;
        this.consumeNum = consumeNum;
    }

    public void consume(int num) throws InterruptedException {
        storage.consume();
    }


}
