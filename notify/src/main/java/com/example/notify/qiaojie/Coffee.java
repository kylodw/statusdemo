package com.example.notify.qiaojie;

/**
 * Created by dw322 on 2018/5/23.
 */

public  abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();
}
