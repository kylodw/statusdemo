package com.example.status;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by dw322 on 2018/5/21.
 */

public class LoginState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context,"转发微博",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context,"评论",Toast.LENGTH_SHORT).show();
    }
}
