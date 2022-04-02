
package ejercicio3;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTablet {
    private static String nombre;
    
    public static void main(String[] args) {
        int estudiantes  = 5; 
     
        Scanner leer= new Scanner(System.in);
     HashTablet name =new HashTablet();
     HashTablet ncarnet =new HashTablet();
     HashTablet codigoC =new HashTablet();
        Hashtable <String,String> estudiante = new Hashtable <String,String>();
    ejercicio3 objeto = new ejercicio3();
        for (int i = 1; i <=2; i++) {
             
            System.out.println("Ingrese el nombre del estudiante : "+i);
            String nombre;nombre =leer.nextLine(); 
            estudiante.put("a" +i,String.valueOf(nombre));
      
            System.out.println("Ingrese el carnet del estudiante : "+i);
             objeto.setCarnet(Integer.parseInt(leer.nextLine())); 
            estudiante.put("b" +i,String.valueOf(objeto.carnet));
           
           System.out.println("Ingrese el codigo de carrera del estudiante : "+i);
             objeto.setCodigoCarrera(Integer.parseInt(leer.nextLine()));
            estudiante.put("c" +i,String.valueOf(objeto.codigoCarrera));
   
         
    }
       
             System.out.println("Nombre :"+nombre);
             System.out.println("Carnet :"+objeto.getCarnet());
             System.out.println("Codigo de Carrera :"+objeto.getCodigoCarrera());
        }
    }
  
