package Adaptadores;

/*import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.listaspractica.R;

import java.util.ArrayList;

import Modelos.revista;*/

/*public class AdaptadorRevista extends ArrayAdapter<revista> {
    public AdaptadorRevista(Context context, ArrayList<revista> datos) {
        super(context, R.layout.items1, datos);

    }


    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.items1, null);
        TextView lblNombre = (TextView) item.findViewById(R.id.lbltitulo);
        lblNombre.setText("Año: "+getItem(position).getAno());
        TextView lblval = (TextView) item.findViewById(R.id.lblprice);
        lblval.setText("Volumen: "+getItem(position).getVolumen());
        ImageView imageView = (ImageView) item.findViewById(R.id.img1);
        Glide.with(this.getContext())
                .load(getItem(position).getImagen())
                .into(imageView);
        return item;
    }
}*/
