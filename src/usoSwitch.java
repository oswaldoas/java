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
public class usoSwitch {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.printf("Introduzca el numero dia de la Semana:");
        byte c = leer.nextByte();
        String dia = null;
        
            switch (c){
                    case 1 :
                        dia="Lunes";
                        break;
                    case 2:
                        dia="Martes";
                        break;
                    case 3:
                        dia="Miercoles";                      
                        break;
                    case 4:
                        dia="Jueves";
                        break;
                    case 5:
                        dia="Viernes";                        
                        break;                        
                    case 6:
                        dia="Saturday";                        
                        break;
                    case 7:
                        dia="Sunday";                                                
                        break;
                }
                System.out.printf("El dia de la semana:%s \n",dia);
    }
    
}
