/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoSl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Acer
 */
public class Toko {

    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader getRead = new BufferedReader(input);
    ArrayList<Produk> daftarProduk = new ArrayList<Produk>();
    ArrayList<Pelanggan> daftarPelanggan = new ArrayList<Pelanggan>();
    ArrayList<Transaksi> daftarTransaksi = new ArrayList<Transaksi>();

    public Toko() throws Exception {
        menu();
    }

    void menu() throws Exception {
        int pilih = 0;
        Scanner in = new Scanner(System.in);
        Pelanggan p = new Pelanggan();
        Produk pa = new Produk();
        do {
            System.out.print("Menu\n" + "1. Produk\n" + "2. Pelanggan\n" + "3. Transaksi\n" + "Input\n >> ");
            pilih = Integer.parseInt(getRead.readLine());

            switch (pilih) {
                case 1: {
                    pa.menuProduk(in);
                    menu();
                    break;
                }
                case 2: {

                    p.menuPelanggan(in);
                    menu();
                    break;
                }
                case 3: {

                    break;
                }
                default:
                    break;
            }
        } while (pilih != 4);
    }

    public static void main(String[] args) throws Exception {
        new Toko();
    }
}
