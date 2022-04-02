package Demostracion;

import java.util.Scanner;

public class Restudiante {
    
    public static void main(String[] args) {
       String nombre, apellido, info, cualidad;
       int carnet, edad;
       double promedio;
       
    Estudiante objeto = new Estudiante();
    //Estudiante objeto1 = new Estudiante("Javier", "Laínez");
    //Estudiante objeto2 = new Estudiante(23545, "Javier", "Laínez", 19);
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Digite el carnet del estudiante: ");
        objeto.setCarnet(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Digite el nombre del estudiante: ");
        objeto.setNombre(leer.nextLine());
    
        System.out.println("Digite los apellidos del estudiante: ");
        objeto.setApellido(leer.nextLine());
        
        System.out.println("Ingrese la edad del estudiante: ");
        objeto.setEdad(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Digite la nota 1: ");
        objeto.setN1(leer.nextDouble());
        
         System.out.println("Digite la nota 2: ");
        objeto.setN2(leer.nextDouble());
        
         System.out.println("Digite la nota 3: ");
        objeto.setN3(leer.nextDouble());
        
        
        System.out.println("");
        
        //info = objeto.informacion();
       // info = objeto.info1();
        //info = objeto.info2(objeto);
      // info = objeto.info3(192421, "ITCA", "FEPADE", 50);
        info = objeto.info3(objeto.getCarnet(), objeto.getNombre(), objeto.getApellido(), objeto.getEdad());
        promedio = objeto.promedio(objeto);
        cualidad = objeto.cualidad(objeto);
        System.out.println("" + info);
        System.out.println("La nota final es de: " + promedio);
    }
    
}
