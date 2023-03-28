/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_guia3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_2_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        
        System.out.println("ingrese una frase");
        texto = leer.next();
        if(texto.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
