package com.example.aidlexample.factory;

/**
 * Created by dw322 on 2018/5/20.
 */

public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clazz) {
        AudiCar audiCar = null;
        try {
            audiCar = (AudiCar) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) audiCar;
    }
}
