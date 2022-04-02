
package Desarrollo;

public class estudianteEjem1 {
     long carnet;
    String nombre, apellido;       
    
    public static void main(String[] args) {
       
        estudianteEjem est = new estudianteEjem();//el objeto est es la instancia de la clase estudiante
        est.carnet = 1234;
        est.nombre = "Amelia";
        est.apellido = "Rosales";
        
        est.registroestuadiante();
        est.consultarestudiante();
        est.eliminarestuadiante();
        
   
        
        
        System.out.println("carnet : " + est.carnet);
        System.out.println("nombre : " + est.nombre);
        System.out.println("apellido : " + est.apellido);
        
       
        }

}
