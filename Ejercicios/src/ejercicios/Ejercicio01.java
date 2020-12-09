/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author xavierchavez
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        for (int i = 97; i <= 122; i++) {                               
            if ( (i==97) || (i==105) ) { 
                System.out.printf("%s |%d|\n", (char)i, i);
            }
            
        }
    }
    
}
