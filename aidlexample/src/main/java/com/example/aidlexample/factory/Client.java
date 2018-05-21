package com.example.aidlexample.factory;

import android.app.Instrumentation;

import java.util.ArrayList;

/**
 * Created by dw322 on 2018/5/20.
 */

public class Client {
    public static void main(String[] args) {
//        AudiFactory audiFactory = new AudiCarFactory();
//        AudiQ3 audiQ3 = audiFactory.createAudiCar(AudiQ3.class);
//        audiQ3.driver();
//        audiQ3.selfNavigation();
//
//        ArrayList arrayList = new ArrayList();
//        arrayList.iterator();
//        int[] arrs = {8, 5, 6, 2, 1, 4, 7};
//        order(arrs);
    }

    private static void order(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] > arrs[j]) {
                    int temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
    }
}
