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
public class usoFor {
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        
        
            System.out.printf("Introduzca El # de la Tabla de Multiplicar:");
            byte c = leer.nextByte();
            
            
           for (byte m =1; m<=10; m++) {
               System.out.println("Multiplicar: "+c+" por "+m+" = "+c*m);
           } 
    }
}
