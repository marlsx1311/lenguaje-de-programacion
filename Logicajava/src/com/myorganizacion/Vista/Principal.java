/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myorganizacion.Vista;

import com.myorganizacion.Controlador.LogicaPersona;


public class Principal {

    public Menu menu;
    public LogicaPersona logica;
    
    
    public Principal(){
     this.menu = new Menu(this);   
     this.logica = new LogicaPersona();  
     }
    
    public Menu getMenu(){
        return menu;
    }
   
    public static void main(String[] args) {
       Principal principal = new Principal();
       principal.getMenu().mostrarMenuPrincipal();
       
    }
    public LogicaPersona getLogica(){
        return logica;
    }
    
}
