package lab9p2_franciscogarcia;

import java.util.ArrayList;

public class Persona {
    
    int edad;
    String nombre, contraseña, correo;
    ArrayList <Persona> amigos = new ArrayList();

    public Persona() {
    }

    public Persona(int edad, String nombre, String contraseña, String correo) {
        this.edad = edad;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Persona> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Persona> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
}
