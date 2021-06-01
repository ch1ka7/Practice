package com.chyngyz.threads;

/**
 * Created by Chyngyz on 5/29/2021.
 */

public class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
