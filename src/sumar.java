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

public class sumar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int a, b;
        System.out.print("Introduzca el Primer Numero:");
        a= leer.nextInt();
        System.out.print("Introduzca el Segundo Numero:");
        b= leer.nextInt();
        System.out.printf("la Suma Total: %d",a+b);
        
    }
}
