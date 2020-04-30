
package Controlador;

public class CrearMascota {
    
    public String [] Crear(String nombre, String raza, String edad, String nombreD, String celularD) {
        
        String[] IngresoDato = new String[5];
        
        IngresoDato[0] = nombre;
        IngresoDato[1] = raza;
        IngresoDato[2] = edad;
        IngresoDato[3] = nombreD;
        IngresoDato[4] = celularD;
        
        return IngresoDato;
        
        
    }
}
