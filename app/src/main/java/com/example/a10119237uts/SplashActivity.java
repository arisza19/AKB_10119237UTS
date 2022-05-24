package com.example.a10119237uts;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/*
Developed by AriszaZufarFathurrahman
10119237
IF6
on Tuesday, May 24 2022
*/

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,SlideActivity.class));
                finish();
            }
        }, 3000);
    }
}