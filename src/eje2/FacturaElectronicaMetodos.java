
package EjerciciosEncapsulamientoHerencia;

public class FacturaElectronicaMetodos {
    int nCuenta, lecturaAct, lecturaAnt, multiplicador;
    double ValorFactura, consumoDiario, consumoMensual;

    public FacturaElectronicaMetodos() {
    }

    public FacturaElectronicaMetodos(int nCuenta, int lecturaAct, int lecturaAnt, int multiplicador, double ValorFactura, double consumoDiario, double consumoMensual) {
        this.nCuenta = nCuenta;
        this.lecturaAct = lecturaAct;
        this.lecturaAnt = lecturaAnt;
        this.multiplicador = multiplicador;
        this.ValorFactura = ValorFactura;
        this.consumoDiario = consumoDiario;
        this.consumoMensual = consumoMensual;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public int getLecturaAct() {
        return lecturaAct;
    }

    public void setLecturaAct(int lecturaAct) {
        this.lecturaAct = lecturaAct;
    }

    public int getLecturaAnt() {
        return lecturaAnt;
    }

    public void setLecturaAnt(int lecturaAnt) {
        this.lecturaAnt = lecturaAnt;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getValorFactura() {
        return ValorFactura;
    }

    public void setValorFactura(double ValorFactura) {
        this.ValorFactura = ValorFactura;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public double getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual(double consumoMensual) {
        this.consumoMensual = consumoMensual;
    }

   
    
    
    
    public double calConsumoMes(FacturaElectronicaMetodos e ){
    double consumomes = 0;
    consumomes = (e.lecturaAct - e.lecturaAnt) * e.multiplicador;
    e.consumoMensual += consumomes;
    return consumomes;
    }
    
    public double calcConsumoDiario(FacturaElectronicaMetodos e){
        double consumodiario = 0;
        consumodiario = e.consumoMensual / 30;
        return consumodiario;
    }
    
    public double valorFact (FacturaElectronicaMetodos e){
    double valFactura;
    valFactura = e.consumoMensual * 0.20;
    return valFactura;
    }
    
    
}
