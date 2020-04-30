
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Conexion;

public class EventoModificar {
    
    private Connection modificarEvento = null;
    private PreparedStatement sentencias;
   
    public String [] modificarEventoBD(String nombreProyecto, String fechaMontaje, String fechaActividad, String presentadoPor, String ciudad, String direccion, String fechaElavoracion, String idEmpresa) {
        try {

            modificarEvento = Conexion.getConnection();
            sentencias = modificarEvento.prepareStatement("UPDATE Eventos SET NombreProyecto  = ?, FechaMontaje = ?, FechaActividad = ?, PresentadoPor = ?, Ciudad = ?, Direccion = ?, FechaElaboracion = ? WHERE IdEmpresa = ?");
            sentencias.setString(1, nombreProyecto);
            sentencias.setString(2, fechaMontaje);
            sentencias.setString(3, fechaActividad);
            sentencias.setString(4, presentadoPor);
            sentencias.setString(5, ciudad);
            sentencias.setString(6, direccion);
            sentencias.setString(7, fechaElavoracion);
            sentencias.setString(8, idEmpresa);
            sentencias.executeUpdate();
            
         } catch (SQLException e) {
           
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());

        }
        return null;
        
    
    }
    
}
