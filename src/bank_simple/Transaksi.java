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
public class Transaksi {
    private Date tanggal;
    private long nominal;
    private String status;

    public Transaksi(Date tanggal, long nominal, String status) {
        this.tanggal = tanggal;
        this.nominal = nominal;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public long getNominal() {
        return nominal;
    }

    @Override
    public String toString() {
        return String.format("%s - %10d - %s", tanggal, nominal, status); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStatus() {
        return status;
    }
    
    
    
}
