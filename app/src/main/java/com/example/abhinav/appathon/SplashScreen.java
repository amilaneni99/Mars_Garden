package com.example.abhinav.appathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        Thread myThread = new Thread() {

            @Override
            public void run() {
                try {
                    sleep(4000);
                    Intent intent_splash = new Intent(getApplicationContext(),SplashScreen.class);
                    startActivity(intent_splash);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
