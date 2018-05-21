package com.example.aidlexample.factory;

/**
 * Created by dw322 on 2018/5/20.
 */

public class AudiQ3 extends AudiCar {
    @Override
    public void driver() {
        System.out.println("Q3启动");
    }

    @Override
    public void selfNavigation() {
        System.out.println("自动导航");
    }
}
