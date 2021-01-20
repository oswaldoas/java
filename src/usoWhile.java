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
public class usoWhile {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        
        
            System.out.printf("Introduzca el numero de iteraciones:");
            byte c = leer.nextByte();
            String dia = null;
            
            while (c>=0){
            System.out.printf("Iteraccion:%d \n",c);
            c--;
            }
        }
}
