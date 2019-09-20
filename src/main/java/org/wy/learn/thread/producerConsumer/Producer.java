package org.wy.learn.thread.producerConsumer;

public class Producer implements Runnable {


    private Storage storage;
    private int produceNum;

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
                produce(produceNum);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Producer(Storage storage, int produceNum) {
        this.storage = storage;
        this.produceNum = produceNum;
    }

    public void produce(int num) throws InterruptedException {
        storage.produce();
    }

}
