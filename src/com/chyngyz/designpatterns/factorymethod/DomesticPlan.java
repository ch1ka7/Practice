package com.chyngyz.designpatterns.factorymethod;

/**
 * Created by Chyngyz on 5/20/2021.
 */

public class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}
