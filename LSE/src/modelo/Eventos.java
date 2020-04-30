
package modelo;

public class Eventos {

    
    
    private int IdCliente;
    private String NombreProyecto;
    private String FechaMontaje;
    private String FechaActividad;
    private String PresentadoPor;
    private String Ciudad;
    private String Direccion;
    private String FechaElavoracion;
    
    
    public Eventos (int IdCliente,String NombreProyecto, String FechaMontaje, String FechaActividad,
            String PresentadoPor, String Ciudad, String Direccion, String FechaElavoracion){
        
        this.IdCliente = IdCliente;
        this.NombreProyecto = NombreProyecto;
        this.FechaMontaje = FechaMontaje;
        this.FechaActividad = FechaActividad;
        this.PresentadoPor = PresentadoPor;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.FechaElavoracion = FechaElavoracion;
    }
    
    public Eventos(){
        
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreProyecto() {
        return NombreProyecto;
    }

    public void setNombreProyecto(String NombreProyecto) {
        this.NombreProyecto = NombreProyecto;
    }

    public String getFechaMontaje() {
        return FechaMontaje;
    }

    public void setFechaMontaje(String FechaMontaje) {
        this.FechaMontaje = FechaMontaje;
    }

    public String getFechaActividad() {
        return FechaActividad;
    }

    public void setFechaActividad(String FechaActividad) {
        this.FechaActividad = FechaActividad;
    }

    public String getPresentadoPor() {
        return PresentadoPor;
    }

    public void setPresentadoPor(String PresentadoPor) {
        this.PresentadoPor = PresentadoPor;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechaElavoracion() {
        return FechaElavoracion;
    }

    public void setFechaElavoracion(String FechaElavoracion) {
        this.FechaElavoracion = FechaElavoracion;
    }
    
    
    @Override
    public String toString(){
        return "Eventos{ "+",IdECliente = "+IdCliente+
                ", Nombre Proyecto = "+NombreProyecto+", Fecha Montaje = "+FechaMontaje+", Fecha Actividad = "+FechaActividad+
                ",Presentado por = "+PresentadoPor+", Ciudad = "+Ciudad+", Fecha Montaje = "+Direccion+", Direccion = "+FechaElavoracion+"}";
    }
}
