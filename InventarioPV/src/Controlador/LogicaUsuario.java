
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
            sentencias = katsu.prepareStatement("select * from tim.usuarios where  Usuario= ? and Contrasenna= ?");
            sentencias.setString(1, user);
            sentencias.setString(2, pass);
            rs = sentencias.executeQuery(); // ejecuto en la base de datos
            
            if ( rs != null){
                while(rs.next()){
                    usuario = new Usuario(); 
                    usuario.setNombre(rs.getString(1));
                    usuario.setCorreo(rs.getString(2));
                    usuario.setCedula(rs.getString(3));
                    usuario.setCargo(rs.getString(4));
                    usuario.setTelefono(rs.getString(5));
                    usuario.setUsuario(rs.getString(6));
                    usuario.setContrasenna(rs.getString(7));
                    
                    
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
