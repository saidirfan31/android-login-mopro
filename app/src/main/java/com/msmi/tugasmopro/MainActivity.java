package com.msmi.tugasmopro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_sign_in;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_sign_in = (Button) findViewById(R.id.btn_sign_in);
        btn_sign_in.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.tv_forgot_pwd);
        textView.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_forgot_pwd:
                Intent intent = new Intent(MainActivity.this, ForgotPwdActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_sign_in:
                Intent activity_menu = new Intent(MainActivity.this, ActivityMenu.class);
                startActivity(activity_menu);
                break;
        }
    }
}
