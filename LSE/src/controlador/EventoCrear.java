
package controlador;


import modelo.Eventos;
import modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EventoCrear {
    
    ArrayList<Eventos> eventoagenda = new ArrayList<>();
    
    private Connection creacionAgenda = null;
    private PreparedStatement sentencias;
    private ResultSet respuesta;
    private Eventos agenda;
    
    public ArrayList<Eventos> obtenerclientes(){
        return eventoagenda;
    }
    
    public Eventos crearEventos( String nombreProyecto, String fechaMontaje, String fechaActividad, String presentadoPor, String ciudad, String direccion, String fechaElavoracion) {
        try {
            creacionAgenda = Conexion.getConnection();
            sentencias = creacionAgenda.prepareStatement("INSERT INTO Eventos (NombreProyecto, FechaMontaje, FechaActividad, PresentadoPor, Ciudad, Direccion, FechaElaboracion )values  (?,?,?,?,?,?,?)");
            sentencias.setString(1, nombreProyecto);
            sentencias.setString(2, fechaMontaje);
            sentencias.setString(3, fechaActividad);
            sentencias.setString(4, presentadoPor);
            sentencias.setString(5, ciudad);
            sentencias.setString(6, direccion);
            sentencias.setString(7, fechaElavoracion);
            sentencias.executeUpdate();
            
            if (respuesta != null){
                while (respuesta.next()){
                    agenda = new Eventos();
                    
                    agenda.setNombreProyecto(respuesta.getString(1));
                    agenda.setFechaMontaje(respuesta.getString(2));
                    agenda.setFechaActividad(respuesta.getString(3));
                    agenda.setPresentadoPor(respuesta.getString(4));
                    agenda.setCiudad(respuesta.getString(5));
                    agenda.setDireccion(respuesta.getString(6));
                    agenda.setFechaElavoracion(respuesta.getString(7));
                    
                    eventoagenda.add(agenda);
                    
                }
            }
            return agenda;
        }catch (SQLException e){
            System.out.println("Error en la consulta de la base de datos " + e.getMessage());
            
        }
        return null;
    }

    
      
    
    
}
