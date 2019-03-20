/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RapotSekolah;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Account {

    
    static void clr() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }
    
    public Account() {

    }

    public static void main(String[] args) throws Exception {
        String user;
        String pwd;
        Scanner input = new Scanner(System.in);
        
        do{
            clr();
        System.out.println("+--LOGIN--+");

        System.out.print("| Username |: ");
        user = input.next();

        System.out.print("| Password |: ");
        pwd = input.next();
        System.out.println("+------------------+");
        if (user.equals("Guru") && pwd.equals("guru")) {
            clr();
            System.out.println("=======================");
            System.out.println("= Account Guru  =");
            System.out.println("=======================");
            new Guru();
//            new Account();
        } else if (user.equals("Siswa") && pwd.equals("siswa")) {
            clr();
            System.out.println("=======================");
            System.out.println("= Account Siswa =");
            System.out.println("=======================");
            new ViewSiswa();
            return;
        } else {
            System.out.println("=======================");
            System.out.println("= Login Gagal =");
            System.out.println("=======================");
            new Account();
        }    
        }while(true);
        
    }

}
