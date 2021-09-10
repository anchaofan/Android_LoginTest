package com.example.logintest14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "tag";
    private Button btnLogin;
    private EditText etAccount,etPassword;

    private String userName = "abc";
    private String pass = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("登录");

        btnLogin = findViewById(R.id.btn_login);
        etAccount = findViewById(R.id.et_account);
        etPassword = findViewById(R.id.et_password);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = etAccount.getText().toString();
                String password = etPassword.getText().toString();

                Log.d(TAG, "onClick: -------------" + account);
                Log.d(TAG, "password: -------------" + password);

                if (account.equals(userName)) {
                    if (password.equals(pass)) {
                        Toast.makeText(MainActivity.this, "恭喜你，登陆成功！", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, "密码错误！", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "用户名错误！", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}