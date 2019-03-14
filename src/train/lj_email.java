/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Acer
 */
public class lj_email {
    
    
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String email;
        System.out.println("Input Email: ");
        Pattern ptn = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
        email = a.nextLine();
        Matcher match = ptn.matcher(email);
        if(match.matches()){
            System.out.println("Email Benar.");
        }else{
             System.out.println("Masukkan Email Yang Valid![example@example.com]");
        }
        
    }
}
