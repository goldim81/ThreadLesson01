package com.Lesson052t;

public class Count {
    volatile private int counter;

    public Integer getCounter() {
        return counter;
    }

    public void add () {
        counter++;
    }
}
