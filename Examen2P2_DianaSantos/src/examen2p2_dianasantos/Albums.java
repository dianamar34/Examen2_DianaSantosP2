
package examen2p2_dianasantos;

import java.util.ArrayList;


public class Albums {
    protected String nombre;
    protected String artista;
    protected ArrayList<Canciones> songs = new ArrayList();

    public Albums() {
    }

    public Albums(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Canciones> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Canciones> songs) {
        this.songs = songs;
    }

    
    
    public String toString() {
        return nombre;
    }
    
    
}
