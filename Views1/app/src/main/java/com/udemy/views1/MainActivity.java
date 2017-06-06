package com.udemy.views1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBotao1(View v){

        Log.i("MINHA TAG","Metodo sendo executado");

        View texto = findViewById(R.id.texto1);
        if (texto.getVisibility() == View.VISIBLE){
            texto.setVisibility(View.INVISIBLE);
        } else if (texto.getVisibility() == View.INVISIBLE) {
            texto.setVisibility(View.VISIBLE);
        }

    }
}
