
package com.myorganizacion.Controlador;

import com.myorganizacion.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LogicaPersona {
    private List<Persona> listapersona;

    public LogicaPersona() {
        this.listapersona = new ArrayList<>();
    }
    
    public boolean registrarEstudiante(Persona estudiante){
        for (int i =0; i< listapersona.size(); i++){
            if(listapersona.get(i).getCedula()==estudiante.getCedula()){
                return false;
            }
        }listapersona.add(estudiante);
        return true;
    }
    
    public List<Persona>listarEstudiantes(){
        return listapersona;
    }
    
    public Persona busquedaEstudiante (int cedula){
        Persona cualquiera = null;
        for (int i = 0; i<listapersona.size(); i++) {
            if (cedula == listapersona.get(i).getCedula()){
               cualquiera = listapersona.get(i);
            }
            
        }return cualquiera;
    }
    
    public boolean editarEstudiante(int cedula,int cedulaModificar, String nombre, String apellido, int edad){
        for (int i = 0; i<listapersona.size(); i++) {
            if (listapersona.get(i).getCedula() == cedula){
                listapersona.get(i).setCedula(cedulaModificar);
                listapersona.get(i).setNombres(nombre);
                listapersona.get(i).setApellido(apellido);
                listapersona.get(i).setEdad(edad);
                return true;
            }
        }return false;
    
}
      public boolean borrarEstudiante (int cedula){
        
        for (int i = 0; i<listapersona.size(); i++) {
            if (cedula == listapersona.get(i).getCedula()){
                listapersona.remove(i);
            }return true;
            
        }return false;
    }
    
}


