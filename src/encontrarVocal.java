/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OSWALDOAS
 */
import java.util.Scanner;
public class encontrarVocal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.printf("Introduzca el Caracter:");
        char c = leer.next().charAt(0); 
                
                if (c == 'a' || c == 'A' ){
                    System.out.printf("El Caracter es una vocal:%c",c);
                }else if (c == 'e' || c == 'E' ){
                    System.out.printf("El Caracter es una vocal:%c",c);
                }else if (c == 'i' || c == 'I' ){
                    System.out.printf("El Caracter es una vocal:%c",c);
                }else if (c == 'o' || c == 'O' ){
                    System.out.printf("El Caracter es una vocal:%c",c);
                }else if (c == 'u' || c == 'U' ){
                    System.out.printf("El Caracter es una vocal:%c",c);
                }else{System.out.printf("El Caracter No es Vocal:%c",c);}    
    }
    
}
