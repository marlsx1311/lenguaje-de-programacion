/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Marlon
 */
public class Modificar {
    
    public String [] modificar(String nombre, String raza, String edad, String nombreD, String celularD) {
        
        String[] IngresoDato = new String[5];
        
        IngresoDato[0] = nombre;
        IngresoDato[1] = raza;
        IngresoDato[2] = edad;
        IngresoDato[3] = nombreD;
        IngresoDato[4] = celularD;
        
        return IngresoDato;
    }   
}
