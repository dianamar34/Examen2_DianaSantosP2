
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
    
    
}
