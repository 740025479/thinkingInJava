package thread;

import java.util.List;

public class Producer implements Runnable{

    private List list;
    private int maxSize;
    private int produceNum;

    public Producer(List list, int maxSize) {
        this.list = list;
        this.maxSize = maxSize;
    }

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
        while (true){
            try {
                produce(produceNum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void produce(int num) throws InterruptedException {
        synchronized (list){
            while (num+list.size()>maxSize){
                list.wait();
            }
            for (int i = 0; i < num; i++) {
                list.add(new Object());
            }
            list.notifyAll();
        }
    }

}
