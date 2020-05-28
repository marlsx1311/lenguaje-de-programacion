/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;



public class Usuario {
    
    
    private String Nombre;
    private String Correo;
    private String Cedula;
    private String Cargo;
    private String Telefono;
    private String Usuario;
    private String Contrasenna;
    
    
    // IDUsario Nombre Apellido Nickname Contrasena Correo Fecha_nacimiento  Nivel Rol


  
    
  

    
 public Usuario( String Nombre, String Correo, String Cedula, String Cargo, String Telefono, String Usuario, String Contrasenna){
     
     
     this.Nombre=Nombre;
     this.Correo=Correo;
     this.Cedula=Cedula;
     this.Cargo=Cargo;
     this.Telefono=Telefono;
     this.Usuario=Usuario;
     this.Contrasenna=Contrasenna;
     
     
    
}   
    public Usuario(){
    
}
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenna() {
        return Contrasenna;
    }

    public void setContrasenna(String Contrasenna) {
        this.Contrasenna = Contrasenna;
    }

   
    
    
    
    public String toString(){
       return "Usuario{ Nombre =" + Nombre +
               ", Correo =" + Correo +
               ", Cedula =" + Cedula +
               ", Cargo =" + Cargo +
               ", Telefono =" + Telefono +
               ", Usuario =" +Usuario +
               ", Contrasenna =" +Contrasenna +
               "}";
        
        
    }
 
 
}
