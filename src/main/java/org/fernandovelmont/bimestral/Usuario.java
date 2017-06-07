/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fernandovelmont.bimestral;

/**
 *
 * @author Fernandodaniel
 */
public class Usuario {

    public Usuario() {
    }
    
    private String nombre;
    private String paterno;
    private int edad;

    public Usuario(String nombre, String paterno, int edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
