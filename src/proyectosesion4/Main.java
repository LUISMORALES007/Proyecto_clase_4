
 
package proyectosesion4;

/**
 * Ejercicio Clase 4
 * @author Luis Miguel Morales Sandoval
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner opcion = new Scanner (System.in); 
        int seleccion;
        
        
        do{
        
        System.out.println("Ejercicio Clase # 4 Programacion2");
        System.out.println("");
        System.out.println("Digite el numero correspondiente al ejercicio que desea visualizar");
        System.out.println("");
        System.out.println("1.Calcular porcentaje de estudiantes.");
        System.out.println("2.Numero de horas.");
        System.out.println("3.Calculo del area de circulo.");
        System.out.println("4.Ecuacion de segundo grado");
        System.out.println("5.Salir.");
        System.out.println("");
        
               seleccion = opcion.nextInt();
               
            
               switch (seleccion){
        
                   case 1 :
                       
                          ejercicio1();
                       
                          
                             break;
                       
                    case 2 :
                       
                      
                       
                       
                       
                       ejercicio2();
                       
                       
                       
                       
                       
                              break;
                     case 3 :
                       
                     
                       ejercicio3();
                       
                       
                       
                       
                       
                              break;
                              
                              
                     case 4 :
                       
                       
                       
                       ejercicio4();
                       
                       
                       
                       
                       
                              break;         
        
                    case 5 :
                       
                       System.out.println("Gracias por utilizar este programa..."); 
                       System.exit(0);
                       
                       break;
                    
                       
                    default:
                        
                            System.out.println("Opcion invalida , Digite un numero de 1 a 5");
                }
        
        
           }while  (seleccion!=5);
               
               
      }
    
  
    
             public static void ejercicio1(){
             
                 
                       int estudiantes= 240;
                       int menores =35;
                       double porcentaje;
                       
                       System.out.println("Ejercio1"); 
                       System.out.println("..........................................");
                       System.out.println("La cantidad de estudiantes es   " + estudiantes +".");
                       System.out.println("La cantidad de menores es  " + menores +".");
                       System.out.println("");
                       
                       porcentaje = (menores * 100)/estudiantes; 
                       
                       System.out.println(".................................................");
                       System.out.println("El porcentaje de menores de edad es:" + porcentaje +"%. ");
                       System.out.println(".................................................");
                       
                               
           
           
           
           

         }
    
            public static void ejercicio2(){

           
             System.out.println("Ejercio2"); 
             
             float n_horas=1000;
             float calculo_semana ;
             float calculo_dia;
             float calculo_hora;
              
              calculo_semana= n_horas/168;
              
                   String str = String.valueOf(calculo_semana); // en esta linea se separa el decimal del entero para hacer calculos

                  int intNumber = Integer.parseInt(str.substring(0, str.indexOf('.')));//busca dentro de la subcadena  el decimal
                  float decNumbert = Float.parseFloat(str.substring(str.indexOf('.')));
             
         
                
                 calculo_dia = decNumbert*7;
                
                  String strn = String.valueOf(decNumbert); // en esta linea se separa el decimal del entero para hacer calculos

                  int intNumber1 = Integer.parseInt(str.substring(0, str.indexOf('.')));//busca dentro de la subcadena  el decimal
                  float decNumbert1 = Float.parseFloat(str.substring(str.indexOf('.')));
                  
                  
                  calculo_hora=decNumbert1*24;
             
                System.out.println("El numero de horas es: "+n_horas);
                System.out.println("");
                System.out.println("................................");
                System.out.println("Equivalen a: ");
                System.out.println( +intNumber +" Semanas.");
                System.out.println(+ (intNumber1+1) +" Dias.");
                System.out.println(+calculo_hora+"  Horas");
                
          }
            
            
           public static void ejercicio3(){
          
               
               
             System.out.println("Ejercio3"); 
             
             float radio= (float) 20.1;
             float area;
             
             area= (float) (Math.PI*Math.pow(radio, 2));
             
               System.out.println("El radio del circulo es: "+radio);
               System.out.println("...............................");
               System.out.println("El area es:  "+area);
               System.out.println("-------------------------------");
           
           

}  
    
           
    @SuppressWarnings("empty-statement")
       public static void ejercicio4(){

           
           System.out.println("Ejercio4"); 
           
           int a= 10;
           int b=7;
           int c= 4;
           float resultado ;
           System.out.println("Los coeficientes son los siguientes:");
           System.out.println("a = "+a);
           System.out.println("b=" +b);
           System.out.println("c=" +c);
           System.out.println("");
           System.out.println("----------------------------------");
           resultado = (float) (Math.pow(b,2)-4*a*c);;
           
               if(a!=0){
              
                if(resultado<0){
                System.out.println("Se realizo la operacion y tiene raices imginarias");
          }else{
          double x1=(-b+Math.sqrt(resultado))/(2*a);
          double x2=(-b-Math.sqrt(resultado))/(2*a);
          System.out.println("El resultado de la operacion fue X1 = "+x1+" X2 = "+x2);
        }
      }else{
      System.out.println("El coeficiente cuadratico debe ser diferente de 0");
      } 
           
         
           
           
           
           
           

}     
            
     
    
}
