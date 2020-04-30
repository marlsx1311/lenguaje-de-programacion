
package Controlador;

import java.sql.Connection;
import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;


public class LogicaUsuario {
    ArrayList <Usuario> ListaUsuarios = new ArrayList<>();
    private Connection katsu= null;
    private PreparedStatement sentencias;
    private ResultSet rs;
    private Usuario usuario; // para relacionar la clase logica(controlador) con la clase Usuario (Modelo)
            
    public ArrayList<Usuario> obtenerListaUsuarios(){
        return ListaUsuarios;
    }
    // logica iniciar sesion
    
    public Usuario iniciaSesion (String user, String pass){
        try{
            katsu= Conexion.getConnection();
            sentencias = katsu.prepareStatement("select * from COCINA.usuario where  Nickname= ? and Contrasena= ?");
            sentencias.setString(1, user);
            sentencias.setString(2, pass);
            rs = sentencias.executeQuery(); // ejecuto en la base de datos
            
            if ( rs != null){
                while(rs.next()){
                    usuario = new Usuario();
                    usuario.setIDUsario(rs.getInt(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setApellido(rs.getString(3));
                    usuario.setNickname(rs.getString(4));
                    usuario.setContrasena(rs.getString(5));
                    usuario.setCorreo(rs.getString(6));
                    usuario.setFecha_nacimiento(rs.getDate(7));
                    usuario.setNivel(rs.getInt(8));
                    usuario.setRol(rs.getInt(9));
                    
                    ListaUsuarios.add(usuario); // en mi lista queda cargada toda la informacion
                    
                }
            }
            
            
               return usuario;     
                    
            }catch (Exception e){
            System.out.println("error en la consulta de la base de datos: "+ e.getMessage());
        }
        return null;
    }
}
