package com.example.notify.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dw322 on 2018/5/23.
 */

public class DynanicProxy implements InvocationHandler {
    private Object object;

    public DynanicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
