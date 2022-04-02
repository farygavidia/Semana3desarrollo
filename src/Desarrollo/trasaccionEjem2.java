
package Desarrollo;

import java.util.Scanner;

public class trasaccionEjem2 {
    
    public static void main(String[] args) {
       cuentabancariaejem2 cuenta = new cuentabancariaejem2();
        Scanner leer = new Scanner(System.in);
        
        String duicliente, nombrecliente;
        long telefonocliente = 0;
        double abono, retiro;
        
        System.out.println("ingrese los datos que se le solicitan acontinuacion");
        System.out.println("nombre del propietario");
        duicliente=leer.nextLine();
        
        System.out.println("numero de DUI");
        nombrecliente=leer.nextLine();
        
        System.out.println("telefono");
        telefonocliente =leer.nextLong();
      
        
        clienteEjem2 propietario = new clienteEjem2(duicliente, nombrecliente, telefonocliente);
        cuenta.propietariocuenta = propietario;
        
        System.out.println("ingrsar la cantidad a abonar");
        cuenta.abonar(abono=leer.nextDouble());
        
        System.out.println("ingrsar la cantidad a retirar");
        cuenta.abonar(abono=leer.nextDouble());
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");        
        System.out.println("su saldo de la cuenta es " + cuenta.saldocuenta);
        
        System.out.println("datos del proietrario: \n" + cuenta.datospropietariocuenta());
        }
}
