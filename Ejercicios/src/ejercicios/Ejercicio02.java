/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena;
        int contador = 0;
        int contador2 = 0;
        String reporte = "";

        System.out.println("Ingrese la frase");
        cadena = entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
           
            char v = cadena.charAt(i);
            int numerico = (int)v;
            
            if ((numerico >= 65) && (numerico<=90)){
                contador =  contador + 1;
                 
            }else{
                if((numerico>= 97) && (numerico<= 122)){
                    contador2 = contador2 + 1;
                    
                    
                }
            }

        }
        
        System.out.printf("La frase es: %s\nLetras mayusculas: %s\n"
                + "Letras minusculas: %s\n",cadena,contador,contador2);
            

            
        }

    }
