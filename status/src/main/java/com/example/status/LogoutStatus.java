package com.example.status;

import android.content.Context;
import android.content.Intent;

/**
 * Created by dw322 on 2018/5/21.
 */

public class LogoutStatus implements UserState {
    @Override
    public void forward(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context) {
        Intent it = new Intent(context, LoginActivity.class);
        context.startActivity(it);
    }

    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }
}
