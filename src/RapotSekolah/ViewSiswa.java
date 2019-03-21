/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RapotSekolah;

import RapotSekolah.Siswa;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Acer
 */
public class ViewSiswa {

    Scanner input = new Scanner(System.in);
    public static Vector<Siswa> vSiswa = new Vector();

    String nama;
    String matkul;
    Integer nTugas;
    Integer nUjian;
    Integer nAkhir;

    public void ViewData(){
//        Siswa siswa = new Siswa();
//        siswa.toString();
        
         if (vSiswa.size() <= 0) {
            System.out.println("No Data Yet.");
        } else {
            for (int i = 0; i < vSiswa.size(); i++) {
//                if (vSiswa.get(i).getNama().contains(nama)) {
//                    
                System.out.println("No.               " + (i + 1));
                System.out.println("Nama              " + vSiswa.get(i).getNama());
                System.out.println("Mata Kuliah       " + vSiswa.get(i).getMatkul());
                System.out.println("Nilai Tugas       " + vSiswa.get(i).getnTugas());
                System.out.println("Nilai Ujian       " + vSiswa.get(i).getnUjian());
                System.out.println("Nilai Akhir       " + vSiswa.get(i).getnAkhir());
            }
//                else{
//                System.out.println("Data not found!");
//            }
//            }

//        }while(nama.length() < 3 || nama.length() > 15);
//            
//        } catch (Exception e) {
//           System.out.println("Data Null");
//        }
        }
        }

   

    public ViewSiswa() {
//        System.out.println("Search Data [Name]: ");
//        input.nextLine();

//        try {
//        do{
//            System.out.println("Search Data [Name]: ");
//            nama = input.nextLine();
//            
//        if (vSiswa.size() <= 0) {
//            System.out.println("No Data Yet.");
//        } else {
//            for (int i = 0; i < vSiswa.size(); i++) {
////                if (vSiswa.get(i).getNama().contains(nama)) {
////                    
//                System.out.println("No.               " + (i + 1));
//                System.out.println("Nama              " + vSiswa.get(i).getNama());
//                System.out.println("Mata Kuliah       " + vSiswa.get(i).getMatkul());
//                System.out.println("Nilai Tugas       " + vSiswa.get(i).getnTugas());
//                System.out.println("Nilai Ujian       " + vSiswa.get(i).getnUjian());
//                System.out.println("Nilai Akhir       " + vSiswa.get(i).getnAkhir());
//            }
////                else{
////                System.out.println("Data not found!");
////            }
////            }
//
////        }while(nama.length() < 3 || nama.length() > 15);
////            
////        } catch (Exception e) {
////           System.out.println("Data Null");
////        }
//        }
//        }
    }
    }
