package com.example.aidlexample.factory;

/**
 * Created by dw322 on 2018/5/20.
 */

public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clazz);
}
