package com.chyngyz.designpatterns.factorymethod;

/**
 * Created by Chyngyz on 5/20/2021.
 */

public class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 7.50;
    }
}
