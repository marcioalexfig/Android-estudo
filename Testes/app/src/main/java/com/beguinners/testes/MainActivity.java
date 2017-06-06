package com.beguinners.testes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamaSegundaTela(View v) {
        EditText edit = (EditText) findViewById(R.id.editText);

        String texto = edit.getText().toString();

        Intent intent = new Intent(this, SegundaTelaActivity.class);

        intent.putExtra("PARAMETRO", texto);

        startActivity(intent);
    }

    public void chamaTerceiraTela (View v) {
        Intent intent = new Intent(this, TerceiraTelaActivity.class);
        startActivity(intent);
    }

    public void adicionaValores(View v) {

        SharedPreferences pref = getSharedPreferences("MINHAS_PREFERENCIAS", Context.MODE_PRIVATE);

        //text=" asdasda asd asd asd    asd asd asdas d asd asdasdasdasdas adsasdasdasd asdasdasdasdad asdasdasdasdasd adssadasdasda adsadasdasdasd asdasdasdasdasdasd asdasdasdasdasd sdasdasdasdasdasdasd asdasdasdasdasda sdasdfdfdgfdgdfg fgdfgbnh j  uyiuyiiyuiyui yuiyuiuyiyui asdasda asd asd asd    asd asd asdas d asd asdasdasdasdas adsasdasdasd asdasdasdasdad asdasdasdasdasd adssadasdasda adsadasdasdasd asdasdasdasdasdasd asdasdasdasdasd sdasdasdasdasdasdasd asdasdasdasdasda sdasdfdfdgfdgdfg fgdfgbnh j  uyiuyiiyuiyui yuiyuiuyiyui asdasda asd asd asd    asd asd asdas d asd asdasdasdasdas adsasdasdasd asdasdasdasdad asdasdasdasdasd adssadasdasda adsadasdasdasd asdasdasdasdasdasd asdasdasdasdasd sdasdasdasdasdasdasd asdasdasdasdasda sdasdfdfdgfdgdfg fgdfgbnh j  uyiuyiiyuiyui yuiyuiuyiyui asdasda asd asd asd    asd asd asdas d asd asdasdasdasdas adsasdasdasd asdasdasdasdad asdasdasdasdasd adssadasdasda adsadasdasdasd asdasdasdasdasdasd asdasdasdasdasd sdasdasdasdasdasdasd asdasdasdasdasda sdasdfdfdgfdgdfg fgdfgbnh j  uyiuyiiyuiyui yuiyuiuyiyui asdasda asd asd asd    asd asd asdas d asd asdasdasdasdas adsasdasdasd asdasdasdasdad asdasdasdasdasd adssadasdasda adsadasdasdasd asdasdasdasdasdasd asdasdasdasdasd sdasdasdasdasdasdasd asdasdasdasdasda sdasdfdfdgfdgdfg fgdfgbnh j  uyiuyiiyuiyui yuiyuiuyiyui "

        SharedPreferences.Editor editor = pref.edit();

        editor.putString("1","ALINE");
        editor.putString("2","ALEX");
        editor.putString("3","TEREZA");
        editor.putString("4","LUCIENE");
        editor.putString("5","PAULO");
        editor.putString("6","MARIO");

        editor.commit();
    }

    public void sair (View v) {
        finish();
    }

}
