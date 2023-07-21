package Modelos;

/*public class revista {

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    private String titulo;
    private String precio;
    private String categoria;
    private String imagen;
    public revista(JSONObject a) throws JSONException {
        titulo = a.getString("title").toString();
        precio = a.getString("price").toString() ;
        categoria = a.getString("category").toString() ;
        imagen = a.getString("image").toString() ;
    }
    public static ArrayList<revista> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<revista> revistas = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            revistas.add(new revista(datos.getJSONObject(i)));
        }
        return revistas;
    }
}*/
