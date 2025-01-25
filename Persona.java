package com.mycompany.persona;
import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private int edad;
    private String correo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre:"));
        persona.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:")));
        persona.setCorreo(JOptionPane.showInputDialog("Ingresa tu correo electrónico:"));

        JOptionPane.showMessageDialog(null, "Nombre: " + persona.getNombre() +
            "\nEdad: " + persona.getEdad() + "\nCorreo: " + persona.getCorreo());
    }
}
