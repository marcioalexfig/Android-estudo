package com.marcioalexfig.blognoticias.modelo;

/**
 * Created by alex on 25/05/2016.
 */
public class Noticia {

    String titulo;
    String link;
    String imageLink;

    public Noticia() {}

    public Noticia(String titulo, String link, String imageLink) {
        this.titulo = titulo;
        this.link = link;
        this.imageLink = imageLink;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLink() {
        return link;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
