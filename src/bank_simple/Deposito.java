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
public class Deposito extends Layanan{
    private int jangkaWaktu;
    private Date tanggalBuka;

    public Deposito(int jangkaWaktu, Date tanggalBuka) {
        this.jangkaWaktu = jangkaWaktu;
        this.tanggalBuka = tanggalBuka;
    }

    public int getJangkaWaktu() {
        return jangkaWaktu;
    }
    
    public Date getTanggalBuka() {
        return tanggalBuka;
    }

    
}
