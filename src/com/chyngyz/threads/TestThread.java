package com.chyngyz.threads;

/**
 * Created by Chyngyz on 5/26/2021.
 */

public class TestThread implements Runnable {
    int[] numbers = {1, 2, 3, 4, 5};

    @Override
    public void run() {
        for (int n : numbers) {
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
