package com.example.notify;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;

/**
 * Created by dw322 on 2018/5/22.
 */

public class NotifyHeadsUp extends Notify {
    public NotifyHeadsUp(Context context) {
        super(context);
    }

    @Override
    public void send() {
        Notification n = builder.build();
        n.contentView = new RemoteViews(context.getPackageName(),
                R.layout.remote_notify_proxy_normal);


            n.bigContentView = new RemoteViews(context.getPackageName(),
                    R.layout.remote_notify_proxy_big);

            n.headsUpContentView = new RemoteViews(context.getPackageName(),
                    R.layout.remote_notify_proxy_normal);
        nm.notify(0, n);
    }

    @Override
    public void cancel() {
        nm.cancel(0);
    }
}
