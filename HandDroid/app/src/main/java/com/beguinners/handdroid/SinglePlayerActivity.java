package com.beguinners.handdroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SinglePlayerActivity extends AppCompatActivity {

    final String texto = "ALINE";
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

    }

    public void verificaLetra(View v){
        EditText editTextLetra = (EditText) findViewById(R.id.editTextLetra);
        String t = new String ();
        if (!editTextLetra.getText().equals(null)){
            t = editTextLetra.getText().toString();
        }
        if ( t.length() == 0 ) {
            Toast.makeText(this,"Digite uma letra", Toast.LENGTH_SHORT).show();
        } else {
            comparaTexto(t);
            editTextLetra.setText("");
        }
    }

    public void comparaTexto(String t){
        t = t.toUpperCase();
        Character c = t.toCharArray()[0];
        boolean existe = false;
        for (int i = 0; i < texto.length(); ++i){

            if (c == texto.charAt(i) ){
                existe = true;
                if (i==0){
                    TextView textoA = (TextView) findViewById(R.id.textoA);
                    textoA.setText(t);
                }else if (i==1) {
                    TextView textoB = (TextView) findViewById(R.id.textoB);
                    textoB.setText(t);
                }else if (i==2) {
                    TextView textoC = (TextView) findViewById(R.id.textoC);
                    textoC.setText(t);
                }else if (i==3) {
                    TextView textoD = (TextView) findViewById(R.id.textoD);
                    textoD.setText(t);
                }else if (i==4) {
                    TextView textoE = (TextView) findViewById(R.id.textoE);
                    textoE.setText(t);
                }
            }

        }
        if (!existe) {

            contador++;
            TextView letraErrada = (TextView) findViewById(R.id.letrasErradas);
            String textoAntigo = (String) letraErrada.getText();
            letrasErradas(textoAntigo, t);
            enforcaAndroid();
        }
    }

    public void letrasErradas(String textoAntigo, String novaLetra){

        TextView letraErrada = (TextView) findViewById(R.id.letrasErradas);

        if (!textoAntigo.equals(null)){

            letraErrada.setText(textoAntigo+novaLetra);

        }

    }

    public void enforcaAndroid(){
        ImageView im = (ImageView) findViewById(R.id.imageView);
        if (contador==1){
            im.setImageResource(R.drawable.hangdroid_1);
        }else if (contador==2) {
            im.setImageResource(R.drawable.hangdroid_2);
        }else if (contador==3) {
            im.setImageResource(R.drawable.hangdroid_3);
        }else if (contador==4) {
            im.setImageResource(R.drawable.hangdroid_4);
        }else if (contador==5) {
            im.setImageResource(R.drawable.hangdroid_5);
        }else if (contador==6) {
            im.setImageResource(R.drawable.game_over);
            LinearLayout lay = (LinearLayout)findViewById(R.id.linearLayout);
            lay.setVisibility(View.INVISIBLE);
        }
    }

}
