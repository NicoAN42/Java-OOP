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
public class Deposito extends Transaksi{
  
    private Integer uang;
    private Integer bulan;

  

    @Override
    public String toString() {
        return "Deposito{" + "uang=" + uang + ", bulan=" + bulan + '}';
    }

    public Integer getUang() {
        return uang;
    }

    public void setUang(Integer uang) {
        this.uang = uang;
    }

    public Integer getBulan() {
        return bulan;
    }

    public void setBulan(Integer bulan) {
        this.bulan = bulan;
    }

    public Deposito(Integer uang, Integer bulan) {
        this.uang = uang;
        this.bulan = bulan;
    }
    public Deposito(){
        
    }
    
}
