package com.example.notify;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by dw322 on 2018/5/22.
 */

public abstract class Notify {
    protected Context context;
    protected NotificationManager nm;
    protected NotificationCompat.Builder builder;

    public Notify(Context context) {
        this.context = context;
        nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        builder = new NotificationCompat.Builder(context, "app");
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, NotifyActivity.class),
                        PendingIntent.FLAG_UPDATE_CURRENT));
    }

    public abstract void send();

    public abstract void cancel();
}
