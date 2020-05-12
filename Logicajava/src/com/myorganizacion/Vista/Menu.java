package com.myorganizacion.Vista;

import com.myorganizacion.Controlador.LogicaPersona;
import com.myorganizacion.Modelo.Persona;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Principal principal;
    public LogicaPersona logicapersona;
    public Scanner lector;

    public Menu(Principal principal) {
        this.principal = principal;
        this.lector = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        int opc = -1;
        do {
            System.out.println("bienvenido al colegio ");
            System.out.println("1 gestion de persona ");
            System.out.println(" 2 gestion de eventos ");
            System.out.println(" 3 salir ");
            opc = lector.nextInt();

            switch (opc) {
                case 1:
                    mostrarSubMenuClientes();

                    break;

                case 2:
                    // mostrarSubMenuEventos();
                    break;

                case 3:
                    opc = 0;
                    System.out.println(" gracias por utilizar el programa");
                    break;
                default:
                    System.out.println(" opcion no valida");
                    break;

            }

        } while (opc != 0);
    }

    public void mostrarSubMenuClientes() {
        int opc = -1;

        do {
            System.out.println("modulo 1 gestionar personas");
            System.out.println("1 registrar estudiantes ");
            System.out.println(" 2 listar estudiantes ");
            System.out.println(" 3 buscar estudiantes ");
             System.out.println(" 4 modificar estudiante ");
            System.out.println(" 5 modificar estudiante ");
            System.out.println(" 6 regresar al menu principal ");
            opc = lector.nextInt();
            switch (opc) {
                case 1:

                    registratEstudiantes();
                    break;

                case 2:
                    listarEstudiantes();
                    break;

                case 3:
                   buscarEstudiantes();
                    break;

                case 4:
                    modificarEstudiantes();
                    break;

                case 5:
                    eliminarEstudiantes ();
                    break;

                case 6:
                    opc = 0;
                    System.out.println("regresando al menu principal");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opc != 0);
    }
    
    
    public void registratEstudiantes(){
        Persona estudiante = new Persona();
        System.out.println("dijite la cedula");
        estudiante.setCedula(lector.nextInt());
        
        System.out.println("dijite la Nombre");
        estudiante.setNombres(lector.next());
        
        System.out.println("dijite la apellido");
        estudiante.setApellido(lector.next());
        
        System.out.println("dijite la edad");
        estudiante.setEdad(lector.nextInt());
        
        if (principal.getLogica().registrarEstudiante(estudiante)){
            System.out.println("estudiante registrado");
        }else{
            System.out.println("estudiante no registrado");
        }
    }
    
    public void listarEstudiantes(){
        List <Persona> estudiante = estudiante = principal.getLogica().listarEstudiantes();
        System.out.println("los estudiants registrados son");
        for (int i = 0; i< estudiante.size();i++){
            System.out.println(estudiante.get(i).toString());
        }
    }
    
    public void buscarEstudiantes(){
        
        System.out.println("ingrese la cedula del estudiante: ");
        int busqueda = lector.nextInt();
        
            System.out.println(principal.getLogica().busquedaEstudiante(busqueda));
        
    }
    
    public void modificarEstudiantes(){
        
        System.out.println("ingrese la cedula del estudiante que desea modificar: ");
        int busqueda = lector.nextInt();
        
        System.out.println("dijite la cedula");
        int cedula = lector.nextInt();
        
        System.out.println("dijite la Nombre");
        String nombre = lector.next();
        
        System.out.println("dijite la apellido");
        String apellido = lector.next();
        
        System.out.println("dijite la edad");
        int edad = lector.nextInt();
        
       if (principal.getLogica().editarEstudiante(busqueda,cedula, nombre, apellido, edad)){
           System.out.println("Cambio realizado");
       }
    }
    
    public void eliminarEstudiantes (){
        System.out.println("ingrese la cedula del estudiante que desea eleminar: ");
        int busqueda = lector.nextInt();
        
       principal.getLogica().borrarEstudiante(busqueda);
    }
}




