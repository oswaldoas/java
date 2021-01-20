

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
public class arrayMatriz {
    
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            
            int [][]datos = new int[2][3];  

            
            for (byte i =0; i < 2; i++) {
                for (byte j =0; j < 3; j++) {
                    System.out.print("Introduzca la Matriz ["+i+"] ["+j+"]");
                     datos[i][j] = leer.nextInt();
                }
            }
           
            for (byte i =0; i < 2; i++) {
                for (byte j =0; j < 3; j++) {
                    System.out.print("["+datos[i][j]+"]");
                    
                }
                System.out.print("\n");
            }

    }
}



