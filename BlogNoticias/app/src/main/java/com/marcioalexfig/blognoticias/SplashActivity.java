package com.marcioalexfig.blognoticias;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                chamaMain();
                finish();
            }
        }, 3000);

    }

    public void chamaMain(){
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }
}
