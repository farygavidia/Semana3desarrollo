
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
          objeto.setNombre(leer.nextLine()); 
            estudiante.put("a" +i,String.valueOf(nombre));
      
            System.out.println("Ingrese el carnet del estudiante : "+i);
             objeto.setCarnet(Integer.parseInt(leer.nextLine())); 
            estudiante.put("b" +i,String.valueOf(objeto.carnet));
           
           System.out.println("Ingrese el codigo de carrera del estudiante : "+i);
             objeto.setCodigoCarrera(Integer.parseInt(leer.nextLine()));
            estudiante.put("c" +i,String.valueOf(objeto.codigoCarrera));
        }
            for (int j = 1; j <=5; j++) {
             System.out.println("Nombre del estudiante  "+j+":"+objeto.getNombre());
             System.out.println("Carnet del estudiante "+j+":"+objeto.getCarnet());
             System.out.println("Codigo de Carrera del estudiante "+j+":"+objeto.getCodigoCarrera());
    }
        }
    }
  
