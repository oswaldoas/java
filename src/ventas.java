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
public class ventas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b;
        double impuesto;
        System.out.print("Introduzca la Venya de un Producto:");
        a= leer.nextInt();
        impuesto = (a*12)/100;
        System.out.printf("El Impuesto de1 Producto: %f",impuesto);
        System.out.println("\n");
        System.out.printf("El Total: %f",a+impuesto);
        
    }
}
