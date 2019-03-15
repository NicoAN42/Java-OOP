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
public class Tabungan extends Transaksi{
    private Integer uang;
    private Integer tahun;


    @Override
    public String toString() {
        return "Tabungan{" + "uang=" + uang + ", tahun=" + tahun + '}';
    }
    
   
    public Integer getUang() {
        return uang;
    }

    public void setUang(Integer uang) {
        this.uang = uang;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public Tabungan(Integer uang, Integer tahun) {
        this.uang = uang;
        this.tahun = tahun;
    }
    
    public Tabungan(){
        
    }
    
}
