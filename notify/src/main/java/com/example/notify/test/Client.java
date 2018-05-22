package com.example.notify.test;

import java.lang.reflect.Proxy;

/**
 * Created by dw322 on 2018/5/23.
 */

public class Client {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test2() {
        ILawsuit xiaoming = new XiaoMing();
        DynanicProxy dynanicProxy = new DynanicProxy(xiaoming);

        ClassLoader classLoader = xiaoming.getClass().getClassLoader();

        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, dynanicProxy);

        lawyer.finish();
    }

    private static void test1() {
        ILawsuit xiaoming = new XiaoMing();
        ILawsuit lawyer = new Lawyer(xiaoming);
        lawyer.submit();
        lawyer.finish();
    }
}
