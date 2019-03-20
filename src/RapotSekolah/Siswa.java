/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RapotSekolah;

import java.util.Vector;

/**
 *
 * @author Acer
 */
public class Siswa extends Account{

    Vector<Siswa> vSiswa = new Vector();

    protected String nama;
    protected String matkul;
    protected Integer nTugas;
    protected Integer nUjian;
    protected Integer nAkhir;

    
    public Siswa(){
        
    }

    public Siswa(String nama, String matkul, Integer nTugas, Integer nUjian, Integer nAkhir) {
        this.nama = nama;
        this.matkul = matkul;
        this.nTugas = nTugas;
        this.nUjian = nUjian;
        this.nAkhir = nAkhir; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public void setnTugas(Integer nTugas) {
        this.nTugas = nTugas;
    }

    public void setnUjian(Integer nUjian) {
        this.nUjian = nUjian;
    }

    public void setnAkhir(Integer nAkhir) {
        this.nAkhir = nAkhir;
    }
    
    
    

    public String getNama() {
        return nama;
    }

    public String getMatkul() {
        return matkul;
    }

    public Integer getnTugas() {
        return nTugas;
    }

    public Integer getnUjian() {
        return nUjian;
    }

    public Integer getnAkhir() {
        return nAkhir;
    }

    @Override
    public String toString() {
        return "Siswa{" + "nama=" + nama + ", matkul=" + matkul + ", nTugas=" + nTugas + ", nUjian=" + nUjian + ", nAkhir=" + nAkhir + '}';
    }
    
    
    
    
}
