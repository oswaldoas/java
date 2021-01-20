
public class crearFuncion {
    public static void main(String[] args) {
        saludar("Oswaldo",40);
        
        sumar(10,40);
       
        var rest = restar (30,15);
        System.out.printf("la Resta es:%d \n",rest);
        
        /******** sobrecarga*******/
        System.out.printf("la Multiplic es:%d \n",multiplicar(4,5));
        System.out.printf("la Multiplic es:%f \n",multiplicar(3.2,1.8));
        /******** sobrecarga*******/
      }
    
    static void sumar(int a, int b){
         var c = a + b;
         System.out.printf("la suma es:%d \n",c);
     }
    static void saludar(String nombre, int edad){
        System.out.println("Hola "+nombre+" Edad es:"+ edad);
    }
    
    static int restar(int a, int b){
         var c = a - b;
         return c;
     }
    /****************** sobrecarga ********/
    static double multiplicar (double a, double b){
         var c = a * b;
         return c;
     }
    static int multiplicar (int a, int b){
         var c = a * b;
         return c;
     }
}
