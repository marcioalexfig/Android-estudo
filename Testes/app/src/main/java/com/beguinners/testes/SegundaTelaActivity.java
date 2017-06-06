package com.beguinners.testes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        String texto = getIntent().getStringExtra("PARAMETRO");

        TextView tv = (TextView) findViewById(R.id.textView);

        tv.setText(texto);

        LinearLayout linear = (LinearLayout) findViewById(R.id.linear);

        for (int i=0; i<10; i++) {
            LinearLayout tx = (LinearLayout) getLayoutInflater().inflate(R.layout.textview, null);

            linear.addView(tx);

        }
    }
}
