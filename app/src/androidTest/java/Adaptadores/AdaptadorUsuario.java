package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.listaspractica.R;

import java.util.ArrayList;

import Modelos.Usuario;

public class AdaptadorUsuario extends ArrayAdapter<Usuario> {
    public AdaptadorUsuario(Context context, ArrayList<Usuario> datos) {
        super(context, R.layout.lylista, datos);

    }


    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lylista, null);
        TextView lblNombre = (TextView) item.findViewById(R.id.lbltitulo);
        lblNombre.setText("Titulo: "+getItem(position).getTitulo());
        TextView lblprice = (TextView) item.findViewById(R.id.lblprice);
        lblprice.setText("Precio: "+getItem(position).getPrecio());
        TextView lblcatego = (TextView) item.findViewById(R.id.lblcategori);
        lblcatego.setText("Categoria: "+getItem(position).getCategoria());
        ImageView imageView = (ImageView) item.findViewById(R.id.img1);
        Glide.with(this.getContext())
                .load(getItem(position).getImagen())
                .into(imageView);
        return item;
    }
}
