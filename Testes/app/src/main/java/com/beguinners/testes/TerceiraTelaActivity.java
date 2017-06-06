package com.beguinners.testes;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TerceiraTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        TextView tx = (TextView) findViewById(R.id.textViewScroll);

        SharedPreferences pref = getSharedPreferences("MINHAS_PREFERENCIAS", MODE_PRIVATE);

        String texto = pref.getString("1", "Vazio!") +
                " - " +
                pref.getString("2", "Vazio!")+
                " - " +
                pref.getString("3", "Vazio!")+
                " - " +
                pref.getString("4", "Vazio!")+
                " - " +
                pref.getString("5", "Vazio!")+
                " - " +
                pref.getString("6", "Vazio!");

        tx.setText(texto);

    }

}
