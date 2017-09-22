package com.Lesson052t;

public class Main {

    public static void main(String[] args) {
        Count count = new Count();
        Counter counter = new Counter(count);
        Messenger messenger = new Messenger(count, (byte) 5, "Messenger1");
        Messenger messenger2 = new Messenger(count, (byte) 7, "Messenger2");

        new Thread(counter).start();
        new Thread(messenger).start();
        new Thread(messenger2).start();
    }
}
