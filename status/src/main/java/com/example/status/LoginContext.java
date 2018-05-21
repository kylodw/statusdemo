package com.example.status;

import android.content.Context;

/**
 * Created by dw322 on 2018/5/21.
 */

public class LoginContext {
    UserState userState = new LogoutStatus();
    static LoginContext loginContext = new LoginContext();

    public LoginContext() {
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public static LoginContext getLoginContext() {
        return loginContext;
    }

    public void forword(Context context) {
        userState.forward(context);
    }

    public void comment(Context context) {
        userState.comment(context);
    }
}
