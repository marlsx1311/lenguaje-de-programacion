/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg1;
import java.util.Scanner;
/**
 *
 * @author Marlon
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float [] numero = new float[6];
    int contador = 0;
    float suma = 0;
    float suma2 = suma;
    
    for(int i = 0;i < 6; ++i){
        Scanner numeroDigitados = new Scanner (System.in);
        System.out.print("ingrese 6 numero:");
        float entradaNum = numeroDigitados.nextFloat();
        if(entradaNum > 0){
            numero[i] = entradaNum;
            contador = contador+1;
            suma = entradaNum ;
            suma2 = suma2 + entradaNum;
        }else{
            
        }
        
    }
    System.out.println("valores positivos son: "+ contador);
    System.out.println("el promedio de los numeros positivo es: " + (suma2/contador));
    }
    
}
