/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Acer
 */
public class Nasabah {
 
    private String nama = "Nico Ardian";
    private Integer uang = 1000000;
    private Integer noKtp = 220187780;

    @Override
    public String toString() {
        return "Nasabah{" + "nama=" + nama + ", uang=" + uang + ", noKtp=" + noKtp + '}';
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String newValue) {
        nama = newValue;
    }

    public Integer getUang() {
        return uang;
    }

    public void setUang(int newValue) {
        uang = newValue;
    }
    
    
    public Integer getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(int newValue) {
        noKtp = newValue;
    }
    
    
    public Nasabah(String nama, Integer uang, Integer noKtp) {
        this.nama = nama;
        this.uang = uang;
        this.noKtp = noKtp;
    }
    
    public Nasabah(){
        
    }

   
    
    

}
