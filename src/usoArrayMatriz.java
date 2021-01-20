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
public class usoArrayMatriz {
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int  n = 0,j = 0;
            int datos[];  
            String cadena;
            
            System.out.print("Introduzca la lista de numero:");
             cadena = leer.nextLine();
             j = String.valueOf(cadena).length();
             datos = new int[j];
             
            
           
            for (byte m =0; m < j; m++) {
                 datos[m]= Integer.parseInt(cadena.substring(m,m+1));
                 //System.out.printf("m =%d \n",datos[m]);
               }
            while (n<j){ 
                 System.out.printf("m =%d \n",datos[n]); 
                 n++;
           } 
            /****** para copiar un arreglo ya declarado*/
            for(Integer numeros:datos){
                 System.out.println(numeros); 
            }
            /*************************************/
        }
}
