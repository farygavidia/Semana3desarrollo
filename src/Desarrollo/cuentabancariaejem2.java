
package Desarrollo;

public class cuentabancariaejem2 {
    
    long numerodecuenta;
    clienteEjem2 propietariocuenta;
    double saldocuenta;
   
   

    
    public void abonar (double cantidad){
         saldocuenta += cantidad;
         
    }
    
    public void retirar (double cantidad){
        if (cantidad > saldocuenta){
           System.out.println("saldo insuficiente");
        }
        saldocuenta -= cantidad;
    }
      public String datospropietariocuenta(){
          String informacion = "";
          informacion += "DUI:" + propietariocuenta.duicliente + "\n";
          informacion += "nombre:" + propietariocuenta.nombrecliente + "\n";
          informacion += "teléfono:" + propietariocuenta.teléfonocliente + "\n";
          return informacion;
        
      }

}
