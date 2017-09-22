package com.Lesson052t;

public class Messenger implements Runnable {
    Count counter;
    byte timer;
    final String name;

    public Messenger(Count c, byte t, String name) {
        this.counter = c;
        this.timer = t;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (counter) {
                try {
                    counter.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (counter.getCounter() % timer == 0) {
                    System.out.println(name + ": " + counter.getCounter());
                }
            }
        }
    }
}
