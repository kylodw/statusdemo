package com.example.notify.qiaojie;

/**
 * Created by dw322 on 2018/5/23.
 */

public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的"+impl+"咖啡");
    }
}
