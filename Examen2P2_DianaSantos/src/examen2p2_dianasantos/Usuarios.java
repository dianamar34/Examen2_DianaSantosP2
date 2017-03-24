
package examen2p2_dianasantos;

import java.util.ArrayList;


public class Usuarios {
    protected String nombre;
    protected String username;
    protected int edad;
    protected String pass;
    protected ArrayList playlist = new ArrayList();
    protected ArrayList favoritos = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String username, int edad, String pass) {
        this.nombre = nombre;
        this.username = username;
        this.edad = edad;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
}
