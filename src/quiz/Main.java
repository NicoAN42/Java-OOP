/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import quiz.Nasabah;
import quiz.Transaksi;
import quiz.Deposito;
import quiz.Tabungan;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Acer
 */
public class Main {

    Vector<Nasabah> vNasabah = new Vector();
    Scanner scan = new Scanner(System.in);
    String nama;
    Integer uang;
    Nasabah a = new Nasabah();
    Transaksi b = new Transaksi();
    Deposito c = new Deposito();
    Tabungan d = new Tabungan();
    int pilih;

    public Main() {

        int pick;

        b.pilihTransaksi();
        do {
        	pilih = scan.nextInt();
            switch (pilih) {
                case 1: {
                    System.out.println(a.toString());
                    break;
                }

                case 2: {
                    c.setUang(a.getUang());
                    System.out.println("1. 3 Bulan/n 2. 6 Bulan/n 3. 12 Bulan");
                    pick = scan.nextInt();
                    if (pick == 1) {
                        int z = a.getUang() * 6 / 100;
                        System.out.println(z);
                    } else if (pick == 2) {
                        int x = a.getUang() * 8 / 100;
                        System.out.println(x);
                    } else if (pick == 3) {
                        int y = a.getUang() * 10 / 100;
                        System.out.println(y);
                    }
                    break;
                }

                case 3: {
                    c.setUang(a.getUang());
                    System.out.println("Berapa Tahun");
                    pick = scan.nextInt();
                    int v = a.getUang() * pick;
                    
                    System.out.println(v);
                    break;
                }
            }
        
        }while (pilih != 3);
    }

    public static void main(String args[]) {

        new Main();

    }
}
