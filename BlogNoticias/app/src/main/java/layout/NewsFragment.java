package layout;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.List;


import com.marcioalexfig.blognoticias.modelo.Noticia;

import io.fabric.sdk.android.Fabric;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {
    ListView minhaView;
    List<Noticia> lista;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         minhaView = (ListView) inflater.inflate(R.layout.fragment_news, container, false);

        //Configurando Twitter
        TwitterAuthConfig authConfig =  new TwitterAuthConfig("consumerKey", "consumerSecret");
        Fabric.with(this, new Twitter(authConfig));



        lista = new ArrayList<Noticia>();

        criaInstanciasTemp();

        minhaView.setAdapter(new MeuAdapter());

        minhaView.setOnItemClickListener( new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Noticia n = lista.get(position);
                String link = n.getLink();
                abrirBrowser(link);
            }
        });


        return minhaView;
    }

    private void abrirBrowser(String link) {
        Intent in = new Intent (Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(in);
    }


    private void criaInstanciasTemp(){

        Noticia n1 = new Noticia();
        n1.setTitulo("Amor é prato cozido em fogo lento");
        n1.setLink("http://obviousmag.org/cinema_pensante/2016/05/amor-e-prato-cozido-em-fogo-lento-a-pressa-em-ter-alguem-forma-os-pares-mais-absurdos.html");
        n1.setImageLink("http://cms5.obviousmag.org/mt-static/support/assets_c/2016/05/SIL%20%282%29-1-thumb-200x200-147202.jpg");
        Noticia n2 = new Noticia();
        n2.setTitulo("Carta Aberta à Procrastinação");
        n2.setLink("http://lounge.obviousmag.org/inquietacao_cronica/2015/03/carta-aberta-a-procrastinacao.html");
        n2.setImageLink("http://cms5.obviousmag.org/mt-static/support/assets_c/2015/04/11006368_10202658045932817_2531353022379700899_n-thumb-200x200-104817.jpg");
        Noticia n3 = new Noticia();
        n3.setImageLink("http://cms5.obviousmag.org/mt-static/support/assets_c/2016/05/1923591_10153923827659175_3885235225993114006_n-thumb-200x200-147946.jpg");
        n3.setLink("http://obviousmag.org/ser_pensante_nessa_vida_errante/2016/a-vida-como-voce-quiser-viver.html");
        n3.setTitulo("A vida como você quiser viver");

        lista.add(n1);lista.add(n2);lista.add(n3);

    }


    private class MeuAdapter extends BaseAdapter {

        @Override
        public int getCount() {return lista.size();}

        @Override
        public Object getItem(int position) {
            return lista.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View minhaLinha = getActivity().getLayoutInflater().inflate(R.layout.linha,null);

            TextView texto = (TextView) minhaLinha.findViewById(R.id.textoLinha);
            texto.setText(lista.get(position).getTitulo());

            ImageView im = (ImageView) minhaLinha.findViewById(R.id.imageViewPicasso);
            Picasso.with(getActivity()).load(lista.get(position).getImageLink()).into(im);

            return minhaLinha;
        }
    }

}



