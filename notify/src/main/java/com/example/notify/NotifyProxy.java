package com.example.notify;

import android.content.Context;
import android.os.Build;

/**
 * Created by dw322 on 2018/5/22.
 */

public class NotifyProxy extends Notify {
    private Notify notify;

    public NotifyProxy(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            notify = new NotifyHeadsUp(context);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            notify = new NotifyBig(context);
        } else {
            notify = new NotifyNormal(context);
        }

    }

    @Override
    public void send() {
        notify.send();
    }

    @Override
    public void cancel() {
        notify.cancel();
    }
}
