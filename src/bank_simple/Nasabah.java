/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_simple;

import java.util.Vector;

/**
 *
 * @author Acer
 */
public class Nasabah {
    private String nama;
    private String nik;
    private Date tanggalLahir;
    private Vector<Layanan>tLayanan = new Vector();

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Nasabah(String nama, String nik, Date tanggalLahir) {
        this.nama = nama;
        this.nik = nik;
        this.tanggalLahir = tanggalLahir;
    }

    public Vector<Layanan> gettLayanan() {
        return tLayanan;
    }
    
    
}
