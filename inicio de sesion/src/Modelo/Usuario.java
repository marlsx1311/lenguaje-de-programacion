/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;



public class Usuario {
    
    private int IDUsario;
    private String Nombre;
    private String Apellido;
    private String Nickname;
    private String Contrasena;
    private String Correo;
    private Date Fecha_nacimiento;
    private int Nivel;
    private int Rol;
    
    
    // IDUsario Nombre Apellido Nickname Contrasena Correo Fecha_nacimiento  Nivel Rol


  
    
  
 public Usuario(){
     
 }   
    
 public Usuario(int IDUsario, String Nombre, String Apellido, String Nickname, String Contrasena, String Correo, Date Fecha_nacimiento, int Nivel, int Rol){
     
     this.IDUsario=IDUsario;
     this.Nombre=Nombre;
     this.Apellido=Apellido;
     this.Nickname=Nickname;
     this.Contrasena=Contrasena;
     this.Correo=Correo;
     this.Fecha_nacimiento=Fecha_nacimiento;
     this.Nivel=Nivel;
     this.Rol=Rol;
    
}   

    public int getIDUsario() {
        return IDUsario;
    }

    public void setIDUsario(int IDUsario) {
        this.IDUsario = IDUsario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getRol() {
        return Rol;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }
    
    
    public String toString(){
       return "Usuario{ "+" IDUsuario = "+ IDUsario +
               ", Nombre =" + Nombre +
               ", Apellido =" + Apellido +
               ", Nickname =" + Nickname +
               ", Contrasena =" + Contrasena +
               ", Correo =" + Correo +
               ", Fecha_nacimiento =" +Fecha_nacimiento +
               ", Nivel =" +Nivel +
               ", Rol ="+ Rol +"}";
        
        
    }
 
 
}
