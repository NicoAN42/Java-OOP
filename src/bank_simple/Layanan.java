/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_simple;

/**
 *
 * @author Acer
 */
public class Layanan {

    protected long saldo;
    protected double bunga;

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public double getBunga() {
        return bunga;
    }

    public void tarik(long nominal) {
        saldo -= nominal;
    }

    public void setor(long nominal) {
        saldo += nominal;
    }
    
    public long calcBunga(){
        return (long)((bunga/100)/12.0*saldo);
    }

}
