
package EjerciciosEncapsulamientoHerencia;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Eje2FacturaElectronica {
    public static void main(String[] args) {
        double consumomes, consumodiario, valorFactura;
        NumberFormat formato = new DecimalFormat("#0.00");
      Scanner leer = new Scanner(System.in);
      FacturaElectronicaMetodos fact = new FacturaElectronicaMetodos();
      
        System.out.println("Ingrese la lectura Actual: ");
        fact.setLecturaAct(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Ingrese la lectura anterior: ");
        fact.setLecturaAnt(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Ingrese el multiplicador: ");
        fact.setMultiplicador(Integer.parseInt(leer.nextLine()));
        
        
        
        consumomes = fact.calConsumoMes(fact);
        consumodiario = fact.calcConsumoDiario(fact);
        valorFactura = fact.valorFact(fact);
        
        System.out.println("\n IMPRESION DE DATOS");
        System.out.println("Consumo mensal: " + consumomes + "kWh");
        System.out.println("consumo diario: " + formato.format(consumodiario) + "kWh");
        System.out.println("Factura: " + valorFactura + "$");
        System.out.println("Dias de facturación:  30");
            
        
    }
}
