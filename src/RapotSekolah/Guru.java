/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RapotSekolah;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Acer
 */
public class Guru extends Account{

    Scanner input = new Scanner(System.in);
    public static Vector<Siswa> vSiswa = new Vector();

//    Vector<Siswa> vSiswa;
    String nama;
    String matkul;
    Integer nTugas;
    Integer nUjian;
    Integer nAkhir;

    public void viewGuru(){
        Siswa siswa = new Siswa();
//        new ViewSiswa();
        do {
            System.out.println("Input Nama[3..15 Char]: ");
            nama = input.nextLine();
            siswa.setNama(nama);
        } while (nama.length() < 3 || nama.length() > 15);

        do {
            System.out.println("Input Mata Kuliah[Java | C | Sql]: ");
            matkul = input.nextLine();
        } while (!matkul.equalsIgnoreCase("Java") && !matkul.equalsIgnoreCase("C") && !matkul.equalsIgnoreCase("Sql"));
        if (matkul.equalsIgnoreCase("Java")) {
            siswa.setMatkul("Java");
        } else if (matkul.equalsIgnoreCase("C")) {
            siswa.setMatkul("C");
        } else if (matkul.equalsIgnoreCase("Sql")) {
            siswa.setMatkul("Sql");
        }

        do {
            System.out.println("Input Nilai Tugas[0..100]: ");
            nTugas = input.nextInt();
            siswa.setnTugas(nTugas);
        } while (nTugas < 0 || nTugas > 100);

        do {
            System.out.println("Input Nilai Ujian[0..100]: ");
            nUjian = input.nextInt();
            siswa.setnUjian(nUjian);
        } while (nUjian < 0 || nUjian > 100);

        siswa.setnAkhir((nTugas * 40 / 100) + (nUjian * 60 / 100));

        System.out.println("Nama              " + nama);
        System.out.println("Mata Kuliah       " + matkul);
        System.out.println("Nilai Tugas       " + nTugas);
        System.out.println("Nilai Ujian       " + nUjian);
        System.out.println("Nilai Akhir       " + ((nTugas*40/100)+(nUjian*60/100)));

        System.out.println("Success Add Nilai");
        input.nextLine();
        
        
          
        ViewSiswa.vSiswa.add(siswa);
        
    }
    public Guru() {
        
    }
}
