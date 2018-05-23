package com.example.notify.qiaojie;

/**
 * Created by dw322 on 2018/5/23.
 */

public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的"+impl+"咖啡");
    }
}
