///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package tokoSl;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.*;
//
///**
// *
// * @author Acer
// */
//public class Toko_2 {
//
////    InputStreamReader input = new InputStreamReader(System.in);
////    BufferedReader getRead = new BufferedReader(input);
//    ArrayList<Produk> daftarProduk = new ArrayList<Produk>();
//    ArrayList<Pelanggan> daftarPelanggan = new ArrayList<Pelanggan>();
//    ArrayList<Transaksi> daftarTransaksi = new ArrayList<Transaksi>();
//
//    public Toko_2() {
//        menu();
//    }
//
//    void menu(){
//        int pilih = 0;
//        Scanner in = new Scanner(System.in);
//        do {
//            try{
//            System.out.print("Menu\n" + "1. Produk\n" + "2. Pelanggan\n" + "3. Transaksi\n" + "Input\n >> ");
//            pilih = in.nextInt();
//            }catch(Exception e){
//                pilih = 0;
//                in.nextInt();
//            }
//           
//            switch (pilih) {
//                case 1: {
//                    Pelanggan p = new Pelanggan();
////                    p.baca();
//                    daftarPelanggan.add(p);
//                    menu();
//                    break;
//                }
//                case 2: {
//
//                    break;
//                }
//                case 3: {
//
//                    break;
//                }default: break;
//            }
//        } while (pilih != 4);
//        in.close();
//    }
//
//    void menuProduk(){
//        
//    }
//    
//    public static void main(String[] args){
////        new menu();
////        new Toko_2();
//        Toko_2 t = new Toko_2();
//        
//
//    }
//}
