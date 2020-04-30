
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;

public class EventoBorrar {
    
    private Connection borrarAgenda = null;
    private PreparedStatement sentencias;
   
    public String [] borrarEventoBD(String Idempresa){
        try {

            borrarAgenda = Conexion.getConnection();
            sentencias = borrarAgenda.prepareStatement("DELETE FROM Eventos WHERE Idempresa =  ?");
            sentencias.setString(1, Idempresa);
            sentencias.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());

        }
        return null;
        
    
    }
    
}
