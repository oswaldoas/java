import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    System.out.println("Hola Mundo");
    
    String nombre;
    int a,b,c;
    
    nombre = "Oswaldo Sanchez";
    byte edad=25;
    long nGrande=464566666655585L;
    float nDecimal=3.5F;
    double dDecimal=3.6;
    char palabra='A';
    boolean logico= true;
    
    /**************
    Obejto*/
    
    String onombre="Oswaldo Sanchez";
    
    a=1;
    b=2;
    c=3;
   
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu Edad es: "+edad);
        System.out.println("Numero a: "+a);
        System.out.println("Numero b: "+b);
        System.out.println("Numero c: "+c);
        System.out.println("LA SUMA ES:"+(a+b+c));
        System.out.println("numero Grande:"+nGrande);
        System.out.println("numero float:"+nDecimal);
        System.out.println("numero double:"+dDecimal);
        System.out.println("variable char:"+palabra);
        System.out.println("variable boolean:"+logico);
        System.out.println("cadenaa:"+onombre);
      //Nueva forma de difinir las variables
        var primern = "Oswaldo";
        var sedad = edad;
        System.out.println("usando var "+primern+"  "+sedad);
        
        /******* operadores /asignacion *******/
        int na=50;
        int nb=6;
        int nc=5; 
        //a = a+5;
        na+=5;
        System.out.println("variable de asignacion:"+na);
        /******* operadore relacionales *******/
        
        int oa=5;
        int ob=6;
                System.out.println(oa==ob);
                System.out.println(oa<=ob);
                System.out.println(oa!=ob);
                System.out.println(!(oa==ob && oa<ob));
                
      /******* operadore incrementar *******/                
          /***post incremento**/
          oa++;
          oa++;
          oa++;          
          oa++;
          System.out.println("incremeto"+oa);
          /***pre incremento**/
          ++oa;
          ++oa;
          ++oa;          
          ++oa;

          System.out.println(oa);
          //**********************//
          /*Objeto de la clase Scanner*/
          /****************************/
          Scanner leer = new Scanner(System.in);
          
          System.out.print("Introduzca el nombre:");
          String vnombre = leer.nextLine();
          //tem.out.println("Nombre es:"+vnombre);
          
          System.out.print("Introduzca tu edad");
          int vedad = leer.nextByte();
          //System.out.println("Nombre es:"+vedad);

          System.out.print("Introduzca un caracter");
          char vcarater = leer.next().charAt(0);/*por indice de la cadena de caratceres*/
          //System.out.println("Nombre es:"+vcarater);
          System.out.printf("Su Nombre es:%s Edad:%d", vnombre,vedad);
          System.out.println("");
                 
          /* estructura de control */       
                if (true){
                    System.out.println("paso por el if");
                }else{
                    System.out.println("paso por el else");
                }
         }
       }

