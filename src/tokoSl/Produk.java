/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoSl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Produk {

    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader getRead = new BufferedReader(input);
    ArrayList<Produk> daftarProduk = new ArrayList<Produk>();
    ArrayList<Pelanggan> daftarPelanggan = new ArrayList<Pelanggan>();
    ArrayList<Transaksi> daftarTransaksi = new ArrayList<Transaksi>();

    String nama;
    int harga;
    int stok;

    public Produk() {
        nama = "";
        harga = 0;
        stok = 0;
    }

    void lihat() {
        System.out.printf("%20s | %6d | %3d\n", nama, harga, stok);
    }

    static void lihatProduk(ArrayList<Produk> daftarProduk) {
        if (daftarProduk.isEmpty()) {
            System.out.println("Tidak ada Data");
            return;
        } else {
            System.out.printf("%10s | %6s | %3s\n", "Nama", "Harga", "Stok");
        }
        for (Produk p : daftarProduk) {
            p.lihat();
        }
    }

    void menuProduk(Scanner in) throws Exception {
        int pilih = 0;
        do {
            System.out.print("Menu Produk\n" + "1. Tambah Produk\n" + "2. View Produk\n" + "3. Edit Produk\n" + "4. Hapus Produk\n" + "5. Exit\n" + ">> ");
            pilih = Integer.parseInt(getRead.readLine());
            switch (pilih) {
                case 1: {
                    Produk p = new Produk();
                    tambahProduk();
                    daftarProduk.add(p);
                    break;
                }
                case 2: {
                    lihatProduk(daftarProduk);
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

    void tambahProduk() throws Exception {
        Produk p = new Produk();
        do {
            System.out.println("Masukkan Nama Produk [3..50]: ");
            p.nama = getRead.readLine();
        } while (p.nama.length() < 3 || p.nama.length() > 50);
        do {
            System.out.println("Masukkan Harga [1..100000]: ");
            p.harga = Integer.parseInt(getRead.readLine());
        } while (p.harga < 1 || p.harga > 100000);
        do {
            System.out.println("Masukkan Stok [1..1000]: ");
            p.stok = Integer.parseInt(getRead.readLine());
        } while (p.stok < 0 || p.stok > 1000);
        daftarProduk.add(p);

    }
}
