package com.Lesson052t;

public class Counter implements Runnable {
    Count count;

    public Counter(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (count) {
                count.add();
                count.notifyAll();
            }
        }

    }
}
