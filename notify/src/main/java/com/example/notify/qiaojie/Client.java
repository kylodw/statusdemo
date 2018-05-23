package com.example.notify.qiaojie;

/**
 * Created by dw322 on 2018/5/23.
 */

public class Client {
    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary();

        Sugar sugar = new Sugar();
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();
        SmallCoffee smallCoffee = new SmallCoffee(ordinary);
        smallCoffee.makeCoffee();
    }
}
