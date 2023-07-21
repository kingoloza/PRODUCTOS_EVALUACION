package com.example.productos_evaluacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listaspractica.R;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Adaptadores.AdaptadorUsuario;
import Modelos.Usuario;
import WebService.Asynchtask;
import WebService.WebService;

public class MainActivity extends AppCompatActivity implements Asynchtask, AdapterView.OnItemClickListener {
    ListView LstOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LstOpciones = (ListView)findViewById(R.id.item);
        LstOpciones.setOnItemClickListener(this);
        View header = getLayoutInflater().inflate(R.layout.header,null);
        LstOpciones.addHeaderView(header);
        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService("https://fakestoreapi.com/products",
                datos, MainActivity.this, MainActivity.this);
        ws.execute("GET");
    }


    @Override
    public void processFinish(String result) throws JSONException {
        JSONArray jsonArray = new JSONArray(result);
        ArrayList<Usuario> lstUsuarios = Modelos.Usuario.JsonObjectsBuild(jsonArray);
        AdaptadorUsuario adaptadorUsuario = new AdaptadorUsuario(this, lstUsuarios);
        LstOpciones.setAdapter(adaptadorUsuario);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Usuario use = (Usuario) parent.getItemAtPosition(position);
        String tit = use.getTitulo();
        String price = use.getPrecio();
        String canti = use.getCategoria();
        String imag = use.getImagen();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("tit", tit);
        b.putString("price", price);
        b.putString("canti", canti);
        b.putString("imag", imag);
        intent.putExtras(b);
        startActivity(intent);


    }
}