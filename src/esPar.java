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
public class esPar {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num;
        
        System.out.printf("Introduzca Un numero:");
        num = leer.nextInt();
        if (num > 0){
                if (num % 2 == 0){
                    System.out.printf("El numero es par:%d",num);
                }else{
                    System.out.printf("El numero no es par:%d",num);
                }
        }else{ if (num==0){ System.out.println("El numero es neutro");}
              else{ System.out.printf("No se puede realizar la operacion con ese numero:%d \n",num);
                  }

        }
    }
}
