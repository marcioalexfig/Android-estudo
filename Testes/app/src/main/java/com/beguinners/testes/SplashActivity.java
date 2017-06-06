package com.beguinners.testes;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


//        Runnable rodaem3seg  = new Runnable() {
//            @Override
//            public void run() {
//                chamaTelaMain();
//            }
//        };
//
//        Handler delay = new Handler();
//        delay.postDelayed(rodaem3seg, 3000);

        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        chamaTelaMain();
                        finish();
                    }
                }
                , 3000);

    }

    public void chamaTelaMain () {
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }
}
