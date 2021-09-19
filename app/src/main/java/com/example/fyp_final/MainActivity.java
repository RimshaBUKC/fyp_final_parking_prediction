package com.example.fyp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Activity3intent =new Intent(MainActivity.this,Activity3.class);
                        startActivity(Activity3intent);
                finish();
            }
        },SPLASH_TIME_OUT);
        getSupportActionBar().hide();
    }

}