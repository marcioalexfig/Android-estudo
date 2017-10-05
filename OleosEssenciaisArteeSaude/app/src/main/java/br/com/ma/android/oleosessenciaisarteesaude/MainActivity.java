package br.com.ma.android.oleosessenciaisarteesaude;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBase = (Button) findViewById(R.id.btn_base);

        btnBase.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           // adicionando gerenciador de fragmentos
                                           FragmentManager fragmentManager = getFragmentManager();
                                           // preparando para editar os fragmentos
                                           FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                       }
                                   }
        );
    }
}
