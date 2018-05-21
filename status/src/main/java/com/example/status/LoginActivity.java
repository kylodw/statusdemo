package com.example.status;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    private EditText mEtName;
    private EditText mEtPwd;
    private Button mBtnLogin;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginContext.getLoginContext().setUserState(new LoginState());
                Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}

