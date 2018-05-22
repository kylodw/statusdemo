package com.example.notify.test;

/**
 * Created by dw322 on 2018/5/23.
 */

public class Lawyer implements ILawsuit {
    private ILawsuit iLawsuit;

    public Lawyer(ILawsuit xiaoming) {
        this.iLawsuit = xiaoming;
    }

    @Override
    public void submit() {
        iLawsuit.submit();
    }

    @Override
    public void burden() {
        iLawsuit.burden();
    }

    @Override
    public void defend() {
        iLawsuit.defend();
    }

    @Override
    public void finish() {
        iLawsuit.finish();
    }
}
