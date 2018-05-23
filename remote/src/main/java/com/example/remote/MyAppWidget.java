package com.example.remote;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.widget.RemoteViews;

/**
 * Created by dw322 on 2018/5/23.
 */

public class MyAppWidget extends AppWidgetProvider {
    public static final String CLICK_ACTION = "com.example.remote.action_click";

    public MyAppWidget() {
        super();
    }

    @Override
    public void onReceive(final Context context, Intent intent) {
        super.onReceive(context, intent);
        if (intent.getAction().equals(CLICK_ACTION)) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Bitmap bitmap = BitmapFactory.decodeResource(
                            context.getResources(), R.mipmap.ic_launcher_round);
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    for (int i = 0; i < 37; i++) {
                        float degree = (i * 10) % 360;
                        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.wdiget);

                        remoteViews.setImageViewBitmap(R.id.image, rotateBitmap(context, bitmap, degree));

                        Intent click = new Intent();
                        click.setAction(CLICK_ACTION);
                        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, click, 0);

                        remoteViews.setOnClickPendingIntent(R.id.image, pendingIntent);

                        appWidgetManager.updateAppWidget(new ComponentName(context, MyAppWidget.class), remoteViews);
                        SystemClock.sleep(30);
                    }
                }
            }).start();
        }
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        final int counter = appWidgetIds.length;
        for (int i = 0; i < counter; i++) {
            int appId = appWidgetIds[i];
            onWidgetUpdate(context, appWidgetManager, appId);
        }
    }

    private void onWidgetUpdate(Context context, AppWidgetManager appWidgetManager, int appId) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.wdiget);

        Intent intent = new Intent();
        intent.setAction(CLICK_ACTION);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
        remoteViews.setOnClickPendingIntent(R.id.image, pendingIntent);
        appWidgetManager.updateAppWidget(appId, remoteViews);
    }

    private Bitmap rotateBitmap(Context context, Bitmap bitmap, float degree) {
        Matrix matrix
                = new Matrix();

        matrix.reset();
        matrix.setRotate(degree);
        Bitmap degreeBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        return degreeBitmap;
    }
}
