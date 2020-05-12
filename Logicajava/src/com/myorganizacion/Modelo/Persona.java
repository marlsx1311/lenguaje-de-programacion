
package com.myorganizacion.Modelo;

import java.util.List;

public class Persona {
    private int cedula;
    private String nombres;
    private String apellido;
    private int edad;
    private List <Persona> propiedades;

    
    public Persona() {
        this.cedula = 1;
        this.nombres = "";
        this.apellido = "";
        this.edad = 1;
        
    }
    
    
    public Persona(int cedula, String nombres, String apellidos, int edad){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellido=apellido;
        this.edad=edad;
                
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Persona> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Persona> propiedades) {
        this.propiedades = propiedades;
    }

    @Override

    
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
    
}

