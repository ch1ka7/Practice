package com.chyngyz.designpatterns.factorymethod;

/**
 * Created by Chyngyz on 5/20/2021.
 */

public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
