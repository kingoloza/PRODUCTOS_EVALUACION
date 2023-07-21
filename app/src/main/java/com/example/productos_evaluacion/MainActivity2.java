package com.example.productos_evaluacion;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.listaspractica.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();

        if (b != null) {
            String tit = b.getString("tit");
            String price = b.getString("price");
            String canti = b.getString("canti");
            String imag = b.getString("imag");


            TextView titTextView = findViewById(R.id.nombreTextView);
            TextView priceTextView = findViewById(R.id.precioTextView);
            TextView cantiTextView = findViewById(R.id.categoriaTextView);

            ImageView imagImageView = findViewById(R.id.imageView2);


            titTextView.setText("producto: "+tit);
            priceTextView.setText("Total a Pagar: "+price);
            cantiTextView.setText("Categoria: "+canti);

            RequestOptions requestOptions = new RequestOptions()
                    .diskCacheStrategy(DiskCacheStrategy.ALL);
            Glide.with(this)
                    .load(imag)
                    .apply(requestOptions)
                    .into(imagImageView);
        }


        }


    }


   /* @Override
    public void processFinish(String result) throws JSONException {
        JSONArray jsonArray = new JSONArray(result);
        ArrayList<revista> lstrevista = revista.JsonObjectsBuild(jsonArray);
        AdaptadorRevista adaptadorUsuario = new AdaptadorRevista(this, lstrevista);
        LstOpciones.setAdapter(adaptadorUsuario);

    }*/
