
package Desarrollo;

public class CuentaBancaria {
    private long numCuenta;
    private double cargoCuenta;
    private double abonoCuenta;
    private double saldoCuenta;
    private char estadoCuenta;

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCargoCuenta() {
        return cargoCuenta;
    }

    public void setCargoCuenta(double cargoCuenta) {
        this.cargoCuenta = cargoCuenta;
    }

    public double getAbonoCuenta() {
        return abonoCuenta;
    }

    public void setAbonoCuenta(double abonoCuenta) {
        this.abonoCuenta = abonoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public char getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setSaldoCuenta() {//Se elimina el atributo double saldoCuenta
    //Se escribe la formulka siguiente para el clalculo del saldo
    this.saldoCuenta = saldoCuenta + this.abonoCuenta - this.cargoCuenta;
        this.estadoCuenta = estadoCuenta;
    }

    String getNumDui() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNomCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getTelCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNumDui(long numDui) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNomCliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTelCliente(String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
