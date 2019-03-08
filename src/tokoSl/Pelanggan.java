/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoSl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Acer
 */
public class Pelanggan {

    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader getRead = new BufferedReader(input);
    ArrayList<Produk> daftarProduk = new ArrayList<Produk>();
    ArrayList<Pelanggan> daftarPelanggan = new ArrayList<Pelanggan>();
    ArrayList<Transaksi> daftarTransaksi = new ArrayList<Transaksi>();
    String nama;
    String noHp;
    String alamat;

    public Pelanggan() {
        nama = "";
        noHp = "";
        alamat = "";

    }

    void lihat() {
        System.out.printf("%20s | %13s | %20s\n", nama, noHp, alamat);
    }

    static void lihatPelanggan(ArrayList<Pelanggan> daftarPelanggan) {
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Tidak ada Data");
            return;
        } else {
            System.out.printf("%10s | %13s | %20s\n", "Nama", "No Hp", "Alamat");
        }
        for (Pelanggan p : daftarPelanggan) {
            p.lihat();
        }
    }

    void menuPelanggan(Scanner in) throws Exception {
        int pilih = 0;
        do {
            System.out.print("Menu Produk\n" + "1. Tambah Pelanggan\n" + "2. View Pelanggan\n" + "3. Edit Pelanggan\n" + "4. Hapus Pelanggan\n" + "5. Exit\n" + ">> ");
            pilih = Integer.parseInt(getRead.readLine());
            switch (pilih) {
                case 1: {
                    Pelanggan p = new Pelanggan();
                    tambahPelanggan();
                    daftarPelanggan.add(p); //To change body of generated methods, choose Tools | Templates.
                    break;
                }
                case 2: {
                    lihatPelanggan(daftarPelanggan);
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                default:
                    break;
            }
        } while (pilih != 5);
    }

    void tambahPelanggan() throws Exception {
        Pelanggan p = new Pelanggan();
        do {
            System.out.println("Masukkan Nama [3..50]: ");
            p.nama = getRead.readLine();
        } while (p.nama.length() < 3 || p.nama.length() > 50);
        do {
            System.out.println("Masukkan No Hp [6..12]: ");
            p.noHp = getRead.readLine();
        } while (p.noHp.length() < 6 || p.noHp.length() > 12);

        do {
            System.out.println("Masukkan Alamat [15..50]: ");
            p.alamat = getRead.readLine();
        } while (p.alamat.length() < 0 || p.alamat.length() > 50);
        daftarPelanggan.add(p);
    }
}
